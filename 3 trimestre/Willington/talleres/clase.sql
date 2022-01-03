/*1
Realizar una consulta para obtener los siguientes datos. Nombre del contrato (tabla contratos),
de la tabla detallesfac los campos descripción del servicio, cantidad, valor unitario, fecha. Los
registros deben estar entre el 01/02/2021 y el 15/02/2021 y deben ser registros facturados
(campo estadocar). Ordene los resultados por el nombre del contrato y la descripción del
servicio.*/
select c.nombre,d.descripcion,d.fecha,d.contrato,d.vunitario from detallesfac d,contratos c
where d.contrato=c.codigo and d.fecha between "2021/02/01" and "2021/02/15" and d.estadocar = "F"  order by c.nombre, d.descripcion;

/*2
Realice una consulta para obtener: Nombre de la unidad Funcional (tabla unidades), Nombre
del contrato(tabla contratos), Nombre del servicio (de la tabla servicios), los campos de la tabla
detallesfac: fecha, hora, valor total. Los registros no deben estar anulados, las unidades
funcionales a incluir son las siguientes: 005,009, 003 y los contratos a incluir son
081,063,159,064,158. Los servicios deben contener la palabra CONSULTA*/

select u.nombre, c.nombre, s.nombre, d.fecha,  d.hora, d.vtotal from unidadesf u, contratos c, servicios s, detallesfac d
where d.contrato=c.codigo and s.codigo=d.codigo and u.codigo=d.unidadf and  u.codigo in ("005","009", "003") and c.codigo in("081","063","159","064","158") and s.nombre like "%CONSULTA%" ;

/*3
Consulte los detalles de facturación en estado anulado. Se requiere saber el nombre del
contrato, la fecha, el valor total, el nombre del servicio y el nombre de la unidad funcional.*/

select c.nombre, d.fecha,d.vtotal, s.nombre, u.nombre from unidadesf u, contratos c, servicios s, detallesfac d
where d.contrato=c.codigo and s.codigo=d.codigo and u.codigo=d.unidadf and d.estadocar = "A";

/*4
El área de auditoria requiere un listado de los detalles de facturación. Requiere saber los
cargos realizados a menores de edad (campo tipodoc de la tabla detallesfac: RC, TI), que NO
hayan sido CONSULTAS, cuyo valor total sea mayor a 30.000 y que el registro en detallesfac
NO este anulado. Se requiere el listado con el nombre del contrato, código y nombre del
servicio, el valor total, la fecha y que esté ordenado por fecha, nombre del servicio y cantidad.*/






