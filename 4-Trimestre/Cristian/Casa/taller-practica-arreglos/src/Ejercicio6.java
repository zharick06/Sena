import javax.swing.JOptionPane;

public class Ejercicio6 {
	public static void main(String[] args) {
		int arreglo[]=new int[3];
		int sum = 0;
		
		for (int i = 0; i < arreglo.length; i++) {
		   int number=Integer.parseInt(JOptionPane.showInputDialog("ingrse el numero"));
		    if (number>=0 && number<=10) {
		    	arreglo[i]=number;
    	      
			}
		    else {
		    	number=Integer.parseInt(JOptionPane.showInputDialog("NO se permite números negativos ni mayores a 10"));	
		    	arreglo[i]=number;
		    }
		    sum+= arreglo[i];
		    
			System.out.println(arreglo[i]);
		}
		System.out.println("Suma total = "+sum);
	}

	
}
