/*1. Seleccione los nombres del aprendiz, el id de la asesoría, la fecha y hora de la asesoría de 
las asesorías en estado Anulada. Asegúrese de mostrar SOLO los registros con un aprendiz relacionado
 y los datos de las asesorías. (no pueden aparecer valores Nulos) */

select a.nombres,a.apellidos, ias.idasesoria, ias.fecha, ias.hora, ias.estado
from aprendices a inner join asesorias ias on a.documento=ias.aprendiz
where ias.estado='Anulada';  /*5 filas*/
/*MODIFICAR LA CONSULTA PARA OBTENER LA MISMA CANTIDAD DE REGISTROS, MOSTRANDO
SOLO APELLIDOS, NOMBRES, SEXO Y EL CAMPO JUGADORVD. NO SE REQUIERE NINGUN DATO DE LA TABLA
ASESORIAS*/ 



/*2. Seleccione los apellidos y nombres del aprendiz, el nombre del programa de formación 
de los aprendices que sean de ADSI. Muestre también el id de la asesoría SÓLO cuando 
pertenezca dicha asesoría a un aprendiz relacionado.(no pueden salir valores nulos en los datos del aprendiz)
*/
select a.apellidos, a.nombres, p.nombre as nombrePrograma, es.idasesoria 
from aprendices a inner join asesorias es on a.documento=es.aprendiz
inner join programas p on p.codigo=a.programa
where p.nombre='ADSI';  /*17 filas*/

/*MODIFICAR LA CONSULTA SIN MOSTRAR EL NOMBRE DE PROGRAMA DE FORMACION. 
UTILICE UNA SUBCONSULTA*/




/*3. Seleccione los datos de la asesoría, idasesoria, fecha y hora, los apellidos y nombres
del aprendiz, el nombre del programa de formación de los jugadores, nombre del instructor y nombre del
asesor. SIEMPRE debe existir los datos del instructor, pero no interesa si existe o no datos del asesor
o del aprendiz  (pueden quedar nulos). Ordene los datos por el id de la asesoría.*/

select ase.idasesoria, ase.fecha, ase.hora, a.apellidos, a.nombres, p.nombre as nombrePrograma, 
i.nombre as nombreInstructor, ase2.nombres as nombreAsesor
from asesorias ase left join asesores ase2 on ase.asesor = ase2.codigo
inner join instructores i on ase.instructor = i.login
left join aprendices a on ase.aprendiz = a.documento
left join programas p on p.codigo=a.programa
order by 1 asc;  /*25 filas*/

/*MODIFIQUE LA CONSULTA Y AGREGUE 2 SUBCONSULTAS. TENGA EN CUENTA SOLO LOS ASESORES
 CUYO NOMBRE COMIENCE POR LA LETRA L Y QUE EL NOMBRE DEL INSTRUCTOR TENGA UNA M 
 EN CUALQUIER LUGAR. NO SE REQUIERE MOSTRAR NINGUN DATO DE LOS ASESORES, 
 NI TAMPOCO NINGUN DATO DE LOS INSTRUCTORES*/





/*4.Muestre la cantidad de asesorías que se han brindado por cada programa de formación. 
Debe mostrar el nombre del programa de formación y cuantas asesorías se han brindado en 
cada programa. Deben aparecer TODOS los programas de formación así ninguno de los aprendices 
haya tenido asesorías relacionadas. Si un programa de formación no ha tenido aprendices relacionados 
en las asesorías, debe aparecer el nombre del programa de formación y la cantidad en cero.
*/
select p.nombre, count(a.idasesoria) as asesorias
from asesorias a left join aprendices ap on a.aprendiz = ap.documento 
right join programas p on p.codigo = ap.programa 
group by p.nombre
order by 2 desc;  /*8 filas*/
/*AGREGUE UNA SUBCONSULTA PARA TENER EN CUENTA LOS INSTRUCTORES QUE TENGAN UNA 
LETRA S AL FINAL DEL NOMBRE*/






/*5. Muestre la cantidad de asesorías que ha brindado cada instructor.
Sólo muestre los instructores con mas de 3 asesorías. */

select i.nombre, count(*) as cantidad
from instructores i inner join asesorias as1
on i.login = as1.instructor
group by i.nombre
having cantidad>3;

/*AGREGAR UNA SUBCONSULTA QUE TENGA EN CUENTA LAS ASESORIAS BRINDADAS
A LOS APRENDICES QUE JUEGAN VIDEO JUEGOS O QUE NO SE SABE SI LO HACEN*/





