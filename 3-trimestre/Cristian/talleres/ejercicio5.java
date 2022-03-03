package Clase_vier;

import javax.swing.JOptionPane;



public class ejercicio5 {
	public static void main(String[] args) {
		
		String menu="Menu\n\n";
		menu+="1. Sacar promedio\n";
		menu+="2. Salir\n";
		menu+="Ingrese una opción\n";
	
		int ci=2;
		do {
			
			ci=Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (ci) {
			case 1: 
				
				
				
				double nota1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primera nota"));
				if(nota1>5) {
					JOptionPane.showMessageDialog(null,"Debe ingresar un meros entre 0 y 5,"
							+ " intentenlo nuevamente","ERROR",JOptionPane.WARNING_MESSAGE);}
					
					
				double nota2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la segunda nota"));
				if(nota2>5) {
					JOptionPane.showMessageDialog(null,"Debe ingresar un meros entre 0 y 5 "
							+ " intentenlo nuevamente","ERROR",JOptionPane.WARNING_MESSAGE);}
				
				
				double nota3=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tercera nota"));
				if(nota3>5) {
					JOptionPane.showMessageDialog(null,"Debe ingresar un meros entre 0 y 5 "
							+ " intentenlo nuevamente","ERROR",JOptionPane.WARNING_MESSAGE);}
				
				
				double notaf= (nota1+ nota2 + nota3)/3;
				if (notaf < 3) {
					System.out.println("No has aprobado, tu promedio ha sido " + notaf);
				}
				
				else {
					System.out.println( "Has aprobado con un promedio de " + notaf);}
				break;
					
				
			case 2: 
				System.out.println(" Has salido ");	break;
			
			default:System.out.println("Opcion Invalida!");
				break;
			}

			
		} while (ci!=2);
				
	
		
	
		
	}

}
