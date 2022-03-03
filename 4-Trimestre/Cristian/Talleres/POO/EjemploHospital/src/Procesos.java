import javax.swing.JOptionPane;

import clases.CitasMedicas;
import clases.ModeloDatos;
import clases.Paciente;
import clases.empleado.EmpleadoEventual;
import clases.empleado.EmpleadoPlanilla;
import clases.empleado.Medico;

public class Procesos {
	
	ModeloDatos miModeloDatos;
	
	public  Procesos() {
		miModeloDatos=new ModeloDatos();
		presentarMenuOpciones();
	}
	
	public void presentarMenuOpciones() {
		String menu="MENU HOSPITAL\n\n";
		menu+="1.Registrar paciente \n";
		menu+="2.Registrar empleado  \n";
		menu+="3.Registrar cita medica  \n";
		menu+="4.Imprimir informacion \n";
		menu+="5.Salir \n\n";
		menu+="Ingrese una opcion\n";
		
		int opcion=0;
		
		do {
			opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (opcion) {
			case 1: registrarPaciente();	break;
			case 2:	registrarEmpleado(); break;
			case 3:	registrarCitaMedica(); break;
			case 4:	imprimirImformacion(); break;
			case 5:	System.out.println("El sistema ha terminado");break;

			default:System.out.println("No existe el codigo, verifique nuevamente");  break;
			}
			
		} while (opcion!=5);
		
	}

	private void registrarPaciente() {
		Paciente miPaciente=new Paciente();
		miPaciente.registrarDatos();
		
		miModeloDatos.registrarPersona(miPaciente);
	}

	private void registrarEmpleado() {
		String menuTipoEmpleado="Registro de empleados\n";
		menuTipoEmpleado+="1. Empelado eventual \n";
		menuTipoEmpleado+="2. Empleado por planilla \n";
		menuTipoEmpleado+="Seleciones el tipo de empleado";
		
		int tipoEmpleado=Integer.parseInt(JOptionPane.showInputDialog(menuTipoEmpleado));
		
		switch (tipoEmpleado) {
		case 1:
			EmpleadoEventual miEmpleadoEventual=new EmpleadoEventual();
			miEmpleadoEventual.registrarDatos();
			miModeloDatos.registrarPersona(miEmpleadoEventual);
			break;
		case 2 :
			String resp=JOptionPane.showInputDialog("Ingrese si, si es un medico, de lo contrario es otro tipo de empleado");
			if (resp.equalsIgnoreCase("si")) {
				Medico miMedico=new Medico();
				miMedico.registrarDatos();
				miModeloDatos.registrarPersona(miMedico);
				}
			else {
				EmpleadoPlanilla miEmpleadoPlanilla=new EmpleadoPlanilla();
				miEmpleadoPlanilla.registrarDatos();
				miModeloDatos.registrarPersona(miEmpleadoPlanilla);
			}break;
			

		default:System.out.println("el tipo de empleado no es valido intente nuevamente");
			break;
		}
		
	}

	private void registrarCitaMedica() {
		
		String documentoPaciente=JOptionPane.showInputDialog("Ingrese el documento del paciente");
		
		Paciente pacienteEncontrado=miModeloDatos.consultaPacientePorDocuemneto(documentoPaciente);
		if (pacienteEncontrado!=null) {
			String nombreMedico=JOptionPane.showInputDialog("Ingrese el monbre del medico");
			Medico medicoEncontrado=miModeloDatos.consultaMedicoPorNombre(nombreMedico);
			if (medicoEncontrado!=null) {
				String servicio=JOptionPane.showInputDialog("Ingrese el servicio o motivo de la consula");
				String fechaConsulta=JOptionPane.showInputDialog("Ingreser la fecha de la consulat");
				String horaConsulta=JOptionPane.showInputDialog("Ingrese la hora de la consulta");
				String lugar="La cita sera en el consultorio "+ medicoEncontrado.getNumeroDeConsultorio();
				CitasMedicas miCita=new CitasMedicas(pacienteEncontrado, medicoEncontrado, servicio,fechaConsulta,horaConsulta,lugar);
				miModeloDatos.registrarCitaMedica(miCita);
			}else {
					System.out.println("El medico no se encuentra en el sistema");
					
				}	}
						
			else {
				
			System.out.println("El paciente nop se encuentra en el sistema");
				
			
			
		}
		
	}

	private void imprimirImformacion() {
		String menuImprimir="Menu impreciones\n";
		menuImprimir+="1. Listar pacientes \n";
		menuImprimir+="2. Listar empleados eventuales \n";
		menuImprimir+="3. Listar empleados planilla \n";
		menuImprimir+="4. Listar medicos \n";
		menuImprimir+="5. Listar citas programadas \n";
		menuImprimir+="Ingrese una opcion";
		 
	    System.out.println("**********************************************************************");
	    
	    int opcion=Integer.parseInt(JOptionPane.showInputDialog(menuImprimir));
	    
	    switch (opcion) {
		case 1:miModeloDatos.imprimirPacientes();	break;
		case 2:miModeloDatos.imprimirEmpleadosEventuales();	break;
		case 3:miModeloDatos.imprimirEmpleadosPlanilla();	break;
		case 4:miModeloDatos.imprimirMedicos();	break;
		case 5:miModeloDatos.imprimirCitasMedicasProgramadas();	break;
		default:System.out.println("No existe esa opcion");	break;
		}
				
	}
	

}
