package Controlador;

import Modelo.Procesos;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import Modelo.Procesos;
import Modelo.ModeloVo.MinerosVo;
import Vistas.VistasDialogo.VentanaConsulta;
import Vistas.VistasDialogo.VentanaRegistro;
import Vistas.VistasVentana.VentanaPRI;




public class Coordinador {
	private Procesos miprocesos;
	private VentanaPRI miVentanaPrincipal;
	private VentanaConsulta miVentanaConsulta;
	private VentanaRegistro miVentanaRegistro;
	
	public void setProcesos(Procesos miprocesos) {
		this.miprocesos=miprocesos;
	}
	public void setVentanaPRI(VentanaPRI miVentanaPrincipal) {
		this.miVentanaPrincipal=miVentanaPrincipal;
	}
	public void setVentanaConsultaI(VentanaConsulta miVentanaConsulta) {
		this.miVentanaConsulta=miVentanaConsulta;
	}
	public void setVentanaRegistro(VentanaRegistro miVentanaRegistro) {
		this.miVentanaRegistro=miVentanaRegistro;
	}

	public void mostrarVentana() {
		miVentanaPrincipal.setVisible(true);
	
	}

	public void mostrarRegistro() {
		miVentanaRegistro.setVisible(true);
	
	}

	public void mostrarConsulta() {
		miVentanaConsulta.setVisible(true);
	
	}
	public boolean registrarMineros(MinerosVo miMinerosVo) {
		return miprocesos.registrarMineros(miMinerosVo);
	}
	public MinerosVo consultarPaciente(String documento) {
		return miprocesos.consultarPaciente(documento);
		
		
	}
	
	public ArrayList<MinerosVo> llenartable() {
		return miprocesos.llenarTable();
		
	}
	
}