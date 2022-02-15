use tiendaC;

CREATE VIEW Vistemp AS SELECT * FROM empleado;
select * from Vistemp;

CREATE VIEW Vistac as select c.* from cliente c inner join pago p on c.codigo_cliente= p.codigo_cliente where p.forma_de_pago='Efectivo';
select * from Vistac;

Create view Vistap as select * from pedido where fecha_pedido between'2020-01-31' and '2020-06-30';
select * from Vistap;


/*Cree un trigger que se ejecute sobre la tabla productos.
 Si el nuevo valor del producto que se quiere actualizar es negativo, se guarda como 0.*/
 
 drop trigger productos_BU;
DELIMITER $$
CREATE TRIGGER productos_BU
Before UPDATE
ON producto FOR EACH ROW
BEGIN
    IF new.precio_proveedor < '0.00'
    THEN
        INSERT INTO producto(precio_proveedor) VALUES('0');
    END IF;
END$$
DELIMITER ;

select * from producto;
UPDATE `producto` SET `precio_proveedor` = '2000.00' WHERE codigo_producto = '0001';
 

 

 
   
 
 
 
 
