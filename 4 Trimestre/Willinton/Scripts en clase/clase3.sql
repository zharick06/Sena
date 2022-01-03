/* el left , right y inner join tiene que ir con el on */
/*Cuando el valor esta nulo e la consulta multitbala no va a aparecer en la consulta*/
/*En las combinaciones se le da prioriada a la tabla qu este en el lado izquierda Left Join, no va en la relacion si no el form*/
/*Aqui le est dando prioridad a pacientes*/
select concat(p.papellido,' ',p.sapellido) as Apellidos, 
concat(p.pnombre,' ',p.snombre) as nombres,p.telefono,
e.nombre as nombreeps,e.telefono as telefonoeps,e.direccion as direccioneps 
from pacientes p left join eps e on p.eps=e.codigo;

/*Aqui le est dando prioridad a eps*/
select concat(p.papellido,' ',p.sapellido) as Apellidos, 
concat(p.pnombre,' ',p.snombre) as nombres,p.telefono,
e.nombre as nombreeps,e.telefono as telefonoeps,e.direccion as direccioneps 
from eps e left join pacientes p  on p.eps=e.codigo;

/*Aqui le est dando prioridad a pacientes*/
select concat(p.papellido,' ',p.sapellido) as Apellidos, 
concat(p.pnombre,' ',p.snombre) as nombres,p.telefono,
e.nombre as nombreeps,e.telefono as telefonoeps,e.direccion as direccioneps 
from eps e right join pacientes p  on p.eps=e.codigo;

select concat(p.papellido,' ',p.sapellido) as Apellidos, 
concat(p.pnombre,' ',p.snombre) as nombres,p.telefono,
e.nombre as eps,e.telefono as telefonoeps,e.direccion as direccioneps,m.nombre as manual
from eps e right join pacientes p  on p.eps=e.codigo left join manuales m on m.codigo=e.manual;

insert into eps values('CCF035','Cosmitet','Sincelejo','326968958','Mariana','Sub','02' );
