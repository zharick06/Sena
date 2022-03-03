package Controlador;
import Procesos.vo.Paciente;
import Procesos.Procesos;
import Ventanas.VentanaConsultas;
import Ventanas.VentanaPrincipal;
import Ventanas.VentanaRegistro;

public class Principal {

	public static void main(String[] args) {
		VentanaPrincipal miVentana;
		VentanaRegistro miRegitro;
		Procesos misProcesos;
		Paciente miPaciente;
		Coordinador micoordinador;
		VentanaConsultas miConsulta;
		
		micoordinador=new Coordinador();
		miVentana=new VentanaPrincipal();
		miPaciente=new Paciente();
		miRegitro=new VentanaRegistro();
		misProcesos=new Procesos();
		miConsulta=new VentanaConsultas();
		
		
		miPaciente.setCoordinador(micoordinador);
		miRegitro.setCoordinador(micoordinador);
		misProcesos.setCoordinador(micoordinador);
		miVentana.setCoordinador(micoordinador);
		miConsulta.setCoordinador(micoordinador);
		miConsulta.setPaciente(miPaciente);
		
		
		micoordinador.setVentanaPrincipal(miVentana);
		micoordinador.setPaciente(miPaciente);
		micoordinador.setVentanaRegistro(miRegitro);
		micoordinador.setProcesos(misProcesos);
		micoordinador.setVentanaConsultas(miConsulta);
		
		
		miVentana.setVisible(true);
		
		

	}

}
