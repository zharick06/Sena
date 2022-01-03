
public class Trabajador {

	String documento;
	String nombre;
	int estrato;
	double salario;
	
	double salarioFinal;
	
	public void mostrarResultados() {
		String mensaje="<<<<SALIDA DEL SISTEMA>>>>\n";
		mensaje+="Nombre: "+nombre+"\n";
		mensaje+="Salario actual: "+salario+"\n";
		mensaje+="Salario Final: "+salarioFinal+"\n\n";
		System.out.println(mensaje);
	}

	@Override
	public String toString() {
		return "Trabajador [documento=" + documento + 
				", nombre=" + nombre + ", estrato=" +
				estrato + ", salario="
				+ salario;
	}
	
	
	
}
