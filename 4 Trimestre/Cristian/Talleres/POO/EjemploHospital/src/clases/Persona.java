package clases;

import javax.swing.JOptionPane;

public class Persona {
	private String numeroDeDNI;
	private String nombre;
	private String apellido;
	private String fechaDeNacimiento;
	private String direccion;
	private String ciudadDeProcedencia;
	
	
	public void registrarDatos() {
		numeroDeDNI=JOptionPane.showInputDialog("Cual es tu DNI");
		nombre=JOptionPane.showInputDialog("Cual es tu nombre");
		apellido=JOptionPane.showInputDialog("Cual es tu apellido");
		fechaDeNacimiento=JOptionPane.showInputDialog("Cual es tu fecha de nacimiento");
		direccion=JOptionPane.showInputDialog("Cual es tu direccion");
		ciudadDeProcedencia=JOptionPane.showInputDialog("Cual es tu ciudad de procedencia");
	}
	
	public void imprimirDatosPersona(String datos) {
		datos+="Nombre: " + nombre +  "\n";
		datos+="Apellido: " +apellido+"\n";
		datos+="Fecha de nacimiento: " + fechaDeNacimiento + "\n";
		datos+="Direccion: " + direccion+"\n";
		datos+="Ciudad de procedencia: " + ciudadDeProcedencia +"\n";
		 
		System.out.println(datos);	
	}
	public String getNumeroDeDNI() {
		return numeroDeDNI;
	}
	public void setNumeroDeDNI(String numeroDeDNI) {
		this.numeroDeDNI = numeroDeDNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCiudadDeProcedencia() {
		return ciudadDeProcedencia;
	}
	public void setCiudadDeProcedencia(String ciudadDeProcedencia) {
		this.ciudadDeProcedencia = ciudadDeProcedencia;
	}
	
	

}
