# BigDataDeveloper

## Descripción del Repositorio
Este repositorio cuenta con las siguientes herramientas:

- MySQL
- Hadoop
- Spark
- Hive
- Jupyter

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
```     >_ USE retail_db;         ```   <br> 
SELECT 
    p.product_name,
    SUM(oi.quantity * oi.list_price) AS total_ventas
FROM order_items oi
JOIN products p ON oi.product_id = p.product_id
GROUP BY p.product_name
ORDER BY total_ventas DESC
LIMIT 10;

#### ----------------------------- PRACTICA 1  Computo Monolítico --------------------------------------## 

1 Descargar un set de datos en formato csv

2 crear base de datos en mysql de su preferencia

3 Importar la base de datos con la herramienta adminer

#### ---------------------------- PRACTICA 2  Computo distribuido --------------------------------------##

1 Importar la base de datos escogida a hdfs utilizando sqoop. Ayuda dentro de datanode
```     >_ sh /datanode/scripts/sqoop/script_sqoop_textfile.sh    ``` <br> 
2 Crear una tabla externa con hive. Ayuda dentro de hive-server
```     >_ hive -f /opt/hive.hql    ``` <br> 
3 Construye una agragacion (procesamiento) para la tabla externa
```     >_ hive     ``` <br> 
```     >_ select ... groupby     ``` <br> 

#### ---------------------------- PRACTICA 3  AJUSTES --------------------------------------
1 Copiamos el README.md nueva a su repositorio 

2 Hacer que mysql tenga un ip fijo

     - Adicionar a docker-compse.yml
         networks:
            net_pet:
                ipv4_address: 172.27.1.15
     - Recompilar el datanode 
```     >_ docker compose down mysql``` <br> 
```     >_ docker compose up -d --build mysql``` <br> 
     - Adicionar a script_sqoop_textfile.sh
     sqoop import \
            --connect "jdbc:mysql://mysql:3306/retail_db" \
            --username=root \
            --password=root \
            --table customers \
            --as-textfile \
            --target-dir=/user/datapath/datasets/customers \
            --delete-target-dir > /tmp/log_customer.log


#### ---------------------------- PRACTICA 4  Base de datos persistente --------------------------------------

1 Utilizamos la herramienta https://sqlizer.io/ para convertir una base con la que trabajar para convertir a un archivo nombre.sql

2 Con el archivo nombre.sql adicionamos 
```     >_ CREATE DATABASE bd_vanessa;``` <br> 
```     >_ USE bd_vanessa;``` <br> 

2 Pasamos el archivo a la carpeta  /mysql 

3 Adicionamos en el archivo /mysql/Dockerfile 
```     >_ COPY student-mat.sql /docker-entrypoint-initdb.d/    ``` <br> 

4 Recreamos la imagen de mysql 
```     >_ docker compose down mysql``` <br> 
```     >_ docker compose up -d --build mysql``` <br> 

5 Guardamos los cambios realizados en GIT 

```     >_git add . && git commit -m "update" && git push origin master ``` <br> 

###### Comandos de ayuda

- Para subir cambios a git

```     >_git add . && git commit -m "update" && git push origin master ``` <br> 

- Para bajar todos los contenedores

```     >_docker compose down``` <br> 
- Para subir los contenedores desde cero

```    >_ docker-compose up     ``` <br>


#### ---------------------------- PRACTICA 5  Procesamiento con spark --------------------------------------

1  Arrancamos spark 
2 Entramos al puerto 