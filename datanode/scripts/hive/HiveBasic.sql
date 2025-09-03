
--
-- HIVE SQL Basico
--

DROP DATABASE IF EXISTS retail_db CASCADE;

CREATE DATABASE test_db;
USE test_db;

CREATE TABLE persons (
    id INT,
    firstname VARCHAR(10),
    surname VARCHAR(10),
    birthday DATE,
    color VARCHAR(10),
    quantity INT
);

INSERT INTO persons VALUES
    (1,"Vivian","Hamilton","1971-07-08","green",1),
    (2,"Karen","Holcomb","1974-05-23","green",4),
    (3,"Cody","Garrett","1973-04-22","orange",1),
    (4,"Roth","Fry","1975-01-29","black",1),
    (5,"Zoe","Conway","1974-07-03","blue",2),
    (6,"Gretchen","Kinney","1974-10-18","violea",1),
    (7,"Driscoll","Klein","1970-10-05","blue",5),
    (8,"Karyn","Diaz","1969-02-24","red",1),
    (9,"Merritt","Guy","1974-10-17","indigo",4),
    (10,"Kylan","Sexton","1975-02-28","black",4),
    (11,"Jordan","Estes","1969-12-07","indigo",4),
    (12,"Hope","Coffey","1973-12-24","green",5),
    (13,"Vivian","Crane","1970-08-27","gray",5),
    (14,"Clio","Noel","1972-12-12","red",5),
    (15,"Hope","Silva","1970-07-01","blue",5),
    (16,"Ayanna","Jarvis","1974-02-11","orange",5),
    (17,"Chanda","Boyer","1973-04-01","green",4),
    (18,"Chadwick","Knight","1973-04-29","yellow",1);

--
-- Este es el comando básico para visualizar el contenido de la BD
--
SELECT * FROM persons;

--
-- Selección de campos específicos
--
SELECT firstname, surname, birthday FROM persons;

--
-- Se limita la cantidad de registros a visualizar.
--
SELECT * FROM persons LIMIT 3;

--
-- Grupo especifico de registros a visualizar
--
SELECT * FROM persons LIMIT 2,5;

--
-- Condicional.
--
SELECT * FROM persons WHERE color = "blue";

--
-- Operadores relacionales
--
SELECT * FROM persons WHERE quantity > 2;

--
-- Condicional con fechas
--
SELECT * FROM persons WHERE birthday >= "1974-01-01";


--
-- Creamos una nueva tabla
--

DROP TABLE IF EXISTS jointable;

CREATE TABLE  jointable (
    letter_id INT,
    letter VARCHAR(1)
);

INSERT INTO jointable VALUES
    (1,"A"),
    (2,"B"),
    (3,"C"),
    (24,"X"),
    (25,"Y"),
    (26,"Z");

SELECT * FROM jointable;

--
-- Subconsulta
--
SELECT * FROM jointable
WHERE letter_id = (SELECT id FROM persons WHERE firstname = 'Karen');

--
-- Sub-consultas.
-- Busca la persona más vieja en la tabla.
--
SELECT * 
FROM 
    persons 
WHERE 
    birthday = (SELECT 
                    MIN(birthday) 
                FROM persons);
--
-- Uso del Distinct
--
SELECT color FROM persons;

SELECT DISTINCT color FROM persons;

SELECT DISTINCT YEAR(birthday), MONTH(birthday), DAYOFMONTH(birthday) FROM persons;


--
-- Order By
--

--
-- Selecciona el primer registro
--
SELECT * FROM persons ORDER BY birthday LIMIT 1;


--
-- Selecciona el último registro
--
SELECT * FROM persons ORDER BY birthday DESC LIMIT 1;

--
-- Orden ascendente
--
SELECT * FROM persons WHERE quantity > 2 ORDER BY quantity, color;

--
-- Orden descendente en quantity
--
SELECT * FROM persons WHERE quantity > 2 ORDER BY quantity DESC, color;


--
-- JOINS
--
SELECT id, firstname, letter
FROM persons INNER JOIN jointable ON id = letter_id;