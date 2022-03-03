package clases.empleado;

import javax.swing.JOptionPane;

public class EmpleadoEventual extends Empleado {
	private double horariosPorHora;
	private String fechaTerminoContrato;
	
	@Override
	public void registrarDatos() {
		super.registrarDatos();
		
		horariosPorHora=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario mensual"));
		fechaTerminoContrato=JOptionPane.showInputDialog("Ingrese la fecha de termino de contrato (dd/mm/aa)");
		}
	
	@Override
	public void imprimirDatosPersona(String datos) {
		super.imprimirDatosPersona(datos);
		
		datos="Horarios por hora: "+ horariosPorHora+"\n";
		datos+="Fecha termino de contrato: "+ fechaTerminoContrato+"\n";
		
		System.out.println(datos);
		
		
	}
	
	
	
	public double getHorariosPorHora() {
		return horariosPorHora;
	}
	public void setHorariosPorHora(double horariosPorHora) {
		this.horariosPorHora = horariosPorHora;
	}
	public String getFechaTerminoContrato() {
		return fechaTerminoContrato;
	}
	public void setFechaTerminoContrato(String fechaTerminoContrato) {
		this.fechaTerminoContrato = fechaTerminoContrato;
	}
	
	
	

}
