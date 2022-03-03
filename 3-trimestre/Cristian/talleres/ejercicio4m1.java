package Clase_vier;
import javax.swing.JOptionPane;

public class ejercicio4m1 {
	
	public static void main(String[] args) {
		
		int num1=0,num2=0;
		do {
					num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese num1"));
					if(num1<0) {
						JOptionPane.showMessageDialog(null,"Debe ingresar datos positivos,"
								+ " intentenlo nuevamente","ERROR",JOptionPane.WARNING_MESSAGE);
					}
					
				}while(num1<0);
				
				do {
					num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese num2"));
					if(num2<0) {
						JOptionPane.showMessageDialog(null,"Debe ingresar datos positivos,"
								+ " intentenlo nuevamente","ERROR",JOptionPane.WARNING_MESSAGE);
					}
					
				}while(num2<0);
				
			 
				int suma=num1+num2;
				System.out.println("La suma es: "+suma);

}
}
