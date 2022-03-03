package clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import clases.empleado.EmpleadoEventual;
import clases.empleado.EmpleadoPlanilla;
import clases.empleado.Medico;


public class ModeloDatos {
	HashMap<String, Paciente> pacientesMap;
	HashMap<String, EmpleadoPlanilla> empleadoPlanillaMap;
	HashMap<String, EmpleadoEventual> empleadoEventualMap;
	HashMap<String, Medico> medicosMap;
	ArrayList<CitasMedicas>citasList;
	
	 public ModeloDatos() {
		 pacientesMap=new HashMap<String, Paciente>();
		 empleadoPlanillaMap=new HashMap<String, EmpleadoPlanilla>();
		 empleadoEventualMap=new HashMap<String, EmpleadoEventual>();
		 medicosMap=new HashMap<String, Medico>(); 
		 citasList=new ArrayList<CitasMedicas>();
	 }
	 
 	public Paciente consultaPacientePorDocuemneto(String documentoPaciente) {
 		 	Paciente mipaciente=null;
 		 	if (pacientesMap.containsKey(documentoPaciente)) {
 		 		mipaciente=pacientesMap.get(documentoPaciente);	
			}
			return mipaciente;
		}
 	
 	public Medico consultaMedicoPorNombre(String nombreMedico) {
		 	for(Medico medico: medicosMap.values()) {
		 		if (medico.getNombre().equalsIgnoreCase(nombreMedico)) {
		 			return medico;
					
				}
		 	}
		return null;
	}
	 
 	
 	public void registrarCitaMedica(CitasMedicas miCitas) {
 		citasList.add(miCitas);
 		System.out.println("Se ha registrado la cita correctamente \n");
 		System.out.println(miCitas.informacionDeCitaMedica());
		
	}
	 
	 public void registrarPersona(Paciente miPaciente ) {
		 pacientesMap.put(miPaciente.getNumeroDeDNI(), miPaciente);
		 System.out.println("Se ha regsitrado el empelado por planilla" +miPaciente.getNombre()+" Satisfactoriamente");
			
		}
	 public void registrarPersona(EmpleadoPlanilla miEmpPlanilla) {
		 empleadoPlanillaMap.put(miEmpPlanilla.getNumeroDeDNI(), miEmpPlanilla);
		 System.out.println("Se ha regsitrado el empelado eventual" +miEmpPlanilla.getNombre()+" Satisfactoriamente");
			
			
		}
	 
	 public void registrarPersona(EmpleadoEventual miEmpEventual) {
		 empleadoEventualMap.put(miEmpEventual.getNumeroDeDNI(), miEmpEventual);
		 System.out.println("Se ha regsitrado el empelado eventual" +miEmpEventual.getNombre()+" Satisfactoriamente");
			
			
		}
	 
	 public void registrarPersona(Medico miMedico) {
		 medicosMap.put(miMedico.getNumeroDeDNI(), miMedico);
		 System.out.println("Se ha regsitrado el paciente" +miMedico.getNombre()+" Satisfactoriamente");
			
			
		}
	 
	 
	 


	public void imprimirPacientes() {
		String msj="Pacientes registrados\n";
		Iterator<String> iterator=pacientesMap.keySet().iterator();
		
		while (iterator.hasNext()) {
			
			String clave=iterator.next();
			pacientesMap.get(clave).imprimirDatosPersona(msj);
			
		}

		
	}


	public void imprimirEmpleadosEventuales() {
		String msj="Empleados eventuales registrados\n";
	
		
		for (String clave : empleadoEventualMap.keySet()) {
			empleadoEventualMap.get(clave).imprimirDatosPersona(msj);
			
		}
		
		
	}


	public void imprimirEmpleadosPlanilla() {
		String msj="Empleado por planilla registrados\n";
	  for (EmpleadoPlanilla empleadoPlanilla: empleadoPlanillaMap.values()) {
		empleadoPlanilla.imprimirDatosPersona(msj);
		
	}
		
	}


	public void imprimirMedicos() {
		String msj="Medicos registrados \n";
		
			

		for(Map.Entry<String, Medico> elemento: medicosMap.entrySet()) {
			//System.out.println("key = "+elemento.getKey()+", value = "+ elemento.getValue());
			//medicosMap.get(elemento.getKey().imprimirDatosPersona(msj));
			elemento.getValue().imprimirDatosPersona(msj);;
		}
		
		
	}

	public void imprimirCitasMedicasProgramadas() {
		String msj="Citas medicas programadas \n";
		CitasMedicas miCita=null;
		System.out.println(msj+"\n");
		
		if (citasList.size()>0) {
		for (int i = 0; i < citasList.size(); i++) {
			miCita=citasList.get(i);
			System.out.println(miCita.informacionDeCitaMedica());
			
		}
			
		}else {
			System.out.println("No existen citas programadas");
		}
	}
	 
	
	

}
