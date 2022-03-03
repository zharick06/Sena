
import javax.swing.JOptionPane;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		int arreglo[]=new int[5];
		 int suma=0;
		for (int i = 0; i < arreglo.length; i++) {
		arreglo[i]=Integer.parseInt(JOptionPane.showInputDialog("dijite el numero"));
		System.out.println(arreglo[i]);
		suma+=arreglo[i];
		
			
		}
		
		System.out.println(suma);
	}
	
}