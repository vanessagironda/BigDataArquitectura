
CREATE DATABASE retail_db;

USE retail_db;

CREATE EXTERNAL TABLE IF NOT EXISTS categories
(category_id int,
category_department_id string,
category_name string
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
STORED AS TEXTFILE
LOCATION 'hdfs:///user/datapath/datasets/categories';

SELECT * FROM categories;

CREATE EXTERNAL TABLE IF NOT EXISTS customers
(customer_id int,
customer_fname string,
customer_lname string,
customer_email string,
customer_password string,
customer_street string,
customer_city string,
customer_state string,
customer_zipcode string
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
STORED AS TEXTFILE
LOCATION 'hdfs:///user/datapath/datasets/customers';

SELECT * FROM customers ;

CREATE EXTERNAL TABLE IF NOT EXISTS departments
(department_id int,
department_name string
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
STORED AS TEXTFILE
LOCATION 'hdfs:///user/datapath/datasets/departments';

SELECT * FROM departments;

CREATE TABLE IF NOT EXISTS departments_test
(department_id int,
department_name string
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
STORED AS TEXTFILE
LOCATION 'hdfs:///user/datapath/datasets/departments_test';

CREATE EXTERNAL TABLE IF NOT EXISTS order_items
(order_item_id int,
order_item_order_id int,
order_item_product_id int, 
order_item_quantity int, 
order_item_subtotal float,
order_item_product_price float
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
STORED AS TEXTFILE
LOCATION 'hdfs:///user/datapath/datasets/order_items';

SELECT * FROM order_items;

CREATE EXTERNAL TABLE IF NOT EXISTS orders
(order_id int,
order_date string,
order_customer_id int,
order_status string
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
STORED AS TEXTFILE
LOCATION 'hdfs:///user/datapath/datasets/orders';

SELECT * FROM orders;

CREATE EXTERNAL TABLE IF NOT EXISTS products
(product_id int,
product_category_id int,
product_name string,
product_description string,
product_price float,
product_image string
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
STORED AS TEXTFILE
LOCATION 'hdfs:///user/datapath/datasets/products';

SELECT * FROM products;



CREATE EXTERNAL TABLE categories_avro
ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.avro.AvroSerDe'
STORED as AVRO
LOCATION 'hdfs:///user/datapath/datasets/avro/categories'
TBLPROPERTIES ('avro.schema.url'='hdfs:///user/datapath/datasets/avro/categories.avsc');


CREATE EXTERNAL TABLE customers_avro
ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.avro.AvroSerDe'
STORED as AVRO
LOCATION 'hdfs:///user/datapath/datasets/avro/customers'
TBLPROPERTIES ('avro.schema.url'='hdfs:///user/datapath/datasets/avro/customers.avsc');


CREATE EXTERNAL TABLE orders_avro
ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.avro.AvroSerDe'
STORED as AVRO
LOCATION 'hdfs:///user/datapath/datasets/avro/orders'
TBLPROPERTIES ('avro.schema.url'='hdfs:///user/datapath/datasets/avro/orders.avsc');


CREATE EXTERNAL TABLE order_items_avro
ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.avro.AvroSerDe'
STORED as AVRO
LOCATION 'hdfs:///user/datapath/datasets/avro/order_items'
TBLPROPERTIES ('avro.schema.url'='hdfs:///user/datapath/datasets/avro/order_items.avsc');


CREATE EXTERNAL TABLE departments_avro
ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.avro.AvroSerDe'
STORED as AVRO
LOCATION 'hdfs:///user/datapath/datasets/avro/departments'
TBLPROPERTIES ('avro.schema.url'='hdfs:///user/datapath/datasets/avro/departments.avsc');


CREATE EXTERNAL TABLE products_avro
ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.avro.AvroSerDe'
STORED as AVRO
LOCATION 'hdfs:///user/datapath/datasets/avro/products'
TBLPROPERTIES ('avro.schema.url'='hdfs:///user/datapath/datasets/avro/products.avsc');


describe formatted customers;

describe formatted customers_avro;

describe formatted departments_test;

-- Enunciado 1
SELECT
    customer_id, customer_fname, customer_lname, customer_email, sum(order_item_quantity) as quantity_item_total, sum(order_item_subtotal)as total
FROM
    customers_avro as c
INNER JOIN
    orders_avro as o
    ON c.customer_id = o.order_customer_id
INNER JOIN
    order_items_avro as oi
    ON o.order_id = oi.order_item_order_id
WHERE order_status <> 'CANCELED'
GROUP BY customer_id, customer_fname, customer_lname, customer_email
ORDER BY  total DESC
LIMIT 20;

-- Enunciado 2

SELECT
    ca.category_name, sum(order_item_quantity) as item_quantity, cast(sum(order_item_subtotal) AS INT )as total
FROM order_items_avro as oi
INNER JOIN
    products_avro as p
    ON oi.order_item_product_id = p.product_id
INNER JOIN
    categories_avro as ca
    ON p.product_category_id = ca.category_id
GROUP BY ca.category_name;


-- Enunciado 3

SELECT
    customer_city, category_name
FROM (SELECT
    customer_city, category_name, count(category_name) as quantity, DENSE_RANK () OVER ( 
                PARTITION BY customer_city 
                ORDER BY count(category_name) DESC
            ) rank
    FROM
        customers_avro as c
    INNER JOIN
        orders_avro as o
        ON c.customer_id = o.order_customer_id
    INNER JOIN
        order_items_avro as oi
        ON o.order_id = oi.order_item_order_id
    INNER JOIN
        products_avro as p
        ON oi.order_item_product_id = p.product_id
    INNER JOIN
        categories_avro as ca
        ON p.product_category_id = ca.category_id
    GROUP BY customer_city, category_name
    ) t
WHERE rank = 1;

-- Enunciado 4

SELECT
    customer_city, product_name, quantity, total
FROM (SELECT
    customer_city, product_name,sum(order_item_quantity) as quantity,sum(order_item_subtotal) as total, DENSE_RANK () OVER ( 
                PARTITION BY customer_city 
                ORDER BY sum(order_item_quantity) DESC
            ) rank
    FROM
        customers as c
    INNER JOIN
        orders as o
        ON c.customer_id = o.order_customer_id
    INNER JOIN
        order_items as oi
        ON o.order_id = oi.order_item_order_id
    INNER JOIN
        products as p
        ON oi.order_item_product_id = p.product_id
    GROUP BY customer_city, product_name
    ) t
WHERE rank < 6
ORDER BY quantity DESC;