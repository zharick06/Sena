

create schema Booker;
use Booker;

create table usuario
( idusuario int primary key not null,
  tipodoc char (2),
  nombre1 char (50),
  nombre2 char (50),
  apellido1 char(50),
  apellido2 char (50),
  email char (100),
  clave char (100),
  direccion varchar (200),
  tipo_usuario varchar (1),
  celular char (10)
);

create table libro
( idlibro int primary key not null,
 nombrelibro char (50),
 generolibro int,
 autor int,
 estadolibro char (1),
 editorial int,
 isbn varchar (20),
 ejemplar varchar (15),
 version char (12)
 );
 
 create table autor
 ( idautor int primary key not null auto_increment,
   nombresautor char (50),
   apellidosautor char (50),
   paisnacimiento int
 );
 
 create table editorial
 (ideditorial  int primary key not null,
 nombre char (100)
 );
 
 create table pais
 (idpais int primary key not null,
 nombre char(50)
 );
 
 
 create table genero
 (idgenero int primary key not null,
  nombre char (50)
 );
 
 create table historial
 (idhistorial int primary key not null
 prestamo int,
 fecha datetime,
 valoracu    decimal(19,5)
 );
 
 create table multas
 (idmulta int primary key not null,
 tipo char (1),
 costo decimal (19,5) 
 );
 
 
 create table prestamo	
 (idprestamo int primary key not null auto_increment,
 libro int,
 usuario int, 
 fechasalida datetime,
 fechaentrega datetime,
 fechalimite datetime
 
 );
 
 
 --------------------------------
 alter table usuario
  ADD KEY `multas` (`multa`),
  ADD KEY  `libro` (`libro`) ;
  
  ALTER TABLE usuario
  ADD CONSTRAINT `usuario-m` FOREIGN KEY (`multa`) REFERENCES `multas` (`idmulta`),
  ADD CONSTRAINT `usuario-l` FOREIGN KEY (`libro`) REFERENCES `libro` (`idlibro`);
----------------------------------------------
  alter table libro
  ADD KEY `genero` (`generolibro`),
  ADD KEY `autor` (`autor`),
  ADD KEY `editorial` (`editorial`)
  ;
  
ALTER TABLE libro
  ADD CONSTRAINT `libro-g` FOREIGN KEY (`generolibro`) REFERENCES `genero` (`idgenero`),
  ADD CONSTRAINT `libro-a` FOREIGN KEY (`autor`) REFERENCES `autor` (`idautor`),
  ADD CONSTRAINT `libro-e` FOREIGN KEY (`editorial`) REFERENCES `editorial` (`ideditorial`);
----------------------------------------------------------------------------

alter table autor
ADD KEY `pais` (`paisnacimiento`);

ALTER TABLE autor
  ADD CONSTRAINT `autor-p` FOREIGN KEY (`paisnacimiento`) REFERENCES `pais` (`idpais`);
---------------------------------------------------------------------------------------
alter table historial
ADD KEY `prestamo` (`prestamo`);

ALTER TABLE historial
  ADD CONSTRAINT `historial-p` FOREIGN KEY (`prestamo`) REFERENCES `prestamo` (`idprestamo`);

---------------------------------------------------------------------------------------
  alter table prestamo
  ADD KEY `libro` (`libro`),
  ADD KEY `usuario` (`usuario`)
  ;
  
ALTER TABLE prestamo
  ADD CONSTRAINT `prestamo-l` FOREIGN KEY (`libro`) REFERENCES `libro` (`idlibro`),
  ADD CONSTRAINT `prestamo-u` FOREIGN KEY (`usuario`) REFERENCES `usuario` (`idusuario`);
  


 
 
