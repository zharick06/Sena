import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);  
	     System.out.println("Introduzca Hora y minutos en formato HH:mm"); 
	     String HoraMinutos = entrada.next();
	     String[] HoraMinArray = HoraMinutos.split(":");
	     

	     //Obtiene los valores enteros.
	     int valorHora = Integer.parseInt(HoraMinArray[0]); //Hora
	     int valorMinutos = Integer.parseInt(HoraMinArray[1]); // Minutos.

	    System.out.println("Hora: " + valorHora);
	    System.out.println("Minutos: " + valorMinutos);

	}

}
