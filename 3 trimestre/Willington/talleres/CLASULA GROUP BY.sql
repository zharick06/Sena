select COUNT(sexo), sexo from pacientes group by sexo ;


select  COUNT(sexo), sexo, COUNT(zona), zona from pacientes  group by sexo, zona;

/*Genere una consulta para saber cuánto se ha facturado en la unidad funcional de
laboratorio clínico a pacientes de género Femenino. Muestre los valores consolidados
y los datos de nombres, apellidos y fecha de nacimiento del paciente*/
select d.sexo from  u, detallesfac d


