
public class Principal {

	/*
	 * 4. Haga un algoritmo que permita ingresar varios 
	 * números y luego imprima el mismo sin repeticiones
	 */	
	public static void main(String[] args) {
		int[] original= {5,2,4,1,4,2};
		int nuevo[]=new int[original.length];
		//[5,2,4,1,4,0]
		//5
		int elemento=0;
		
		for (int i = 0; i < original.length; i++) {
			int cont=0;
			elemento=original[i];
			nuevo[i]=elemento;
			for (int j = 0; j < original.length; j++) {
				if (elemento==nuevo[j]) {
					cont++;
				}			
			}
			
			if (cont==1) {
				System.out.print(elemento+" ");
			}
			
		}
		System.out.println();
		for (int i = 0; i < nuevo.length; i++) {
			System.out.print(original[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < nuevo.length; i++) {
			System.out.print(nuevo[i]+" ");
		}
		
	}

}
