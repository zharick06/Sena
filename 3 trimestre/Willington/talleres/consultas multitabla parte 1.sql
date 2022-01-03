select d.fecha,d.hora,
d.contrato,c.nombre,d.vtotal,
d.codigo,d.descripcion
from detallesfac d,contratos c
where d.contrato=c.codigo;

/*se requiere el nombre de la unidad funcional
y los datos de el codigo y la descripcion
del servicio de los movimientos facturados
así como la cantidad, el valor unitario y el valor
total*/

select u.nombre, d.codigo,d.descripcion,d.cantidad,
d.vunitario,d.vtotal
from unidadesf u, detallesfac d
where u.codigo=d.unidadf;

/*movimientos de facturacion mostrando
la fecha, la hora, el ncargo, cantidad,
valor unitario y los
apellidos y nombres del paciente*/
select d.fecha,d.hora,d.ncargo,d.cantidad,
d.vunitario, p.apellido1,p.apellido2,p.nombre1,
p.nombre2
from detallesfac d, pacientes p
where d.identifica=p.numero

select * from contratos