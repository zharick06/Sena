/*taller 2 subconsultas*/
/*1 ¿Cuáles de los contratos no tienen movimientos en la tabla de 
los detalles de facturación?*/
select * from contratos 
where codigo not in(select contrato from detallesfac);

/* Seleccione los pacientes a los cuales se les ha facturado 
servicios en la unidad funcional de consulta externa o de 
laboratorio clínico.*/

/*escenario1*/
select * from pacientes where numero in(select identifica
from detallesfac d inner join unidadesf u on d.unidadf=u.codigo 
where u.nombre like '%CONSULTA EXTERNA%' or 
u.nombre like '%LABORATORIO%')
order by numero;

/*escenario2*/
select p.*,d.factura,d.cantidad,d.descripcion from pacientes p inner join detallesfac d
on p.numero=d.identifica where d.unidadf 
in(select codigo from unidadesf u 
where u.nombre like '%CONSULTA EXTERNA%' or 
u.nombre like '%LABORATORIO%')
order by p.numero;

/*escenario3*/
select * from pacientes where numero in(select identifica
from detallesfac d where unidadf in('001','004'))
order by numero;

/*3 Seleccione los valores totales por contrato de los movimientos 
facturados de los servicios que estén activos, de pacientes de 
género femenino del área urbana.*/
select c.nombre as nomcontrato,sum(d.vtotal) as valortotal
from contratos c inner join detallesfac d on c.codigo=d.contrato
inner join servicios s on s.codigo=d.codigo 
inner join pacientes p on p.numero=d.identifica
where s.estado='A' and p.sexo='F' and p.zona='U'
group by c.nombre
order by 2 desc;
/*ahora con subconsultas*/
select c.nombre as nomcontrato,sum(d.vtotal) as valortotal
from contratos c inner join detallesfac d on c.codigo=d.contrato
where d.codigo in(select codigo from servicios where estado='A') 
and d.identifica in(select numero from pacientes where
sexo='F' and zona='U')
group by c.nombre
order by 2 desc


