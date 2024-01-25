create database Reto2;
use Reto2;


 drop table if exists reservas ;
 create table reservas (
idReserva int auto_increment primary key ,
DNI varchar(9),
nombreReserva varchar(40),
apellido varchar(40),
correoElectronico varchar (100),
telefono int,
numeroPersona int,
hora time,
fecha date
);
 drop table if exists empleados;
 create table empleados (
 idEmpleado int auto_increment primary key ,
 salario int, 
 nombreEmpleado varchar(50),
 puesto varchar(20)
 );
 drop table if exists producto;
create table producto(
idProducto int auto_increment primary key ,
nombreProducto varchar(50),
peso int,
origen varchar(50)
);