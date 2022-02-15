create schema bd_PRUEBAS2250076;
use bd_PRUEBAS2250076;

create table especialidades
( codigo char(3) primary key not null,
  nombre char(60) not null,
  estado tinyint
);

create table medicos
( idmedico int primary key not null auto_increment,
  documento char(15),
  regmedico char(20),
  nombres char(40),
  apellidos char(40),
  direccion varchar(100),
  telefono char(30),
  especialidad char(3),
  firma varchar(100)
  );

create table pacientes_fotos
( documento char(20) primary key not null,
  foto blob
);

create table pacientes
( documento char(20) primary key not null,
  tipodoc char(2),
  papellido char(20),
  sapellido char(20),
  pnombre char(20),
  snombre char(20),
  direccion varchar(100),
  telefono char(30),
  eps char(6),
  genero char(1),
  discapacidad char(1)
  );

/*comando alter table*/
/*alter table nombretabla accion
accion: 
agregar - add
modificar - modify
cambiar   - change
*/

create table eps
( codigo char(3) primary key not null,
  nombre varchar(80),
  direccion varchar(100),
  telefono char(30),
  contacto varchar(50),
  tipoentidad char(10),
  manual char(2)
  );

create table tarifas
(idregistro int primary key not null auto_increment,
codmanual char(2),
codservicio char(10),
valor FLOAT
);


create table servicios
(codigo CHAR(10) primary key not null,
nombre VARCHAR (300),
estado TINYINT(4)
);

create table manuales
(codigo CHAR(2) primary key not null,
nombre CHAR(50),
base FLOAT,
anno INT(11)
);

create table usuarios
(idusuario INT primary key not null auto_increment,
nombre VARCHAR(80),
direccion VARCHAR(100),
telefono CHAR(30),
email VARCHAR(80),
password VARCHAR(256)
);

create table citas
(idcita INT primary key not null auto_increment,
fecha DATE,
hora CHAR(5),
medico INT(11),
eps CHAR(6),
paciente CHAR(20),
servicio CHAR(10),
estado TINYINT(4),
idusuario INT(11)
);

/* RELACIONES */
/* Manuales con  Tarifa */
alter table tarifas add foreign key `FK_codigo_manua_tari` (codmanual)
references manuales(codigo);


/* Tarifas con Servisios */
alter table tarifas add foreign key `FK_codigo_serv_tari` (codservicio)
references servicios(codigo);

/* Manuales con eps */
alter table eps add foreign key `FK_codigo_manua_eps` (manual)
references manuales(codigo);

/* pacientes con eps*/
alter table pacientes add foreign key `FK_codigo_eps_pacientes_eps`(eps)
references eps(codigo);

/* eps con citas */
alter table citas add foreign key `FK_codigo_eps_citas` (eps)
references eps(codigo); 

/* citas con medicos */
alter table citas add foreign key `FK_idmedico_medic_citas` (medico)
references medicos(idmedico);

/* citas con servicios */
alter table citas add foreign key `FK_codigo_servi_citas` (servicio)
references servicios(codigo);

/* citas con usuarios */
alter table citas add foreign key `FK_idusuarios_usuarios_citas` (idusuario)
references usuarios(idusuario);

/* citas con pacientes */
alter table citas add foreign key `FK_idusuarios_pacientes_citas` (paciente)
references pacientes(documento);

/* pacientes con pacientes_fotos */
alter table pacientes_fotos add foreign key `FK_documento_pacientes_fotos_pacientes` (documento)
references pacientes(documento);

/* especialidades con medicos */
alter table medicos add foreign key `FK_codigo_especi_medic` (especialidad)
references especialidades(codigo);





/* relaciones de la tabla citas en una sola petición*/
/*
alter table citas add foreign key `FK_codigo_eps_citas` (eps)
references eps(codigo),
add foreign key `FK_idmedico_medic_citas` (medico)
references medicos(idmedico),
add foreign key `FK_codigo_servi_citas` (servicio)
references servicios(codigo),
add foreign key `FK_idusuarios_usuarios_citas` (idusuario)
references usuarios(idusuario),
add foreign key `FK_idusuarios_pacientes_citas` (paciente)
references pacientes(documento);
*/



