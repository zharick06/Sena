package Procesos.vo;

import Controlador.Coordinador;

public class Paciente {


	

	private String NombreE;
	private String Documento;
	private String NombreP;
	private String Direccion;
	private String Telefono;
	private String Tipo;
	private double DiaH;
	private double CostoM;
	private Coordinador micoordinador;



	public String getNombreE() {
		return NombreE;
	}

	public void setNombreE(String nombreE) {
		this.NombreE = nombreE;
	}

	public String getDocumento() {
		return Documento;
	}

	public void setDocumento(String documento) {
		this.Documento = documento;
	}

	public String getNombreP() {
		return NombreP;
	}

	public void setNombreP(String nombreP) {
		this.NombreP = nombreP;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		this.Direccion = direccion;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		this.Telefono = telefono;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		this.Tipo = tipo;
	}

	public double getDiaH() {
		return DiaH;
	}

	public void setDiaH(double dias) {
		this.DiaH = dias;
	}

	public double getCostoM() {
		return CostoM;
	}

	public void setCostoM(double medicamentos) {
		this.CostoM = medicamentos;
	}


	public void setCoordinador(Coordinador micoordinador) {
		this.micoordinador=micoordinador;
		
	}
	public void getCoordinador(Coordinador micoordinador) {
		return;
		
	}

	public void setTratamiento(String selectedItem) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		return "NombreE=" + NombreE + ", Documento=" + Documento + ", NombreP=" + NombreP + ", Direccion="
				+ Direccion + ", Telefono=" + Telefono + ", Tipo=" + Tipo + ", DiaH=" + DiaH + ", CostoM=" + CostoM
				+ ", micoordinador=" + micoordinador ;
	}

}
