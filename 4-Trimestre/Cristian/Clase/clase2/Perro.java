
public class Perro {

	private String nombre;
	private int edad;
	private String raza;
	
	public void ladrar() {
		System.out.println(nombre+" Está ladrando");
		jugar();
	}
	
	public void comer() {
		System.out.println(nombre+" Está Comiendo");	
	}
	
	private void jugar() {
		System.out.println(nombre+" Está Jugando");
	}
	
	public void imprimir() {
		String msj="DATOS DEL PERRO\n";
		msj+="Nombre: "+nombre+"\n";
		msj+="Edad: "+edad+"\n";
		msj+="Raza: "+raza+"\n";
		System.out.println(msj);
	}
	
	//setters y getters
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setEdad(int edad) {
		
		if (edad>=0) {
			this.edad=edad;
		}else {
			System.out.println("No permite una edad negativa");
			this.edad=0;			
		}
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setRaza(String raza) {
		this.raza=raza;
	}
	
	public String getRaza() {
		return raza;
	}
	
	
	
	
	
	
}
