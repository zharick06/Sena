	

	 CREATE TABLE mesero( 
	documento char(12) primary Key NOT NULL,
	 tipodoc char (2) NOT NULL, 
	nombre1 char(20) NOT NULL,
	nombre2 char(20) NOT NULL,
	 apellido1 char(20) NOT NULL,
	 apellido2 char(20) NOT NULL,
	correo char(50) NOT NULL,
	 telefono char(12) NOT NULL,
	genero char(1) NOT NULL,
	 direccion char(30) NOT NULL, 
	municipio int,
        departamento int,
	 usuario char (20) NOT NULL, 
	contraseña char(100)  NOT NULL
	 );

	CREATE TABLE restaurante(
	 nit int primary key not null,
	nombre char(70)NOT NULL,
	 correo char(50)NOT NULL,
	 logo bytea,
	 municipio int NOT NULL,
         departamento int,
	  direccion char(50) NOT NULL,
	 telefono char(15) NOT NULL,
	 celular char(15) NOT NULL,
	contraseña char(100) NOT NULL
	) ;

	CREATE TABLE cocina(
	codigo serial primary key  NOT NULL,
	 usuario char(20) NOT NULL,
	contraseña char(100)NOT NULL,
	restaurante int  NOT NULL
	);



	CREATE TABLE municipio( 
	codigo serial primary key NOT NULL, 
	nombre char(20)NOT NULL 
	);

        CREATE TABLE departamento( 
	codigo serial primary key NOT NULL , 
	nombre char(20)NOT NULL 
	);

	CREATE TABLE oferta(
	codigo serial primary key NOT NULL ,
	descripcion char(100) NOT NULL,
	pago char(50) NOT NULL,
	fechaPublicacion date NOT NULL,
	 restaurante int NOT NULL
	);

	 CREATE TABLE mesas( 
	codigo serial primary key NOT NULL, 
	estado char(1) NOT NULL,
	restaurante int NOT NULL
	);

	CREATE TABLE categoria(
	   codigo int primary key NOT NULL,
	  nombre char(20)NOT NULL
	   );

	CREATE TABLE facturas(
	codigo serial primary key ,
	mesero char(12) NOT NULL,
	pedido int NOT NULL,
	total decimal(12,2) NOT NULL,
    fecha TIMESTAMP NOT NULL,
	restaurante int NOT NULL
	);

	CREATE TABLE estado(
	codigo int primary key not null,
	mesero char(12) NOT NULL,
	restaurante int NOT NULL,
	horaEntrada TIME NOT NULL,
	horaSalida time NOT NULL,
	estado char(2) NOT NULL
	);

	CREATE TABLE admin(
	idAdmin serial primary key  NOT NULL,
	usuario char(20) NOT NULL,
	contraseña char(20)NOT NULL
	);

	CREATE TABLE postularse(
	codigo serial primary key  NOT NULL,
	oferta int NOT NULL,
    fecha timestamp NOT NULL,
	mesero char(12) NOT NULL
	);

	CREATE TABLE menu(
	idArticulo int primary key not null,
	nombre char(50) NOT NULL,
	descripcion char(100) NOT NULL,
	valor decimal(3,3) NOT NULL,
	categoria int NOT NULL,
	restaurante int NOT NULL
	);

	CREATE TABLE pedido(
	idPedido serial primary key NOT NULL ,
	mesa int NOT NULL,
	estado char(2),
    fecha timestamp NOT NULL,
	restaurante int NOT NULL
	);


	CREATE TABLE detalle_pedido(
	idRegistro serial primary key NOT NULL ,
	pedido int NOT NULL,
	articulo int NOT NULL,
	cantidad numeric(5) NOT NULL,
	valorunitario decimal(3,3) NOT NULL
	);

        

/*Mesero*/
ALTER TABLE mesero
     ADD CONSTRAINT FK_MM FOREIGN KEY (municipio) REFERENCES municipio(codigo),
    ADD CONSTRAINT FK_MD  FOREIGN KEY (departamento) REFERENCES departamento(codigo);

/*Restaurante*/
ALTER TABLE restaurante
     ADD CONSTRAINT FK_MR FOREIGN KEY (municipio) REFERENCES municipio(codigo),
     ADD CONSTRAINT FK_MDE  FOREIGN KEY (departamento) REFERENCES departamento(codigo);

/*Cocina*/
ALTER TABLE cocina
 ADD CONSTRAINT FK_CR FOREIGN KEY (restaurante) REFERENCES restaurante(nit);

/*Ofertas*/
	ALTER TABLE oferta
	    ADD CONSTRAINT FK_CO FOREIGN KEY (restaurante) REFERENCES restaurante(nit);

/*Mesas*/ 
  ALTER TABLE mesas
  ADD CONSTRAINT FK_CM  FOREIGN KEY (restaurante) REFERENCES restaurante(nit);

/*facturas*/
 ALTER TABLE  facturas
   ADD CONSTRAINT FK_MF  FOREIGN KEY (mesero) REFERENCES mesero(documento), 
   ADD CONSTRAINT FK_PF FOREIGN KEY (pedido) REFERENCES pedido(idPedido),
   ADD CONSTRAINT FK_RF  FOREIGN KEY (restaurante) REFERENCES restaurante(nit);

/*estado*/
 ALTER TABLE  estado
  ADD CONSTRAINT FK_ME  FOREIGN KEY (mesero) REFERENCES mesero(documento),
  ADD CONSTRAINT FK_RE  FOREIGN KEY (restaurante) REFERENCES restaurante(nit);

/*Postularse*/
ALTER TABLE   postularse
  ADD CONSTRAINT FK_MP  FOREIGN KEY (mesero) REFERENCES mesero(documento),
  ADD CONSTRAINT FK_OP  FOREIGN KEY (oferta) REFERENCES oferta(codigo);

/*Menu*/
ALTER TABLE menu
   ADD CONSTRAINT FK_categoria FOREIGN KEY (categoria) REFERENCES categoria (codigo),
   ADD CONSTRAINT FK_RM FOREIGN KEY (restaurante) REFERENCES restaurante(nit);


/* pedido */
ALTER TABLE    pedido
  ADD CONSTRAINT FK_PM FOREIGN KEY (mesa) REFERENCES mesas(codigo),
  ADD CONSTRAINT FK_PR FOREIGN KEY (restaurante) REFERENCES restaurante(nit);

/*detalles pedido*/

ALTER TABLE detalle_pedido
  ADD CONSTRAINT FR_DP FOREIGN KEY (pedido) REFERENCES pedido(idPedido),
  ADD CONSTRAINT FK_DA FOREIGN KEY (articulo) REFERENCES menu(idArticulo);




