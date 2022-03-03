insert into pacientes values('1103496882','TI','Martinez','Rodriguez','Zharick','Katiuzca','Fundadores manzana 9 casa 16','3146754331','CCF031','F','S' );
insert into eps values('CCF031','Nueva-Eps','Manzana-9 casa 16','3146754331','3206868908','Sub','02' );
insert into manuales values('02','nose xd','34.5','2021');

insert into pacientes values('64589515','CC','Rodriguez','Carvajal','Luz','Nadllibe','Fundadores manzana 9 casa 16','3206868908','CCF032','F','S' );

insert into eps values('CCF032','Nueva-Eps','calle 2 armenia','326868908','3146754331','Con','01' );
insert into manuales values('01','Xd','24.5','2021');

insert into pacientes values('19826562','CC','Noreña','carmona','juan','sebastian','la villa-9-16','3205467331',null,'M','N');

insert into pacientes (documento,tipodoc,papellido,sapellido,
pnombre,snombre,direccion,telefono,genero,discapacidad)
values('12457992','CC','MENDEZ','OSORIO','FELIPE','',
'ARMENIA','54572121','M','N');
insert into pacientes (documento,tipodoc,papellido,sapellido,
pnombre,snombre,direccion,telefono,eps,genero,discapacidad)
values('87945454','CC','GARCIA','LOPEZ','CARLOS','ANDRES',
'ARMENIA','24151212',NULL,'M','N');


/*Se requiere un listado de pacientes. Mostrar apellidos y nombres, dirección y teléfono. Y también mostrar en la misma consulta el nombre de la eps, la dirección y el teléfono de la eps*/
select concat(p.papellido,' ',p.sapellido) as Apellidos, concat(p.pnombre,' ',p.snombre) as nombres, p.direccion,p.telefono,e.nombre,e.telefono,e.direccion from pacientes p, eps e where p.eps=e.codigo;
/*cuando se esta seguro que la llave foranea tiene un valor*/
select concat(p.papellido,' ',p.sapellido) as Apellidos, concat(p.pnombre,' ',p.snombre) as nombres, p.direccion,p.telefono,e.nombre,e.telefono,e.direccion from pacientes p inner join eps e on p.eps=e.codigo;

select concat(p.papellido,' ',p.sapellido) as Apellidos, concat(p.pnombre,' ',p.snombre) as nombres, p.direccion,p.telefono,e.nombre,e.telefono,e.direccion,m.nombre from pacientes p inner join eps e on p.eps=e.codigo inner join manuales m on e.manual=m.codigo;


select * from pacientes;
