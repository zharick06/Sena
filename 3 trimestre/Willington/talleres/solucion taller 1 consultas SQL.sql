/*taller 1 consultas SQL*/
/*1 Seleccione los registros de la tabla detallesfac donde 
el tipo de documento sea cedula de ciudadanía.*/
select * from detallesfac
where tipodoc='CC';

/*2.Seleccione los campos factura, contrato, fecha, hora y 
descripción de los detalles de facturación donde los minutos 
correspondan al minuto 30 de cada hora*/
select count(*) as cantidad from detallesfac where hora like '%30';

select factura,contrato,fecha,hora,descripcion from detallesfac
where minute(hora)=30;
/*OTRA FORMA DE HACERLA*/
select factura, contrato, fecha, hora, descripcion 
from detallesfac where hora like '%30';
/*OTRA FORMA DE HACERLA*/
select factura, contrato, fecha, hora, descripcion 
from detallesfac where substring(hora,4,2)='30';

/* 3. Seleccione todos los registros de detallesfac donde exista la palabra CONTROL
en la descripción. */
select * from detallesfac where descripcion 
like '%control%'; 
/*como no hay diferenciación entre mayusculas y minusculas esta
consulta genera los mismos resultados*/
select * from detallesfac
where descripcion like '%CONTROL%';

/*4) Seleccione todos los registros de detallesfac donde exista la 
palabra CONTROLny además la palabra ENFERMERIA y también los 
registros donde exista la palabra CONTROL y además la palabra MEDICINA.*/
​
select * from detallesfac where descripcion 
like '%CONTROL%ENFERMERIA%' or descripcion 
like '%CONTROL%MEDICINA%'; 
/*OTRA FORMA DE HACERLA*/
select * from detallesfac where descripcion like '%CONTROL%'
and (descripcion like '%ENFERMERIA%' or descripcion like '%MEDICINA%');
​/*  TERMINOS SEMEJANTES
	5*2  + 5*6 =40
	5(2+6)=40
*/

/*5) Seleccione de detallesfac los códigos(campo código) que terminen
 en las letras CP*/
​
select codigo from detallesfac where codigo like '%CP';

/*6) Seleccione los registros que tengan diferencia en el cálculo 
de la cantidad por el valor unitario comparado con el valor 
total(campo vtotal) de la tabla
detallesfac. UTILICE PARA ELLO UNA OPERACIÓN LÓGICA NOT.*/
​
select * from detallesfac where  NOT vtotal=cantidad*vunitario;
/*EL ORDEN DE LOS FACTORES NO ALTERA EL PRODUCTO*/
select * from detallesfac where  NOT cantidad*vunitario=vtotal;
/*EL MISMO RESULTADO LO PUEDO OBTENER CON UN OPERADOR RELACIONAL
DIFERENTE DE != */
select *from detallesfac
where cantidad*vunitario!=vtotal;

/*7 Seleccione los registros de la tabla detallesfac que estén entre 
el día 01 de febrero de 2021 hasta el 10 de febrero
de 2021 y que estén entre los contratos con código desde 
150 al 170 y que estén en las unidades funcionales con códigos 
001, 006, 012, 011.*/
​
select * from detallesfac
where (fecha between '2021-02-01' and '2021-02-10') and 
(contrato between '150' and '170') and 
(unidadf='001' or unidadf='006' or unidadf='012' or unidadf='011');

select * from detallesfac
where fecha between '2021-02-01' and '2021-02-10'
and contrato between '150'and '170'
and (unidadf='001'or unidadf='006'or unidadf='011'or unidadf='012');

/*OPERADOR IN - halla la pertenencia de un campo en un conjunto de
valores. ejecuta de forma IMPLICITA operaciones lógicas or */
select * from detallesfac
where fecha between '2021-02-01' and '2021-02-10'
and contrato between '150'and '170'
and unidadf in('001','006','011','012');

select * from detallesfac
where fecha between '2021-02-01' and '2021-02-10'
and contrato>='150'and contrato<='170'
and unidadf in('001','006','011','012');

select * from detallesfac where cantidad in(2,5,8);

/*8.Seleccione  los  apellidos,  nombres,  teléfono
 de  los  pacientes  cuyo  celular comience por 313*/
 select apellido1,apellido2,nombre1,nombre2,celular
 from pacientes
 where celular like '313%';
 
 /*9.Seleccione los apellidos, nombres, teléfono, tipo de documento 
 de los pacientes cuyo  tipo  de  sangre sea  O+  
 y que  no  estén  casados y  que  vivan  en  el  área Urbana.*/
  
 select apellido1,apellido2,nombre1,nombre2,celular,tipodoc 
 from pacientes
where rh='O+' and not estcivil='2' and zona='U';
​/*tambien se puede hacer con el operador relacional diferente de*/
select nombre1, nombre2, apellido1, apellido2, celular, tipodoc 
from pacientes where rh= 'O+' and estcivil !='2' and zona ='U';

/*10.Cuantos pacientes son de sexo femenino?*/
select count(*) as cantidad from pacientes where sexo= "F";

/*11 Cuantos pacientes son de sexo masculino que se llamen DIEGO? 
El nombre puede estar en el primer nombre o en el segundo nombre.*/
select count(*) as cantidad from pacientes where sexo= 'M' 
and (nombre1 like '%DIEGO%' or nombre2 like '%DIEGO%');

/*12) Seleccione la fecha y la hora de la tabla detallesfac 
y agregue otro campo a la consulta que sea el resultado de concatenar 
esa fecha en formato dd/mm/yyyy y la hora. Ejemplo: 
si la fecha es 2018-02-01 00:00:00 y la hora es 15:45, el
campo resultante debe tener el valor 01/02/2018 15:45*/

select fecha,hora,concat(substr(fecha,9,2),"/",substr(fecha,6,2),"/",
substr(fecha,1,4)," ",hora) as fecha_hora
from detallesfac;

/*utilizando la función date_format*/
select fecha, hora, concat(DATE_FORMAT(fecha, "%d/%m/%Y"),' ',hora)
 as unir from detallesfac;	

