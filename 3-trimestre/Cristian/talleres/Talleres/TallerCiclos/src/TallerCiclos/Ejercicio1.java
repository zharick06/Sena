package TallerCiclos;

import javax.swing.JOptionPane;

public class Ejercicio1 {
	public static void main(String[] args) {
		Double sueldo;
		String menu;
		menu="Introdusca en la categoria que pertenece\n\n"+
			     "Categoria: \n"
			     +"1 \n"
			     +"2 \n"
			     +"3 \n"
			     +"4 \n"
			     +"5.Salir";
		int opcion=5;
		
		do {
			
			opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
				
		        double sueldoF;	
		        
		        switch (opcion) {
		        
				case 1:
					sueldo=Double.parseDouble(JOptionPane.showInputDialog("Sueldo actual"));
					sueldoF=sueldo + (sueldo * 0.12);	
					System.out.println("su sueldo co el aumento es: " +sueldoF);
					
					break;
				case 2:
					sueldo=Double.parseDouble(JOptionPane.showInputDialog("Sueldo actual"));
					sueldoF=sueldo + (sueldo * 0.10);	
					System.out.println("su sueldo co el aumento es: " +sueldoF);
					
					break;
				case 3:
					sueldo=Double.parseDouble(JOptionPane.showInputDialog("Sueldo actual"));
					sueldoF=sueldo + (sueldo * 0.8);	
					System.out.println("su sueldo co el aumento es: " +sueldoF);
					
					break;
				case 4:
					sueldo=Double.parseDouble(JOptionPane.showInputDialog("Sueldo actual"));
					sueldoF=sueldo + (sueldo * 0.6);	
					System.out.println("su sueldo co el aumento es: " +sueldoF);
					
					break;

				default:
					break;
				}
			
		} while (opcion!=5);
		
		
	}

}
