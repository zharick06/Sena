package Clase_vier;

import javax.swing.JOptionPane;


public class operaciones_math {

	public static void main(String[] args) {
		/* Haga un algoritmo que solicite 2 numeros y
		 * basado en eso solicite un signo matematico
		 * (+,-,*,/,%) y dependendido del signo realice
		 * la operaci�n correspondiente.
		 *
		 * valide que para las operaciones de divisi�n y
		 * m�dulo, el segundo n�mero no puede ser 0
*/		
		//int contador=Integer.parseInt("Cuantas veces desea que se repita el ciclo?");
		int contador=0;
		while (contador<=2) {
		int n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer n�mero"));
		int n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo n�mero"));
		String operacion=JOptionPane.showInputDialog("Ingrese el signo matem�tico");
		switch (operacion) {
		case "+": 
			System.out.println("la suma es: " + (n1 + n2));
			break;
		case "-": 
			System.out.println("la resta es: " + (n1 - n2));
			break;
		case "*": 
			System.out.println("la multiplicaci�n es: " + (n1 * n2));
			break;
		case "/": 
			if(n2>0) {
				System.out.println("la divisi�n es: " + (n1 / n2));
			}
			else {
				System.out.println("El segundo n�mero en la divisi�n no puede ser 0");
			}
			break;
		default:
			System.out.println("Signo matem�tico incorrecto");
		}
		contador++;
	}
		}
	}


