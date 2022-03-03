/* FUNCIONES NATIVAS EN SQL*/
/*FUNCIÓN BETWEEN. nos permite hallar el valor de un campo
en un rango de valores. se pueden evaluar tipos de datos
numéricos, caracter o fecha*/
select * from detallesfac;
select * from detallesfac
where cantidad>=10 and cantidad<=20;

select * from detallesfac
where cantidad between 10 and 20;

select * from detallesfac
where vtotal between 15000 and 18000;

select * from pacientes 
where numero between '19' and '1980' ;

/*deseamos seleccionar los movimientos del 05 de febrero de 2021
hasta el 8 de febrero de 2021*/
select * from detallesfac 
where fecha between '2021-02-05' and '2021-02-08' ;

/*función LIKE --> Se parece a... esta función se utiliza mucho
en sistemas de busqueda*/

select * from detallesfac
where descripcion = 'CONTROL';

select * from detallesfac
where descripcion like '%CONTROL%';

/*FUNCIÓN COUNT. se utiliza para contar registros que cumplen unas condiciones
específicas. la función count recibe OBLIGATORIAMENTE un parámetro y retorna siempre 1
registro indicando la cantidad de registros que satisfacen las condiciones
de la consulta*/
select count(*) as cantidad from pacientes
where tipodoc='CC';
/*los nombres de los campos que se obtienen al implementar una función nativa
de SQL es muy conveniente renombrarlos para no tener problemas desde
el lenguaje de programación al tratarlo como una variable o elemento de un array,
json, tupla, lista, etc.
para ello es necesario utilizar alias de campo con la clausula as*/

/*función substr. se utiliza para extraer parte de un texto de un campo.
esta función recibe 3 parámetros:
1. el campo de la tabla desde donde deseo extraer el texto
2. la posición inicial desde donde deseo extraer el texto
3. la cantidad de caracteres a extraer a partir de la posición inicial*/
select descripcion,substr(descripcion,6,5) AS TEXTO from detallesfac
T E R A P I A   F I  S  I  C  A
1 2 3 4 5 6 7 8 9 10 11 12 13 14 

/*LA función substr se utiliza generalmente para extraer de un lado y
armar algo o procesar algo en otro lado
ejemplo: crear un algoritmo para encriptar datos*/
select '1234',substr('1234',1,1) as c1,
substr('1234',2,1) as c2,substr('1234',3,1) as c1, substr('1234',4,1) as c4,
concat(substr('5063',1,1)+10,substr('5063',2,1)+10,substr('5063',3,1)+10,
substr('5063',4,1)+10) as clave_encriptada; 


/*funciones para descomponer una fecha*/
select fecha, year(fecha) AS anio, month(fecha) as mes, day(fecha) as dia
 from detallesfac
 /*estas funciones reciben una fecha como parámetro y devuelven
 un valor NUMÉRICO*/
