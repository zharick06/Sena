/*1 Realizar una consulta para obtener los siguientes datos. 
Nombre del contrato (tabla contratos), de la tabla detallesfac
 los campos descripción del servicio, cantidad, valor unitario,
 fecha. Los registros deben estar entre el 01/02/2021 y el 
 15/02/2021 y deben ser registros facturados (campo estadocar).
 Ordene los resultados por el nombre del contrato y 
 la descripción del servicio.*/
 
 select c.nombre,d.descripcion,d.cantidad,d.vunitario,d.fecha
 from contratos c, detallesfac d
 where c.codigo=d.contrato and d.fecha between '2021-02-01'
 and '2021-02-15' and d.estadocar='F'
 order by c.nombre,d.descripcion;
 
 /*2 Realice una consulta para obtener: Nombre de la unidad 
 Funcional (tabla unidades), Nombre del contrato
 (tabla contratos), Nombre del servicio (de la tabla servicios)
 , los campos de la tabla detallesfac: fecha, hora, valor 
 total. Los registros no deben estar anulados, las unidades 
 funcionales a incluir son las siguientes: 005,009, 003 y 
 los contratos a incluir son 081,063,159,064,158. 
 Los servicios deben contener la palabra CONSULTA*/
 select u.nombre as nomunidad,c.nombre as nomcontrato,
 s.nombre as nomservicio,d.fecha,d.hora,d.vtotal
 from unidadesf u, detallesfac d, contratos c, servicios s
 where u.codigo=d.unidadf and d.contrato=c.codigo and
 d.codigo=s.codigo and d.estadocar!='A' 
 and d.unidadf in('005','009','003') and 
 d.contrato in('081','063','159','064','158')
 and s.nombre like '%CONSULTA%';
 
 /*3 Consulte los detalles de facturación en estado anulado. Se requiere 
 saber el nombre del contrato, la fecha, el valor total, el nombre del 
 servicio y el nombre de la unidad funcional.*/
 select c.nombre, d.fecha,d.vtotal,d.estadocar,s.nombre,u.nombre
from unidadesf u, contratos c, servicios s, detallesfac d
where u.codigo=d.unidadf 
and c.codigo=d.contrato 
and s.codigo=d.codigo
and d.estadocar ='A';

/*4 El área de auditoria requiere un listado de los detalles 
de facturación. Requiere saber los cargos realizados a menores de
 edad (campo tipodoc de la tabla detallesfac: RC, TI), que 
 NO hayan sido CONSULTAS, cuyo valor total sea mayor a 30.000 
 y que el registro en detallesfac NO este anulado. Se requiere 
 el listado con el nombre del contrato, código y nombre del 
 servicio, el valor total, la fecha y que esté ordenado por 
 fecha, nombre del servicio y cantidad*/

select c.nombre as contrato,s.codigo,s.nombre as servicio, 
p.tipodoc, d.vtotal,d.fecha
from detallesfac d, servicios s, pacientes p, contratos c
where d.identifica=p.numero and d.contrato=c.codigo and 
d.codigo=s.codigo and p.tipodoc in('RC','TI') and 
s.nombre not like '%CONSULTAS%' and d.vtotal>30000 
and d.estadocar!='A'
order by d.fecha, s.nombre, d.cantidad;

/*5 Se requiere un listado de los detalles de facturación de los 
contratos de SEGUROS y de los exámenes de laboratorio clínico 
(los códigos comienzan por 90). Muestre el nombre del contrato, 
el código y descripción del servicio, la fecha, el valor unitario, 
la cantidad y el estado del registro facturado*/
select c.nombre as nomcontrato,d.codigo,d.descripcion, d.fecha,
d.vunitario,d.cantidad,d.estadocar
FROM contratos c, detallesfac d
where c.codigo=d.contrato and c.nombre like '%SEGUROS%'
and d.codigo like '90%';

/*6.Muestre el nombre del contrato, la fecha del registro de detallesfac,
 la descripción del servicio, el valor total. Muestre sólo los registros 
 de los contratos activos y de los detalles de facturación no anulados.*/
select c.nombre as nomcontrato, d.fecha,d.descripcion,d.vtotal
FROM contratos c, detallesfac d
where c.codigo=d.contrato and c.estado=1 and d.estadocar!='A';

/*7 En la tabla detallesfac está la descripción del servicio y en la 
tabla servicios está el nombre del servicio. Se supone que los nombres en 
ambas tablas son iguales. Realice una consulta para mirar si existen 
diferencias en algunos nombres.*/
select s.nombre as nomservicio,d.descripcion
from servicios s, detallesfac d
where s.codigo=d.codigo and s.nombre!=d.descripcion


/*8 Muestre los nombres de los contratos, el nombre del servicio, la fecha del registro 
facturado, de aquellos registros que se realizaron en el minutos 50 o en 
los minutos del 20 al 30, de las unidades funcionales de la 001 a la 005 
y de los contratos que no sean de ARL ni ARP, donde los cargos no estén 
anulados , el contrato esté activo, los servicios 
sean de la uniad funcional de CONSULTA o de la unidad funcional de 
LABORATORIO y que hayan sido cargados a mayores de edad (CC)*/

select c.nombre as nomcontrato, s.nombre as nomservicio,d.fecha,d.hora
from contratos c, servicios s, detallesfac d
where d.codigo=s.codigo and c.codigo=d.contrato and 
(substr(d.hora,4,2)= '50' or minute(d.hora) between 20 and 30) 
and d.unidadf between '001' and '005' AND NOT(c.nombre like '%ARP%' or
c.nombre like '%ARL%') and d.estadocar!='A' and c.estado=1 and 
d.unidadf in('001','004') and d.tipodoc='CC'

/*de esta ultima consulta se requieren los apellidos y nombres del 
paciente*/
select c.nombre as nomcontrato, s.nombre as nomservicio,d.fecha,d.hora,
p.apellido1,p.apellido2,p.nombre1,p.nombre2
from contratos c, servicios s, detallesfac d,pacientes p
where d.codigo=s.codigo and c.codigo=d.contrato and p.numero=d.identifica
and (substr(d.hora,4,2)= '50' or minute(d.hora) between 20 and 30) 
and d.unidadf between '001' and '005' AND NOT(c.nombre like '%ARP%' or
c.nombre like '%ARL%') and d.estadocar!='A' and c.estado=1 and 
d.unidadf in('001','004') and d.tipodoc='CC'

/*no se conocen los codigos de las unidades funcionales*/
select c.nombre as nomcontrato, s.nombre as nomservicio,d.fecha,d.hora,
p.apellido1,p.apellido2,p.nombre1,p.nombre2
from contratos c, servicios s, detallesfac d,pacientes p,unidadesf u
where d.codigo=s.codigo and c.codigo=d.contrato and p.numero=d.identifica
and d.unidadf=u.codigo and
(substr(d.hora,4,2)= '50' or minute(d.hora) between 20 and 30) 
and d.unidadf between '001' and '005' AND NOT(c.nombre like '%ARP%' or
c.nombre like '%ARL%') and d.estadocar!='A' and c.estado=1 and 
(u.nombre like '%CONSULTA%' or u.nombre like '%LABORATORIO%') 
and d.tipodoc='CC'

select * from unidadesf
select * from contratos
where NOT( nombre like '%ARP%' or
nombre like '%ARL%')

select * from detallesfac
where hora like '%50' or substr(hora,4,2) between '20' and '30'  

select * from detallesfac
where substr(hora,4,2)= '50'  or minute(hora) between 20 and 30     

select * from detallesfac
where minute(hora)= 50 or substr(hora,4,2)>='20' and substr(hora,4,2)<='30'






 