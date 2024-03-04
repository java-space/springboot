DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS address;

create table employee (ID integer auto_increment primary key, first_name varchar(50) not null,last_name varchar(50) not null);
create table address (ID integer auto_increment primary key, EMP_ID integer, province varchar(50) not null);