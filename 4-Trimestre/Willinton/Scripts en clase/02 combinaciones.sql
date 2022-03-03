/*combinaciones en SQL*/

/*Crear un paciente con un comando insert*/
insert into manuales (codigo,nombre,base,anno)
values ('01','Manual 2021',0,2021);

insert into eps (codigo,nombre,direccion,telefono,contacto,
tipoentidad,manual)
values ('EPS037','Nueva EPS','Armenia','312452522','juan',
'Privada','01');

insert into pacientes (documento,tipodoc,papellido,sapellido,
pnombre,snombre,direccion,telefono,eps,genero,discapacidad)
values('89003161','CC','RINCÓN','HOYOS','WILLINGTON','',
'ARMENIA','3122890738','EPS037','M','N');

insert into pacientes (documento,tipodoc,papellido,sapellido,
pnombre,snombre,direccion,telefono,eps,genero,discapacidad)
values('18493712','CC','MUÑOZ','RESTREPO','JHON','FABER',
'ARMENIA','3176187272','EPS037','M','N');

/*Se requiere un listado de pacientes. Mostrar apellidos y nombres, 
dirección y teléfono. Y también mostrar en la misma consulta 
el nombre de la eps, la dirección y el teléfono de la eps*/
select p.papellido,p.sapellido,p.pnombre,p.snombre,
p.telefono,e.nombre,e.direccion as direps,e.telefono as teleps
from pacientes p, eps e
where e.codigo=p.eps;

/*3.	Crear otro paciente pero SIN REGISTRO DE EPS*/
insert into pacientes (documento,tipodoc,papellido,sapellido,
pnombre,snombre,direccion,telefono,eps,genero,discapacidad)
values('87945454','CC','GARCIA','LOPEZ','CARLOS','ANDRES',
'ARMENIA','24151212',NULL,'M','N');

insert into pacientes (documento,tipodoc,papellido,sapellido,
pnombre,snombre,direccion,telefono,genero,discapacidad)
values('12457992','CC','MENDEZ','OSORIO','FELIPE','',
'ARMENIA','54572121','M','N');

/*TIPOS DE COMBINACIONES EN SQL*/
/*COMBINACION EXACTA. EL valor de LA llave principal deben coindicir
EXACTAMENTE CON EL VALOR DE LA llave foránea. si existen valores
nulos en la llave foránea estos registros son IGNORADOS EN
la consulta*/
/* las combinaciones exactas se implementan con la clausula
	INNER JOIN*/
select p.papellido,p.sapellido,p.pnombre,p.snombre,
p.telefono,e.nombre,e.direccion as direps,e.telefono as teleps
from pacientes p inner join eps e
on e.codigo=p.eps;

/*agregar a la consulta anterior el nombre del manual*/
/*consulta sin combinaciones*/
select p.papellido,p.sapellido,p.pnombre,p.snombre,
p.telefono,e.nombre,e.direccion as direps,e.telefono as teleps,
m.nombre as nommanual
from pacientes p, eps e, manuales m
where e.codigo=p.eps and e.manual=m.codigo;
/*consulta con combinaciones*/
select p.papellido,p.sapellido,p.pnombre,p.snombre,
p.telefono,e.nombre,e.direccion as direps,e.telefono as teleps,
m.nombre as nommanual
from pacientes p inner join eps e on e.codigo=p.eps
inner join manuales m on e.manual=m.codigo

