package clases.empleado;

import javax.swing.JOptionPane;

import clases.Persona;

public class Empleado extends Persona{
	private String codigoEmpleado;
	private int numeroDeHorasExtras;
	private String fechaDeIngreso;
	private String area;
	private String cargo;
	
	@Override
	public void registrarDatos() {
		super.registrarDatos();
		
		codigoEmpleado=JOptionPane.showInputDialog("Ingrese su codigo");
		numeroDeHorasExtras=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de horas extras"));
		fechaDeIngreso=JOptionPane.showInputDialog("Ingrese la fecha de inicion (dd/mm/aa");
		area=JOptionPane.showInputDialog("Ingrese el area");
		cargo=JOptionPane.showInputDialog("Ingrese su cargo");
		
		}
	
	@Override
	public void imprimirDatosPersona(String datos) {
		super.imprimirDatosPersona(datos);
		
		datos="Codigo de empleado: " +codigoEmpleado+"\n";
		datos+="Numero de horas extras: "+numeroDeHorasExtras+"\n";
		datos+="Fecha de ingreso: "+fechaDeIngreso+"\n";
		datos+="Area: "+area+"\n";
		datos+="Cargo: "+cargo+"\n";
		 System.out.println(datos);
	}
	
	
	public String getCodigoEmpleado() {
		return codigoEmpleado;
	}
	public void setCodigoEmpleado(String codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}
	public int getNumeroDeHorasExtras() {
		return numeroDeHorasExtras;
	}
	public void setNumeroDeHorasExtras(int numeroDeHorasExtras) {
		this.numeroDeHorasExtras = numeroDeHorasExtras;
	}
	public String getFechaDeIngreso() {
		return fechaDeIngreso;
	}
	public void setFechaDeIngreso(String fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
