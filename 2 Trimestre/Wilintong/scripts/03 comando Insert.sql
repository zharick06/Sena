/*comandos DML
 DATA MANIPULATION LANGUAGE
 LENGUAJE DE MANIPULACION DE DATOS
 CRUD*/
 
 /*COMANDO INSERT */
 /*SINTAXIS GENERAL
 INSERT INTO NOMBRE_TABLA(campo1,campo2,campo3,...campon)
  VALUES(valor1,valor2,valor3,...valorn)
  observaciones: 
  la cantidad de campos debe ser IGUAL  a la cantidad de
  valores
  el valor de cada campo es RELATIVO a cada posición
  donde se ubique el campo y el valor
  */
  /*variante 1 INSERT- con lista de campos*/
  insert into editoriales(codigo,nombre) 
  values ('E02','Editorial Planeta');
  
  /*variante 2 INSERT- SIN lista de campos*/
  /*atencion. debo enviar los valores de
  IGUAL FORMA a la estructura de la tabla*/
  insert into editoriales 
  values ('E03','Editorial grupo argentina');
  
  /*esta instruccion me genera un error*/
  insert into editoriales 
  values ('E04');
  
  /*variante 3 INSERT- lista de campos en cualquier orden
  y cualquier cantidad*/
  insert into generos(nombre,codigo)
  values('Matemáticas','G02');
  
  insert into generos(codigo)
  values('G03');
  
  /*variante 4 INSERT - campos autonuméricos
  los campos AI se deben IGNORAR en el insert
  y en ese escenario es OBLIGATORIO tener
  una lista de campos*/
  insert into autores(nombre) 
  values('Gabriel Garcia M');
  
  insert into autores(idautor,nombre) 
  values(15,'Napoleón Hill');
  
  insert into autores(nombre) 
  values('Juan Romero');
  
  /*variante 5 INSERT - varios registros en una
   sola instrucción*/
   insert into generos values
   ('G04', 'Medicina'),
   ('G05', 'Administración'),
   ('G06', 'Informática'),
   ('G07', 'Electrónica'),
   ('G08', 'Quimica');

/*insertar un libro*/
insert into libros (titulo, genero,estado, paginas, 
editorial,precio) 
values ('Poder','G01','A', 450,'E01', 100000);

insert into libros (titulo,estado, paginas, 
editorial,precio) 
values ('Poder 2','A', 450,'E01', 100000);

insert into libros (titulo,genero,estado, paginas, 
editorial,precio) 
values ('Poder 3',null,'A', 450,'E01', 100000);

   
   