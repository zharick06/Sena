package equis;

import javax.swing.JOptionPane;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		int[] arreglo = new int[2];
		for (int i = 0; i < arreglo.length; i++) {

			int dia=100000;
			String name=JOptionPane.showInputDialog("Nombre Completo");
			Double medicamentos= Double.parseDouble(JOptionPane.showInputDialog("Costo de medicamnetos"));
			do {
				if(medicamentos<0) {
					JOptionPane.showMessageDialog(null,"Debe ingresar datos positivos,"
							+ " intentenlo nuevamente");
				 medicamentos= Double.parseDouble(JOptionPane.showInputDialog("Costo de medicamnetos"));
				}
				
			}while(medicamentos<0);
			
			int dias=Integer.parseInt(JOptionPane.showInputDialog("Cuantos dias estuvo en el hospital"));
			do {
				if(dias<0) {
					JOptionPane.showMessageDialog(null,"Debe ingresar datos positivos,"
							+ " intentenlo nuevamente");
				dias=Integer.parseInt(JOptionPane.showInputDialog("Cuantos dias estuvo en el hospital"));
				}
				
			}while(dias<0);
			
            
			Double tratamiento= Double.parseDouble(JOptionPane.showInputDialog("Costo del tratamiento"));
			do {
				if(tratamiento<0) {
					JOptionPane.showMessageDialog(null,"Debe ingresar datos positivos,"
							+ " intentenlo nuevamente");
					tratamiento= Double.parseDouble(JOptionPane.showInputDialog("Costo del tratamiento"));
				}
				
			}while(tratamiento<0);
			
			double total=(dia*dias)+medicamentos+tratamiento;
			System.out.println(name+", Total a pagar: " + total);
			
			
			
			
		}
	
		
		System.out.println("Personas registradas en el sistema: "+arreglo.length);
		
	}

	

}
