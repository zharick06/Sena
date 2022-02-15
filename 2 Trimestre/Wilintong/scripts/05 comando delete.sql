/*comando DELETE*/
/* SE utiliza para eliminar registros de una tabla de una BD*/
/* hay 2 tipos de eliminaciones*/
/* 1. eliminación física: borra el registro de la BD. allí se
      utiliza una instrucción delete
   2. Eliminación lógica: se altera un campo de una tabla de
      la bd. allí se utiliza una instrucción update*/
/*sintaxis general
 DELETE from nombre_tabla 
 WHERE condicion(es) -->opcional
 sin embargo hay que ser muy cuidadosos con el delete sin
 el where*/
 /*consideración especial
	NO SIEMPRE se pueden borrar los registros de una BD
    porque? los registros se pueden borrar siempre y cuando
    no se atente contra la integridad referencial de la base
    de datos*/
delete from generos where codigo='G08';
delete from generos where codigo='G99';

update libros set genero='G05' where idlibro=10;

delete from generos;

DELETE FROM LIBROS;
Error Code: 1451. Cannot delete or update a parent row: 
a foreign key constraint fails (`libreria_2250076`.`autoria`, 
CONSTRAINT `FK_idlibro_autoria_autores` FOREIGN KEY (`idlibro`)
 REFERENCES `libros` (`idlibro`))


DELETE FROM generos where codigo not in('G01','G05');
