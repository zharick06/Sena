/*SUBCONSULTAS*/

/*generar los registros de la tabla detallesfac donde los
contratos(campo contrato) sean contratos cuyo estado sea inactivo*/
select c.nombre, c.estado,d.*
from contratos c inner join detallesfac d on d.contrato = c.codigo
where c.estado != 1;

update contratos set estado=2 where codigo in('070','159');

select d.*
from detallesfac d 
where contrato in('070','159');

update contratos set estado=2 where codigo in('161');

select d.*
from detallesfac d 
where contrato in('070','159','161');

select codigo from contratos where estado!=1;

select d.*
from detallesfac d 
where contrato in(select c.codigo from contratos c where c.estado!=1);
/*esta consulta con subconsulta NO PERMITE VINCULAR CAMPOS DE 
LA TABLA CONTRATOS PARA MOSTRARLOS COMO RESULTADO DE LA CONSULTA*/

select c.nombre, c.estado,d.*
from contratos c inner join detallesfac d on d.contrato = c.codigo
where c.estado != 1;

/*seleccione los movimientos de facturacion de los contratos que estan
activos y de los servicios que están activos. NO SE REQUIEREN
DATOS NI DE LOS CONTRATOS NI DE LOS SERVICIOS*/
select d.*
from detallesfac d 
where contrato in(select c.codigo from contratos c where c.estado=1)
AND codigo in(select codigo from servicios where estado='A');

/*modificar esta consulta para mostrar el nombre del contrato*/







