DROP TABLE IF EXISTS TBL_EMPLOYEES;

CREATE TABLE TBL_EMPLOYEES(id INT AUTO_INCREMENT PRIMARY KEY,
                           first_name VARCHAR(25) NOT NULL,
                           last_name VARCHAR(25) NOT NULL,
                           email VARCHAR(25) DEFAULT NULL);
