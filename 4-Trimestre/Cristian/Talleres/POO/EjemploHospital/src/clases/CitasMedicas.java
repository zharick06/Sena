package clases;

import clases.empleado.Medico;

public class CitasMedicas {
	private Paciente paciente;
	private Medico medico;
	private String servicio;
	private String fechaConsulta;
	private String horaConsulta;
	private String lugar;
	
	
	public  CitasMedicas (Paciente paciente, Medico medico, String servicio, String fechaConsulta, String horaConsulta, String lugar ) {
		this.paciente=paciente;
		this.medico= medico;
		this.servicio=servicio;
		this.fechaConsulta=fechaConsulta;
		this.horaConsulta=horaConsulta;
		this.lugar=lugar;
		
	}
	public String informacionDeCitaMedica() {
		String datosCita="Imformacion cita medica\n";
		datosCita+="Paciente: "+paciente.getNombre()+"\n";
		datosCita+="Medico: "+medico.getNombre()+"\n";
		datosCita+="Motivo de consulta: "+servicio+"\n";
		datosCita+="Fecha de consulta: "+fechaConsulta+"- hora: "+horaConsulta+"\n";
		datosCita+="lugar: "+lugar+"\n\n";
		
		return datosCita;
		
	}
	
	
	
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public String getServicio() {
		return servicio;
	}
	public void setServicio(String servicio) {
		this.servicio = servicio;
	}
	public String getFechaConsulta() {
		return fechaConsulta;
	}
	public void setFechaConsulta(String fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}
	public String getHoraConsulta() {
		return horaConsulta;
	}
	public void setHoraConsulta(String horaConsulta) {
		this.horaConsulta = horaConsulta;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	
	
		

}
