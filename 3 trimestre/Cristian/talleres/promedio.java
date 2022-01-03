package equis;
import javax.swing.JOptionPane;
public class promedio {
		/*
		 * Haga un algoritmo que solicite la entrada de 2 
		 * matrices de nxm y arroje la matriz resultante 
		 * de la multiplicación de sus posiciones!
		 */
		public static void main(String[] args) {
			
			int filas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las filas"));
			int columnas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las columnas"));
			
			int matrizX[][]= new int[filas][columnas];		
			int matrizY[][]= new int[filas][columnas];
			int matrizResultante[][]=new int[filas][columnas];
			
			JOptionPane.showMessageDialog(null, "Llenado de la Matriz X");
			for (int i = 0; i < filas; i++) 
			{
				for (int j = 0; j < columnas; j++) 
				{
					matrizX[i][j]=Integer.parseInt(JOptionPane.
							showInputDialog("Ingrese el valor en "
									+ "la posición ["+i+","+j+"]"));
				}	
			}
			
			JOptionPane.showMessageDialog(null, "Llenado de la Matriz Y");
			for (int i = 0; i < filas; i++) 
			{
				for (int j = 0; j < columnas; j++) 
				{
					matrizY[i][j]=Integer.parseInt(JOptionPane.
							showInputDialog("Ingrese el valor en "
									+ "la posición ["+i+","+j+"]"));
				}	
			}
			
			for (int i = 0; i < filas; i++) {
				for (int j = 0; j < columnas; j++) {
					matrizResultante[i][j]=matrizX[i][j]*matrizY[i][j];
				}
			}
			
			System.out.println("Matriz X");
			for (int i = 0; i < filas; i++) 
			{
				for (int j = 0; j < columnas; j++) 
				{
					System.out.print(matrizX[i][j]+",");
				}	
				System.out.println();
			}
			
			System.out.println();

			System.out.println("Matriz Y");
			for (int i = 0; i < filas; i++) 
			{
				for (int j = 0; j < columnas; j++) 
				{
					System.out.print(matrizY[i][j]+",");
				}	
				System.out.println();
			}
			
			
			System.out.println();
			System.out.println("Matriz Resultante");
			for (int i = 0; i < filas; i++) 
			{
				for (int j = 0; j < columnas; j++) 
				{
					System.out.print(matrizResultante[i][j]+",");
				}	
				System.out.println();
			}
			
		}
	}
