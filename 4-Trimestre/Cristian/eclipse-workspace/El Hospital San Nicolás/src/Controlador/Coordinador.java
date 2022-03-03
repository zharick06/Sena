package Controlador;

import Procesos.vo.Paciente;
import Procesos.Procesos;
import Ventanas.VentanaConsultas;
import Ventanas.VentanaPrincipal;
import Ventanas.VentanaRegistro;

public class Coordinador {

	private VentanaPrincipal miVentana;
	private Paciente miPaciente;
	private VentanaRegistro miRegitro;
	private Procesos misProcesos;
	private VentanaConsultas miConsulta;
	
	

	public void setVentanaPrincipal(VentanaPrincipal miVentana) {
		this.miVentana=miVentana;
		
	}

	public void setPaciente(Paciente miPaciente) {
		this.miPaciente=miPaciente;
		
	}

	public void setVentanaRegistro(VentanaRegistro miRegitro) {
		this.miRegitro=miRegitro;
		
	}

	public void setProcesos(Procesos misProcesos) {
		this.misProcesos=misProcesos;
		
	}

	public double calculaTotal(int tratamientos, String tipo, int dias, int costoF) {
		misProcesos=new Procesos();

		return misProcesos.calculaTotal(tratamientos, tipo, dias, costoF);
	}

	public void mostrarVentanaRegistro() {
		miRegitro.setVisible(true);
		
	}



	public void setVentanaConsultas(VentanaConsultas miConsulta) {
		this.miConsulta=miConsulta;
		
	}



	public void mostrarVentanaConsulta() {
		miConsulta.setVisible(true);
		
	}

	public void guardarUsuario(Paciente miPaciente) {
		misProcesos.guardarUsuario(miPaciente);
		
	}

	public String imprimirDatos(String documento) {
		misProcesos=new Procesos();
		return misProcesos.imprimirDatos(documento);
		
	}



}
