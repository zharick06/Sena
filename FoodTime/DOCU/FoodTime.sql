Create DATABASE FoodTime;
use FoodTime;

 CREATE TABLE mesero( 
documento int primary Key NOT NULL,
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
 usuario char (20) NOT NULL, 
contraseña char(10)  NOT NULL
 );

CREATE TABLE restaurante(
 nit int primary key not null,
nombre char(70)NOT NULL,
 correo char(50)NOT NULL,
 logo longblob,
 municipio int NOT NULL,
  direccion char(50) NOT NULL,
 telefono char(15) NOT NULL,
 celular char(15) NOT NULL,
contraseña char(10) NOT NULL
) ;

CREATE TABLE cocina(
codigo int primary key AUTO_INCREMENT NOT NULL,
 usuario char(20) NOT NULL,
contraseña char(20)NOT NULL,
restaurante int  NOT NULL
);



CREATE TABLE municipio( 
codigo int primary key NOT NULL AUTO_INCREMENT, 
nombre char(20)NOT NULL 
);

CREATE TABLE oferta(
codigo int primary key NOT NULL AUTO_INCREMENT,
descripcion char(100) NOT NULL,
pago char(50) NOT NULL,
fechaPublicacion date NOT NULL,
 restaurante int NOT NULL
);

 CREATE TABLE mesas( 
codigo int primary key  AUTO_INCREMENT NOT NULL, 
estado char(1) NOT NULL,
restaurante int NOT NULL
);

CREATE TABLE categoria(
   codigo int primary key NOT NULL,
  nombre char(20)NOT NULL
   );

CREATE TABLE facturas(
codigo int primary key auto_increment,
mesero int NOT NULL,
pedido int NOT NULL,
total int (20)NOT NULL,
restaurante int NOT NULL
);

CREATE TABLE estado(
codigo int primary key not null,
mesero int NOT NULL,
restaurante int NOT NULL,
horaEntrada datetime NOT NULL,
horaSalida datetime NOT NULL,
estado char(2) NOT NULL
);

CREATE TABLE admin(
idAdmin int primary key AUTO_INCREMENT NOT NULL,
usuario char(20) NOT NULL,
contraseña char(20)NOT NULL
);

CREATE TABLE postularse(
codigo int primary key AUTO_INCREMENT NOT NULL,
oferta int NOT NULL,
mesero int NOT NULL
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
idPedido int primary key NOT NULL AUTO_INCREMENT,
articulo int NOT NULL,
cantidad numeric NOT NULL,
mesa int NOT NULL,
estado char(2),
restaurante int NOT NULL
);

/* Mesero */
ALTER TABLE mesero
   ADD CONSTRAINT FK_MM  FOREIGN KEY (municipio)  REFERENCES municipio(codigo);

/* Restaurante */
ALTER TABLE restaurante
     ADD CONSTRAINT FK_MR FOREIGN KEY (municipio) REFERENCES municipio(codigo);

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

/* estado */
ALTER TABLE  estado
  ADD CONSTRAINT FK_ME  FOREIGN KEY (mesero) REFERENCES mesero(documento),
  ADD CONSTRAINT FK_RE  FOREIGN KEY (restaurante) REFERENCES restaurante(nit);

/* Postularse */
ALTER TABLE   postularse
  ADD CONSTRAINT FK_MP  FOREIGN KEY (mesero) REFERENCES mesero(documento),
  ADD CONSTRAINT FK_OP  FOREIGN KEY (oferta) REFERENCES oferta(codigo);

/*Menu*/
ALTER TABLE menu
  ADD CONSTRAINT FK_categoria FOREIGN KEY (categoria) REFERENCES categoria (codigo),
  ADD CONSTRAINT FK_RM FOREIGN KEY (restaurante) REFERENCES restaurante(nit);


/* pedido */
ALTER TABLE    pedido
  ADD CONSTRAINT FK_PA  FOREIGN KEY (articulo) REFERENCES menu(idArticulo),
  ADD CONSTRAINT FK_PM FOREIGN KEY (mesa) REFERENCES mesas(codigo);
