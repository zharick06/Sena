package Procesos;


public class Persona {
	private  String Documento;
	private String Nombre;
	private String Edad;
	private double Peso;
	private double Talla;
	private double MIC;
	
	
	
	public double getMIC() {
		return MIC;
	}
	public void setMIC(double mIC) {
		MIC = mIC;
	}
	public String getDocumento() {
		return Documento;
	}
	public void setDocumento(String documento) {
		this.Documento = documento;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getEdad() {
		return Edad;
	}
	public void setEdad(String edad) {
		Edad = edad;
	}
	public double getPeso() {
		return Peso;
	}
	public void setPeso(double peso) {
		Peso = peso;
	}
	public double getTalla() {
		return Talla;
	}
	public void setTalla(double talla) {
		Talla = talla;
	}
	@Override
	public String toString() {
		return Documento +"  " + Nombre + "  " + Edad + "  " + Peso
				+ "  " + Talla +"  IMC: "+MIC;
	}
	

}
