
public class Principal {

	public static void main(String[] args) {
		Persona aprendiz=new Persona();
		aprendiz.documento="123";
		aprendiz.nombre="Tafur";
		aprendiz.edad=21;
		aprendiz.profesion="Estudiante";
		
		System.out.println("Nombre: "+aprendiz.nombre);
		aprendiz.dormir();
		System.out.println("Aprendiz= "+aprendiz);
		
		System.out.println();
		aprendiz=new Persona();
		aprendiz.ingresarDatos();
		aprendiz.imprimirDatos();
		System.out.println(aprendiz);
		System.out.println();
		
		System.out.println();
		Persona aprendiz3=new Persona();
		aprendiz3.imprimirDatos();
		System.out.println();
		
		System.out.println();
		Persona estudiante=new Persona();
		estudiante.ingresarDatos();
		//estudiante.documento="321";
		estudiante.nombre="Carlos";
		estudiante.imprimirDatos();
		estudiante.comer();	
		System.out.println("Estudiante = "+estudiante);
	}

}
