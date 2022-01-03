package talleres;

public class taller6 {
	public static void main(String[] args) {
	int multi = 0;
	int suma = 0;
	int sumaTotal = 0;

	for (int i = 0; i < 11; i++) {
				
		for (int j = 0; j < 11; j++) {
				
				multi = j * i;
				System.out.println(j +" * "+ i +" = "+ multi);
				suma = suma + multi;
				if(j == 10) {
					System.out.println(suma);
					sumaTotal = suma + sumaTotal;
					suma = 0;
				}	
				
		} System.out.println("********");	
	} System.out.println("Total Bloque " + sumaTotal);
	

}
}
