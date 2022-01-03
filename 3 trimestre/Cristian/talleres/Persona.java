
public class Persona {
	
	String documento;
	String nombre;
	int edad;
	String profesion;
	
	public Persona() {
		System.out.println("Siempre ingresa");
		documento="NN";
		nombre="Pepito";
		edad=0;
		profesion="Estudiante";
	}
	
	public void ingresarDatos() {
		documento="111";
		nombre="Nombre por defecto";
		edad=0;
		profesion="Profesion por defecto";
		
	}
	
	@Override
	public String toString() {
		return "Persona [documento=" 
				+ documento + ", nombre=" 
				+ nombre + ", edad=" 
				+ edad + ", profesion=" 
				+ profesion
				+ "]";
	}

	public void imprimirDatos() {
		System.out.println("Documento: "+documento);
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
	}
	
	public void comer() {
		System.out.println("La persona "+nombre+" Está comiendo");
	}
	
	public void dormir() {
		System.out.println("La persona "+nombre+" Está durmiendo");
	}

}
