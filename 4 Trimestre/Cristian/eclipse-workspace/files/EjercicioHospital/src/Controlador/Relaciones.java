package Controlador;

import Vistas.VistasDialogo.VentanaConsulta;
import Vistas.VistasDialogo.VentanaRegistro;
import Vistas.VistasVentana.VentanaPRI;
import Modelo.Procesos;

public class Relaciones {
	
	

	public void iniciacion() {
		Procesos miProcesos = new Procesos();
	
		VentanaPRI miVentanaPrincipal=new VentanaPRI();
		VentanaConsulta  miVentanaConsulta=new VentanaConsulta();
		VentanaRegistro  miVentanaRegistro=new VentanaRegistro();
		Coordinador miCoordinador=new Coordinador();
		
		miProcesos.setCoordinador(miCoordinador);
		miVentanaPrincipal.setCoordinador(miCoordinador);
		miVentanaConsulta.setCoordinador(miCoordinador);
		miVentanaRegistro.setCoordinador(miCoordinador);
		
		
		miCoordinador.setProcesos(miProcesos);
		miCoordinador.setVentanaPRI(miVentanaPrincipal);
		miCoordinador.setVentanaConsultaI(miVentanaConsulta);
		miCoordinador.setVentanaRegistro(miVentanaRegistro);
	
		
		miCoordinador.mostrarVentana();
		
		miVentanaPrincipal.setVisible(true);
		
	}
}
