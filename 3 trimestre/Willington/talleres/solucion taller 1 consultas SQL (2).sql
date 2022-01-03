/*taller 1 consultas SQL*/
/*1 Seleccione los registros de la tabla detallesfac donde 
el tipo de documento sea cedula de ciudadanía.*/
select * from detallesfac
where tipodoc='CC';

/*Seleccione los campos factura, contrato, fecha, hora y 
descripción de los detalles de facturación donde los minutos 
correspondan al minuto 30 de cada hora*/



/*Seleccione todos los registros de detallesfac donde exista la palabra CONTROL
en la descripción.*/
select * from detallesfac where descripcion like "%CONTROL%";

/*Seleccione todos los registros de detallesfac donde exista la palabra CONTROL
y además la palabra ENFERMERIA y también los registros donde exista la
palabra CONTROL y además la palabra MEDICINA. Ejemplo:*/
select * from detallesfac where descripcion like "%CONTROL%" and descripcion like "%ENFERMERIA%";

select * from detallesfac where descripcion like "%CONTROL%" and descripcion like "%MEDICINA%";

/*Seleccione de detallesfac los códigos(campo código) que terminen en las letras
CP.*/

select * from detallesfac where codigo like "%CP";

/*Seleccione los registros que tengan diferencia en el cálculo de la cantidad por el valor unitario comparado con el valor total(campo vtotal) de la tabla
detallesfac. UTILICE PARA ELLO UNA OPERACIÓN LÓGICA NOT.*/
select * from detallesfac where not (vtotal=cantidad);


/*Seleccione los registros de la tabla detallesfac que estén entre el día 01 de
febrero de 2021 hasta el 10 de febrero de 2021 y que estén entre los contratos con código desde 150 al 170 y que estén en las unidades funcionales con
códigos 001, 006, 012, 011.*/

select * from detallesfac where fecha between "2021-02-01" and "2021-02-10" and contrato between "150" and "170" and unidadf ="001 "or unidadf ="006"or unidadf ="012"or unidadf ="011";


/*Seleccione los apellidos, nombres, teléfono de los pacientes cuyo celular
comience por 313*/

select nombre1, nombre2, apellido1, apellido2 from pacientes where celular like "313%";


/*Seleccione los apellidos, nombres, teléfono, tipo de documento de los pacientes
cuyo tipo de sangre sea O+ y que no estén casados y que vivan en el área
Urbana.*/

select nombre1, nombre2, apellido1, apellido2, celular, tipodoc from pacientes where rh= "O+" and estcivil ="1" and zona ="U";

/*Cuantos pacientes son de sexo femenino?*/
select count(*) as cantidad from pacientes where sexo= "F";


/*Cuantos pacientes son de sexo masculino que se llamen DIEGO? El nombre
puede estar en el primer nombre o en el segundo nombre.*/
select * from pacientes where sexo= "M" and nombre1 like "%DIEGO%" or nombre2 like "%DIEGO%";










