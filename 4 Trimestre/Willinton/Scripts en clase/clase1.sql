select * from pacientes where tipodoc is not null;
select * from pacientes where isnull(tipodoc);
select * from clinica2250076.pacientes;
update pacientes set tipodoc=null where numero="1000002360";
update pacientes set nombre2=null where numero="1000002360";

select concat(apellido1,' ',apellido2,' ',nombre1,' ',nombre2)as pacientes from pacientes; 

select coalesce(nombre2) from pacientes ;

select estcivil, (estcivil+10) from pacientes;