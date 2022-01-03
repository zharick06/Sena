
import javax.swing.JOptionPane;
public class Arreglos {
	public static void main(String[] args) {
		
		int tamaño= Integer.parseInt(JOptionPane.showInputDialog("Cual es el tamaño del areglo")) ;
		int j=0;
		int[] arreglo = new int[tamaño] ;
		
		
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el numero" + i));
			int multi= arreglo[i] * j++;
			
			System.out.println("valor "+multi+ "  "+ arreglo[i]);
			
			
		}
		
	}

}
