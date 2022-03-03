use tiendaC;
/*Cree una vista que permita visualizar el listado de empleados.*/
CREATE VIEW Vistemp AS SELECT * FROM empleado;
select * from Vistemp;

/*Cree una vista que permita visualizar el listado de clientes que pagan en efectivo.*/
CREATE VIEW Vistac as select c.* from cliente c inner join pago p on c.codigo_cliente= p.codigo_cliente
 where p.forma_de_pago in(select forma_de_pago from pago where forma_de_pago='Efectivo');
select * from Vistac;

/*Cree una vista que permita visualizar el listado pedidos solicitados en el primer semestre del 20*/
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
    IF( new.precio_proveedor < 0)
    THEN
        set new.precio_proveedor=0;
    END IF;
END$$
DELIMITER ;

UPDATE `producto` SET `precio_proveedor` = '-2000.00' WHERE codigo_producto = '0001';
select * from producto;

/*Escriba un procedimiento llamado listar_productos que reciba como entrada el nombre de la gama(categorías) 
y muestre un listado de todos los productos que existen dentro de esa gama.21.*/

delimiter $$
create procedure listar_productos(categoria varchar(50))
  begin
  select * from producto where gama=categoria;
end$$
delimiter ;

call listar_productos('media');
  
 

 

 
   
 
 
 
 
