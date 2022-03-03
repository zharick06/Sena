package Procesos;

public class Evento {
	private String nombre;
	private String codigo;
	private String lugar;
	private int expositores;
	private int participantes;
	private String refrigerios;
	private String temas;
	
	

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public int getExpositores() {
		return expositores;
	}
	public void setExpositores(int expositores) {
		this.expositores = expositores;
	}
	public int getParticipantes() {
		return participantes;
	}
	public void setParticipantes(int participantes) {
		this.participantes = participantes;
	}
	public String getRefrigerios() {
		return refrigerios;
	}
	public void setRefrigerios(String refrigerios) {
		this.refrigerios = refrigerios;
	}
	public String getTemas() {
		return temas;
	}
	public void setTemas(String temas) {
		this.temas = temas;
	}
	@Override
	public String toString() {
		return "Evento nombre=" + nombre + ", codigo=" + codigo + ", lugar=" + lugar + ", expositores=" + expositores
				+ ", participantes=" + participantes +  ", temas=" + temas ;
	}
	
	
	
	

}
