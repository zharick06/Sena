/*SQL - STRUCTURED QUERY LANGUAGE*/
/* COMANDOS DDL - COMANDOS DE DEFINICIÓN DE DATOS
   DDL - DATA DEFINITION LANGUAGE
   LENGUAJE DE  DEFINICIÓN DE DATOS
   CREAR ESTRUCTURAS DE DATOS, BASES DE DATOS, TABLAS
   INDICES, ETC.
   MODIFICAR O AGREGAR CAMPOS EN UNA TABLA, ETC
   ELIMINAR CAMPOS, ELIMINAR RELACIONES, ETC
   */

/* COMANDOS DML -  COMANDOS DE MANIPULACIÓN DE DATOS
   DATA MANIPULATION LANGUAGE
   LENGUAGE DE MANIPULACIÓN DE DATOS
   NOS PERMITE IMPLEMENTAR LAS OPERACIONES CRUD
   C  - Create   - Crear            Insert
   R  - Read     - Leer             Select
   U  - Update   - Actualizar       Update
   D  - Delete   - Borrar           Delete
   */

/*COMANDOS DDL*/
/*CREAR UNA BASE DE DATOS*/
create schema citas_2250076;
use citas_2250076;

/*crear tablas*/
/*sintaxis general
create table nombretabla
( nombre_campo1 tipodedato caracteristicas -->opcionales,
  nombre_campo2 tipodedato caracteristicas -->opcionales,
  nombre_campo3 tipodedato caracteristicas -->opcionales,
  ....,
  nombre_campon tipodedato caracteristicas -->opcionales
);
*/
create table especialidades
( codigo char(3) primary key not null,
  nombre char(60) not null,
  estado tinyint
);




   