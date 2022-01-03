import javax.swing.JOptionPane;

public class Ejercicio3 {
	public static void main(String[] args) {
		double arreglo[]=new double[3];
		double total=0;
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i]=Double.parseDouble(JOptionPane.showInputDialog("ingrese su nota"));
			total+= arreglo[i]/3;
			
		}
		System.out.println(total);
	}

}
