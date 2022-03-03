/*1. Muestre la cantidad de pacientes que hay por cada contrato. Muestre el nombre del contrato
y la cantidad de pacientes en cada contrato.*/

select c.nombre, count(*) as cantidad_pacientes
from contratos c, pacientes p
where c.codigo=p.contrato
group by c.nombre;

/*2. Muestre el nombre del servicio (de la tabla servicios) y el valor total promedio al cual se ha
facturado cada uno de los servicios (tenga en cuenta el campo vunitario de la tabla
detallesfac)*/

select s.nombre, avg(d.vunitario) as valorpromedio
from servicios s, detallesfac d
where s.codigo=d.codigo
group by s.nombre;


/*3. Muestre el nombre de la unidad funcional y los valores facturados consolidados por cada
unidad funcional, pero de los contratos que sean de compañías de seguros (tenga en cuenta
el campo nombre de la tabla contratos)*/

Select u.nombre, sum(d.vtotal) as valorfacturado
from unidadesf u, detallesfac d, contratos c
where u.codigo=d.unidadf and d.contrato=c.codigo and c.nombre like '%SEGUROS%'
group by u.nombre;
  
/*4. Muestre el valor total facturado por cada estado civil. muestre el resultado del valor mayor
al valor menor. Muestre el nombre del estado civil teniendo en cuenta estos valores:
1=Soltero(a)
2=Casado(a)
3=Unión Libre
4=Separado(a)
5=Viudo(a)
El estado civil está en la tabla pacientes y el valor total está en la tabla detallesfac.*/
 
select case p.estcivil
	when '1' then 'Soltero(a)'
    when '2' then 'Casado(a)'
    when '3' then 'Unión Libre'
    when '4' then 'Separado(a)'
    when '5' then 'Viudo(a)'
    else 'Estado Civil Desconocido' end as estadocivil, sum(d.vtotal) as valortotal
 from pacientes p, detallesfac d
 where p.numero=d.identifica
 group by p.estcivil
 order by valortotal desc;

/*5. Muestre los primeros 10 pacientes que han facturado en la unidad funcional de laboratorio
clínico. Para ello realice un ordenamiento del valor consolidado de mayor a menor. Tenga
en cuenta los valores totales que superen los 100.000 (cien mil) Pesos*/

select p.apellido1, p.apellido2, p.nombre1, p.nombre2, p.sexo, sum(d.vtotal) as valortotal
from pacientes p, unidadesf u, detallesfac d
where p.numero=d.identifica and d.unidadf=u.codigo and u.nombre like '%LABORATORIO%'
group by p.apellido1, p.apellido2, p.nombre1, p.nombre2, p.sexo
having valortotal>100000
order by valortotal desc
limit 10


