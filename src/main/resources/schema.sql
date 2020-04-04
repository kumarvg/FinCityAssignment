drop database if exists TempDataBase;

create database TempDataBase;

use TempDataBase;

create table Car
(
   id INT,
   name VARCHAR (50),
   manufactureName VARCHAR (50),
   model VARCHAR (50),
   color VARCHAR (50)
);