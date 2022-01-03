package Clase_vier;

import javax.swing.JOptionPane;

public class Estaciones {

	public static void main(String[] args) {
	
		int codigo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código"));
		
		switch (codigo) {
		case 1: 
			System.out.println("Verano");
			break;
		case 2: 
			System.out.println("Invierno");
			break;
		case 3: 
			System.out.println("Otoño");
			break;
		case 4: 
			System.out.println("Primavera");
			break;
		
		default:
			System.out.println("Código inválido");
		}
	}
}

/*		if(codigo==1) {
			System.out.println("verano");
		}
		else if(codigo==2) {
			System.out.println("invierno");
		}
		else if(codigo==3) {
			System.out.println("otoño");
		}
		else if(codigo==4) {
			System.out.println("primavera");
		}
		else {
			System.out.println("código incorrecto");
		}
*/
	


