package instrumetoRecuperacionHastaArreglos;

import javax.swing.JOptionPane;

public class Ejercicio1 {
	public static void main(String[] args) {
		int pacintes=2;		
		String[] pacientes2=new String[pacintes];
		int paciente3[]=new int[pacintes];

		int total;
		int diase=100000;
		
		
			for (int j = 0; j < pacientes2.length; j++) {
				pacientes2[j]=JOptionPane.showInputDialog("Cual es el nombre del paciente");
				
			
			
			
			
            int tratamiento=Integer.parseInt(JOptionPane.showInputDialog("Costo del tratamiento"));
			
			if (tratamiento<0 ) {
			 tratamiento=Integer.parseInt(JOptionPane.showInputDialog("Costo del tratamiento"));
			}
			else {
				paciente3[j]=tratamiento;
			}
			
			int diash=Integer.parseInt(JOptionPane.showInputDialog("Cuantos dias estuvo en el hospital"));
			if (diash<0) {
			   diash=Integer.parseInt(JOptionPane.showInputDialog(" numero invalido, vuelva a escribirlo"));
			}
			
			int costme=Integer.parseInt(JOptionPane.showInputDialog("costo de los medicamentos"));
			if (costme <0) {
				 costme=Integer.parseInt(JOptionPane.showInputDialog(" numero invalido, vuelva a escribirlo"));
			}
			if (tratamiento>0 && diash>0 && costme >0) {
				total=(diase*diash) + tratamiento+costme;
				System.out.println(pacientes2[j]+" Total a pagar es de "+total);
			}
			
			
		
			
		}
	
		
		
		
		System.out.println("Los pacientes procesados fueron "+pacintes);
		
		
		
		
	}

}
