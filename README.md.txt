# BigDataDeveloper

## Descripción del Repositorio
Este repositorio cuenta con las siguientes herramientas:

- MySQL
- Hadoop
- Spark
- Hive
- Jupyter
- HUE

Todo el contenido se ejecutara en codespace de github.

## Desplegar container

1. Crear un codespace para el repositorio e ingresar al mismo
2. Abrir terminal de codespace
3. Ejecutar el siguiente comando para desplegar los contenedores<br>
```    >_ docker-compose up     ``` <br>
Esta linea desplegara los contenedores y podras ver estos utilizando la extension Docker explorer

## MySQL
Este contenedor contiene una base de datos llamada retail_db y consta de las siguientes tablas: <br>
- customers
- orders
- order_items
- products
- categories
- departments
<br>
credenciales:
<br>
user: root
<br>
pass: root
<br>
port: 3310
<br>
Ejecutar ifconfig en terminal para obtener la ip (eth0)

# CAPA INGESTA / RAW /LANDING 
## Hadoop
### Entrar a un contenedor "datanode"  -> docker exec -it xxxx bash
Para poder trabajar con hadoop ingresamos al contenedor del datanode. <br>
Abrimos un terminal nuevo y ejecutamos lo siguiente
```     >_ docker exec -it datanode bash     ``` <br> 
Asi para cada contenedor con el que queremos trabajar. <br>

## Sqoop instalación y permisos 
Para utilizar sqoop en el datanode debemos ejecutar lo siguiente
```     >_ sh /datanode/scripts/script.sh     ``` <br> 

###  Exportar tablas de mysql - hdfs con sqoop
Para exportar las tabla de la base de datos retail con sqoop ejecutar lo siguiente:<br>
```     >_ sh /datanode/scripts/sqoop/script_sqoop_textfile.sh     ```<br>
```     >_ sh /datanode/scripts/sqoop/script_sqoop_avro.sh     ``` <br>
```     >_ hdfs dfs -put *.avsc /user/datapath/datasets/avro/     ```

# CAPA PROCESAMIENTO / CLEANSED / TRUSTED
## A . Hive
Para poder trabajar con hive ingresamos al contenedor del hive-server. <br>

Abrir un terminal y copiar el archivo hive.hql a hive-server<br> 
```     >_ docker cp datanode/scripts/hive/hive.hql hive-server:/opt      ``` <br> 
```     >_ docker cp datanode/scripts/hive/hive_avro.hql hive-server:/opt      ``` <br> 

Abrimos un terminal nuevo y ejecutamos lo siguiente
```     >_ docker exec -it hive-server bash     ``` <br> 

Para crear tablas externas en base a los datos importados con sqoop ejecutamos los siguientes pasos:<br>

En el terminal de hive-server ejecutamos lo siguiente para crear las tablas. <br> 
```     >_ hive -f /opt/hive.hql    ``` <br> 
```     >_ hive -f /opt/hive_avro.hql    ``` <br> 

En el terminal de hive-server ejecutamos
```     >_ hive     ``` <br> 
```     >_ USE retail_db;         ```     >_
SELECT 
    p.product_name,
    SUM(oi.quantity * oi.list_price) AS total_ventas
FROM order_items oi
JOIN products p ON oi.product_id = p.product_id
GROUP BY p.product_name
ORDER BY total_ventas DESC
LIMIT 10;

#### ----------------------------- PRACTICA 1  --------------------------------------## 

1 Descargar un set de datos en formato csv

2 crear base de datos en mysql de su preferencia

3 Importar la base de datos con la herramienta adminer/hue

#### ----------------------------- PRACTICA 1  --------------------------------------

3 Importar la base de datos escogida a hdfs utilizando sqoop construyendo un archivo mis_datos_sqoop.sh
```     >_ sh /datanode/scripts/sqoop/mis_datos_sqoop.sh    ``` <br> 
4 Crear una tabla externa con hive construyendo un archivo mis_tabla_hive.hql
```     >_ hive -f /opt/hive.hql    ``` <br> 
4 Construye una agragacion (procesamiento) para la tabla externa
```     >_ hive     ``` <br> 
```     >_ select ... groupby     ``` <br> 



