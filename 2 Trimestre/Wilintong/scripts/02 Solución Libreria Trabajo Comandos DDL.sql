create schema libreria_2250076;
use libreria_2250076;

create table autores
( idautor int primary key not null auto_increment,
  nombre char(100)
);

create table generos
( codigo char(3) primary key not null,
  nombre char(50)
);

create table editoriales
( codigo char(3) primary key not null,
  nombre char(50)
);

create table usuarios
( idusuario int primary key not null auto_increment,
  nombres char(80),
  email varchar(100),
  password varchar(30),
  estado char(1)
);

create table registro_prestamo
( idprestamo int  primary key not null auto_increment,
  fecha_prestamo date,
  hora_prestamo time,
  fecha_estipulada date,
  libro int,
  usuario int,
  foreign key `FK_usuario_registro_prestamo_usuarios` (usuario)
  references usuarios(idusuario),
  estado char(1),
  fecha_entrega date,
  hora_entrega time
);

create table libros
( idlibro int primary key not null auto_increment,
  titulo char(150),
  genero char(3),
  foreign key `FK_genero_libros_generos` (genero)
  references generos(codigo),
  estado char(1),
  paginas int,
  editorial char(3),
  foreign key `FK_editorial_libros_editoriales` (editorial)
  references editoriales(codigo),
  precio float
);

create table autoria
( idautoria int primary key not null auto_increment,
  idautor int,
  foreign key `FK_idautor_autoria_autores` (idautor)
  references autores(idautor),
  idlibro int,
  foreign key `FK_idlibro_autoria_autores` (idlibro)
  references libros(idlibro)
);

alter table registro_prestamo
add foreign key `FK_libro_registro_prestamo_libros` (libro)
references libros(idlibro);


