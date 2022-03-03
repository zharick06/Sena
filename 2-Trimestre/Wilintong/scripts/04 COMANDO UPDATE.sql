/*COMANDO UPDATE*/
/*se utiliza para actualizar registros*/
/*SINTAXIS GENERAL
UPDATE NOMBRE_TABLA SET campo1=valor1,campo2=valor2,
                        campo3=valor3,....,campon=valorn
WHERE condicion(es)  -->>opcional
sin embargo hay que tener mucho cuidado de utilizar
el comando update sin el where.*/
/*en el comando update juegan un papel muy importante
  las llaves principales*/
update generos set nombre='Física'
where codigo='G03';

update libros set titulo='Negocios y Emprendimiento',
genero='G02',paginas=250,editorial='E03',precio=85000
where idlibro=10;

update generos set nombre='Minería'
where codigo='G10';

ALTER table libros drop foreign key
FK_genero_libros_generos;

ALTER table libros add foreign key
FK_genero_libros_generos (genero) references generos(codigo);

/* en que momento sería factible utilizar la sentencia 
update sin la clausula where? */

alter table autores add column sitioweb varchar(200);
update autores set sitioweb='No definida';

update generos set nombre='Matemáticas y Algebra'
where codigo='G02';

update generos set codigo='G99'
where codigo='G02'

Error Code: 1451. Cannot delete or update a parent row: 
a foreign key constraint fails (`libreria_2250076`.`libros`, 
CONSTRAINT `FK_genero_libros_generos` FOREIGN KEY (`genero`) 
REFERENCES `generos` (`codigo`))






