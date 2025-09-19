FROM python:3.9

RUN pip install mysql-connector-python
RUN pip install jupyterlab
RUN pip install psycopg2-binary
RUN pip install pymongo

# Install OpenJDK-8
RUN apt-get update 
RUN apt-get -y install default-jre

WORKDIR /user/app

# Descargar jars necesarios para Spark Structured Streaming + Kafka
RUN curl -L -o /opt/spark/jars/spark-sql-kafka-0-10_2.11-2.4.0.jar \
    https://repo1.maven.org/maven2/org/apache/spark/spark-sql-kafka-0-10_2.11/2.4.0/spark-sql-kafka-0-10_2.11-2.4.0.jar

RUN curl -L -o /opt/spark/jars/kafka-clients-2.0.0.jar \
    https://repo1.maven.org/maven2/org/apache/kafka/kafka-clients/2.0.0/kafka-clients-2.0.0.jar
