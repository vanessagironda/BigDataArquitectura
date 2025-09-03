--
-- HIVE SQL Avanzado
--

DROP DATABASE IF EXISTS SQLdb CASCADE;
CREATE DATABASE SQLdb;
USE SQLdb;

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
    (6,"Gretchen","Kinney","1974-10-18","violet",1),
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
-- CONCAT
--
SELECT 
    CONCAT(firstname,'@',surname),  
    quantity 
FROM 
    persons;

--
-- LENGTH
--
SELECT surname, LENGTH(surname), CHAR_LENGTH(surname) FROM persons LIMIT 5;

--
-- UPPER, LOWER
--

SELECT surname, UPPER(surname), LOWER(surname) FROM persons LIMIT 5;

-- La función LIKE permite buscar patrones específicos dentro de cadenas de caracteres.

-- > LIKE 'a%'   : Encuentra los valores que inician con 'a'
-- > LIKE '%a'   : Encuentra los valores que terminan con 'a'
-- > LIKE '%a%'  : Encuentra los valores que contengan 'a' en cualquier posición
-- > LIKE '_a%'  : Encuentra los valores que contengan 'a' en la segunda posición
-- > LIKE 'a_%_%': Encuentra los valores que inician con 'a' y tienen al menos 3 caracteres
-- > LIKE 'a%o'  : Encuentra los valores que inician con 'a' y terminan con 'o'

SELECT * FROM persons WHERE color LIKE 'b%';

SELECT * FROM persons WHERE color NOT LIKE 'b%';


--
-- Conectores lógicos (AND).
--
SELECT * FROM persons WHERE color = 'blue' AND firstname LIKE 'Z%';

--
-- Conectores lógicos (OR).
--
SELECT * FROM persons WHERE color = 'blue' OR firstname LIKE 'K%';

--
-- Condicional para campos string
--
SELECT * FROM persons WHERE color IN ('blue','black');

SELECT * FROM persons WHERE color NOT IN ('blue','black');

--
-- REGEXP
-- El primer caracter es una 'b'
--
SELECT * FROM persons WHERE color REGEXP '^b';

--
-- El primer caracter no es una 'b'
--
SELECT * FROM persons WHERE color REGEXP '^[^b]';

--
-- El segundo caracter es una 'r'
--
SELECT * FROM persons WHERE color REGEXP '.r';

--
-- Finaliza en una vocal
--
SELECT * FROM persons WHERE color REGEXP '[aeiou]$';

--
-- SUBSTRING
--
SELECT 
    firstname, 
    SUBSTRING(firstname, 0, 2), -- LEFT()
    SUBSTRING(firstname, 3, 2), 
    SUBSTRING(firstname, -3)    -- RIGHT()
FROM 
    persons;

--
-- LOCATE
-- Retorna la posición del substring
--
SELECT firstname, LOCATE('ia', firstname) FROM persons;

--
-- Formatos para el año
--
SELECT 
    birthday, 
    DATE_FORMAT(birthday, "yyyy   yy")
FROM 
    persons
LIMIT
    5;

--
-- Formatos para el mes
--
SELECT 
    birthday, 
    DATE_FORMAT(birthday, "MMM MM M")
FROM 
    persons
LIMIT
    5;

--
-- Formatos para el dia
--
SELECT 
    birthday, 
    DATE_FORMAT(birthday, "dd  d EEE EEEE")
FROM 
    persons
LIMIT
    5;

--
-- CURRENT_DATE, CURRENT_TIMESTAMP
--
SELECT CURRENT_DATE(), CURRENT_TIMESTAMP();