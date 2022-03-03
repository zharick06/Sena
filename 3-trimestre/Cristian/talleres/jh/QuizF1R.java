package talleres;
import javax.swing.JOptionPane;

public class QuizF1R {
	public static void main(String[] args) {
		
		String[] arreglo = new String[3] ;
		
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = JOptionPane.showInputDialog("Ingrese nombre");
			int documento = Integer.parseInt(JOptionPane.showInputDialog("Documneto de Indentidad"));
			int dia= Integer.parseInt(JOptionPane.showInputDialog("dias que estuvo en el hospital"));
			String tratamiento=JOptionPane.showInputDialog("Nombre del tratamiento");
			int estrato= Integer.parseInt(JOptionPane.showInputDialog("Que estrato pertenece\n"+ "1\n"+ "2\n"));
			double medicamentos=Double.parseDouble(JOptionPane.showInputDialog("Costo del tratamiento"));
			if (estrato==1) {
				double diat= (dia * 10000)+ medicamentos;
				double total=(diat* 10)/ 100;
				System.out.println("Se�or@ "+arreglo[i]+" Registrado con el numero de identidad "+ documento+ " Ha estado en el hospital "+ dia+ " en el tratamiento de "+ tratamiento+ " perteneciente al estrato "+ estrato+ " su total a pagar es de $"+ total);
				
			}
			else if (estrato==2) {
				double diat= (dia * 10000)+ medicamentos;
				double total=(diat* 5)/ 100;
				System.out.println("Se�or@ "+arreglo[i]+" Registrado con el numero de identidad "+ documento+ " Ha estado en el hospital "+ dia+ " en el tratamiento de  "+ tratamiento+ " perteneciente al estrato "+ estrato+ " su total a pagar es de $"+ total);
				
				
			}
			else if (estrato>= 3) {
				double diat= (dia * 10000)+ medicamentos;
				System.out.println("Se�or@ "+arreglo[i]+" Registrado con el numero de identidad "+ documento+ " Ha estado en el hospital "+ dia+ " en el tratamiento de "+ tratamiento+ " perteneciente al estrato "+ estrato+ " su total a pagar es de $"+ diat);
				
				
			}
			else {
				System.out.println("valor incorrecto");
				
				
				
			}
			System.out.println(arreglo[i]);
		}
	}

}
