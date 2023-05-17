/* 
exponer base de datos en el puerto 3306
user root y password 123456, de lo contrario modificar el puerto user y password en el archivo .properties en el proyecto java
base de datos simple con el objetivo de realizar una operacion de insert y consultas a traves de java
*/
create database tecnical_test;

use  tecnical_test;

create table test_data(
id int AUTO_INCREMENT PRIMARY KEY,
name_data varchar(50),
description_data varchar(100)
);

select * from test_data;