
create database tiendaC;
use tiendaC;

create table `producto`(
 codigo_producto varchar(15) primary key,
 nombre varchar(70),
 gama varchar(50),
 dimenciones varchar(25),
 proveedor varchar(50),
 descripcion text,
 cantidad_en_stock smallint(6),
 proveedor_venta decimal(15,2),
 precio_proveedor decimal(15,2) 
 );
  create table `cliente`(
  codigo_cliente int primary key,
  nombre_cliente varchar(50),
  nombre_contacto varchar(30),
  apellido_contacto varchar(30),
  telefono varchar(15),
  fax varchar(15),
  linea_direccion1 varchar(50),
  linea_direccion2 varchar(50),
  ciudad varchar(50),
  region varchar(50),
  pais varchar(50),
  codigo_postal varchar(10),
  codigo_empleado_rep_ventas int,
  limite_credito decimal(15,2)
  );
  
  create table `detalle_pedido`(
  codigo_pedido int,
  coidigo_producto varchar(15),
  cantidad  int,
  precio_unidad decimal(15,2),
  numero_linea smallint(6)
  );
  
  create table `empleado`(
  codigo_empleado int primary key,
  nombre varchar(50),
  apellido1 varchar(50),
  apellido2 varchar(50), 
  extencion varchar(10),
  email varchar(100),
  codigo_oficina varchar(10),
  codigo_jefe int,
  puesto varchar(50)  
  );
  
  create table `oficina`(
  codigo_oficina varchar(10) primary key,
  cidudad varchar(30),
  pais varchar(50),
  region varchar(50),
  codigo_postal varchar(10),
  telefono varchar(20),
  linea_direccion1 varchar(50),
  linea_direccion2 varchar(50)
  );
  
  create table `pedido`(
  codigo_pedido int primary key,
  fecha_pedido date,
  fecha_espera date,
  estado varchar(15),
  comentarios text,
  codigo_cliente int
  );
  
  create table `pago`(
  codigo_cliente int,
  forma_de_pago varchar(40),
  id_transancion  varchar(50),
  fecha_pago date,
  total decimal(15,2)
  );
  
  create table `gama_producto`(
  gama varchar(50) primary key,
  descripcion_texto text,
  descripcion_html text,
  imagen varchar(256)
  );
  
  
  ALTER TABLE producto
  ADD CONSTRAINT FR_DP FOREIGN KEY (gama) REFERENCES gama_producto(gama);
  
  ALTER TABLE detalle_pedido
  ADD CONSTRAINT FR_DR FOREIGN KEY (codigo_pedido) REFERENCES pedido(codigo_pedido),
  ADD CONSTRAINT FR_PD FOREIGN KEY (coidigo_producto) REFERENCES producto(codigo_producto);
  
  
  ALTER TABLE pedido 
  ADD CONSTRAINT FR_EC FOREIGN KEY (codigo_cliente) REFERENCES cliente(codigo_cliente);
  
  ALTER TABLE cliente
  ADD CONSTRAINT FR_CE FOREIGN KEY (codigo_empleado_rep_ventas) REFERENCES empleado(codigo_empleado);
  
  ALTER TABLE pago
  ADD CONSTRAINT FR_DC FOREIGN KEY (codigo_cliente) REFERENCES cliente(codigo_cliente); 
  
  ALTER TABLE empleado
  ADD CONSTRAINT FR_EO FOREIGN KEY (codigo_oficina) REFERENCES oficina(codigo_oficina),
  ADD CONSTRAINT FR_EJ FOREIGN KEY( codigo_jefe ) REFERENCES empleado( codigo_empleado);
  
  