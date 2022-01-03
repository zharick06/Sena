package equis;

import javax.swing.JOptionPane;

public class Ejercicio2 {
	public static void main(String[] args) {
		int repeticion=Integer.parseInt(JOptionPane.showInputDialog("Cuantas veces desea hacer el proceso"));
		int[] arreglo = new int[repeticion];
		for (int i = 0; i < arreglo.length; i++) {
			Double base= Double.parseDouble(JOptionPane.showInputDialog("Cuanto mide la base"));
			do {
				if(base<0) {
					JOptionPane.showMessageDialog(null,"Debe ingresar datos positivos,"
							+ " intentenlo nuevamente");
					base= Double.parseDouble(JOptionPane.showInputDialog("Cuanto mide la base"));
				}
				
			}while(base<0);
			
			Double altura=Double.parseDouble(JOptionPane.showInputDialog("Cuanto tiene de altura"));
			do {
				if(altura<0) {
					JOptionPane.showMessageDialog(null,"Debe ingresar datos positivos,"
							+ " intentenlo nuevamente");
					altura=Double.parseDouble(JOptionPane.showInputDialog("Cuanto tiene de altura"));
				}
				
			}while(altura<0);
			
			double total=(base*altura)/2;
			if (total>200) {
				System.out.println("Es un gran área");
				
			}
			System.out.println("area "+ total);
			
			
		
			
		}

	
		
	}

}
