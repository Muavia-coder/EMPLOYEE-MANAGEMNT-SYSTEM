CREATE DATABASE employeemanagement;
USE employeemanagement;
CREATE TABLE login(
username VARCHAR(20),
`password` VARCHAR(20)
);
SELECT * FROM login;
INSERT INTO login VALUES
('muavia999','119900@#');

CREATE TABLE employee(
`name` VARCHAR(40),
fname VARCHAR(40),
dob VARCHAR(40),
salary VARCHAR(40),
address VARCHAR(40),
phone VARCHAR(40),
email VARCHAR(40),
education VARCHAR(40),
designation VARCHAR(40),
CNIC VARCHAR(40),
empiID VARCHAR(40)
);
SELECT * FROM employee;
ALTER TABLE employee CHANGE empiID empid VARCHAR(255);
TRUNCATE TABLE employee;