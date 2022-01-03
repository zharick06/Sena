import javax.swing.JOptionPane;

public class Ejercicio8 {
	public static void main(String[] args) {
		int tam=5;
		
		int arreglo1[]= new int[tam];
		int arreglo2[]= new int[tam];
		int arreglo3[]= new int[tam];
		
		for (int i = 0; i < arreglo1.length; i++) {
			arreglo1[i]=Integer.parseInt(JOptionPane.showInputDialog("llene el primer arreglo"));
			
		}
	    for (int i = 0; i < arreglo2.length; i++) {
			arreglo2[i]=Integer.parseInt(JOptionPane.showInputDialog("llene el segundo arreglo"));

		}
	    for (int i = 0; i < arreglo3.length; i++) {
			arreglo3[i]=arreglo1[i] +arreglo2[i];
			System.out.println(arreglo1[i]+" + "+arreglo2[i]+" = " +arreglo3[i]);
		}
	    
	
	}

}
