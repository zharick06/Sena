package TallerCiclos;

import javax.swing.JOptionPane;

public class Ejercicio2 {
	public static void main(String[] args) {
		int opcion=5;
		int ventas;
		String menu;
		menu="Elija el tipo de vendedor \n\n"
				+"1.A\n"
				+"2.B\n"
				+"3.C\n"
				+"4.D\n"
				+"5.salir";
		
		do {
			opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
			if (opcion>0 || opcion<5) {
				double comision;
				if (opcion == 1) {
					ventas=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas ventas realizo?"));
					comision=(ventas*0.8);
					System.out.println("su comicion es de: " +comision);
				}
				else if (opcion==2) {
					ventas=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas ventas realizo?"));
					comision=(ventas*0.6);
					System.out.println("su comicion es de: " +comision);
					
				}
				else if (opcion==3) {
					ventas=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas ventas realizo?"));
					comision=(ventas*0.4);
					System.out.println("su comicion es de: " +comision);
					
				}
				else if (opcion==4) {
					ventas=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas ventas realizo?"));
					comision=(ventas*0.2);
					System.out.println("su comicion es de: " +comision);
					
				}
			
				
			}
				
		} while (opcion!=5);
		
		 
	}

}
