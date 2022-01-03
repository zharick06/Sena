select sum(vtotal) from detallesfac where unidadf='004';

select sum(cantidad*vunitario) from detallesfac;

select count(*) from pacientes;
select * from pacientes;

select count(tipodoc) from pacientes;

UPDATE pacientes SET tipodoc = null WHERE numero = '1000002360';

select avg(vunitario) from detallesfac where codigo='931000';

select sum(vunitario)/count(*);

select max(cantidad) from detallesfac;

select max(tipodoc) from detallesfac;

select max(vtotal) from detallesfac;

select distinct tipodoc from detallesfac;

select max(fecnac) from pacientes;

