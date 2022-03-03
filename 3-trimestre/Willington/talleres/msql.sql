select round(sum(vunitario)/count(*),0) from detallesfac 
where descripcion like '%consulta%';

/*4.*/
/*Hallar las personas más jovenes de la base de datos*/
select max(fecnac) from pacientes;

select max(tipodoc) from pacientes;

select max(cantidad) from detallesfac;

/*5.*/
select min(fecnac) from pacientes;

select * from pacientes where fecnac ='1919-12-31 00:00:00';

select max(numero) as maximo, min(numero) as minimo
from pacientes;

select c.nombre as contrato, sum(vtotal) as valor_total
from detallesfac d ,contratos c 
where d.contrato=c.codigo
group by c.nombre
order by 2 desc;	