package Clase_vier;
import javax.swing.JOptionPane;

public class ejercicio3 {
	
	public static void main(String[] args) {
		boolean mv= true;
		
		while (mv = true) {
			double result=0;
			double numero1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
			double numero2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
		    String signos=JOptionPane.showInputDialog("Ingrese la opcion: \n (+)suma\n (-)resta \n (*)multiplicacion \n (/)divicion \n (%)modulo \n (X)salir");
		    
		    switch (signos) {
			case "+":
				result = numero1+numero2;
				System.out.println(" Su resultado es: "+result);
				
			   break;
			case "-":
				result = numero1-numero2;
				System.out.println(" Su resultado es: "+result);
				
				break;
			case "*":
				result = numero1*numero2;
				System.out.println(" Su resultado es: "+result);
				
				break;
			case "/":
				result = numero1/numero2;
				System.out.println(" Su resultado es: "+result);
				
				break;
			case "%":
				result = numero1%numero2;
				System.out.println(" Su resultado es: "+result);
				
				break;
				
			case "x":
				mv= false;
			
				
				break;

			default:
				System.out.println("No es la accion valida");
			}
			
			
		}
		
		

	
}
	

}
	


