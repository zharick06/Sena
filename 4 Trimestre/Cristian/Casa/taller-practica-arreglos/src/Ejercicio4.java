import javax.swing.JOptionPane;

public class Ejercicio4 {
	public static void main(String[] args) {
		int[] original= new int[6];
		int nuevo[]=new int[original.length];
		//[5,2,4,1,4,0]
		//5
		int elemento=0;
		
		for (int i = 0; i < original.length; i++) {
			original[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero"));
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
		
		}
		
	}


	


