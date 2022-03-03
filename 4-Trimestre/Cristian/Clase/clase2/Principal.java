
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perro miPerro=new Perro();
		miPerro.setNombre("Firulais");
		System.out.println(miPerro.getNombre());
		miPerro.setEdad(-3);
		
		
		miPerro.setRaza("Pincher");
		miPerro.imprimir();
		miPerro.ladrar();
		miPerro.comer();
		
		miPerro.setEdad(-9);
		
	}

}
