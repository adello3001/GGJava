
CREATE TABLE hello_temp 
    AS SELECT * FROM hello;

CREATE TABLE hello_temp 
    AS SELECT * FROM hello WHERE tel IS NOT NULL;

CREATE TABLE hello_temp 
    AS SELECT id, name, age FROM hello WHERE tel IS NOT NULL;
    
    
SELECT * FROM hello_temp;    

DELETE FROM hello_temp;

DELETE FROM hello_temp WHERE id = '20000';

DROP TABLE hello_temp;