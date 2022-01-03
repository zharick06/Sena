package Clase_vier;
import javax.swing.JOptionPane;

public class ejercicios4 {
	
	public static void main(String[] args) {
	
	
	String menu="MENU RESTAURANTE\n\n";
	menu+="1. Sopa\n";
	menu+="2. Frijoles\n";
	menu+="3. Lentejas\n";
	menu+="4. Sancocho\n";
	menu+="5. Salir \n\n";
	menu+="Ingrese una opción\n";
	
	int cod=5;
	do{
		
		cod=Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		switch (cod) {
		case 1: System.out.println("1. Sopa ");	break;
		case 2: System.out.println("2. Frijoles ");	break;
		case 3: System.out.println("3. Lentejas ");	break;
		case 4: System.out.println("4. Sancocho ");	break;
		case 5: System.out.println("5. Salir ");	break;
		default:System.out.println("El codigo no existe!");
			break;
		}

	}while(cod!=5);
	System.out.println("TERMINO EL CICLO");
	
}

		
	}
		
		

	
	