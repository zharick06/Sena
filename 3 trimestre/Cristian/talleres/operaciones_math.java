package Clase_vier;

import javax.swing.JOptionPane;


public class operaciones_math {

	public static void main(String[] args) {
		/* Haga un algoritmo que solicite 2 numeros y
		 * basado en eso solicite un signo matematico
		 * (+,-,*,/,%) y dependendido del signo realice
		 * la operación correspondiente.
		 *
		 * valide que para las operaciones de división y
		 * módulo, el segundo número no puede ser 0
*/		
		//int contador=Integer.parseInt("Cuantas veces desea que se repita el ciclo?");
		int contador=0;
		while (contador<=2) {
		int n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));
		int n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número"));
		String operacion=JOptionPane.showInputDialog("Ingrese el signo matemático");
		switch (operacion) {
		case "+": 
			System.out.println("la suma es: " + (n1 + n2));
			break;
		case "-": 
			System.out.println("la resta es: " + (n1 - n2));
			break;
		case "*": 
			System.out.println("la multiplicación es: " + (n1 * n2));
			break;
		case "/": 
			if(n2>0) {
				System.out.println("la división es: " + (n1 / n2));
			}
			else {
				System.out.println("El segundo número en la división no puede ser 0");
			}
			break;
		default:
			System.out.println("Signo matemático incorrecto");
		}
		contador++;
	}
		}
	}


