package equis;

import javax.swing.JOptionPane;

public class Promedio2 {		
		public static void main(String[] args) {
			int Notas = 4;
			
			int nestudiantes = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de alumnos"));
			
			String[] alumnos= new String[nestudiantes];
			
			Double[][] notas= new Double [nestudiantes][5];
			
			for (int i = 0; i < alumnos.length; i++) {
				Double suma = 0.0;
				alumnos[i] = JOptionPane.showInputDialog("Ingresa el nombre de alumnos");
				for (int j = 0; j <Notas; j++) {
					notas[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la nota"));
				     suma += notas[i][j];
				     
					System.out.print(notas[i][j]+"\t");
				}
				
				System.out.println((alumnos[i])+ " promedio = "+ (suma/4)+"\n");

			}
			
	
			
		}
	}

