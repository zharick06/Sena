import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Procesos {
	
	ArrayList<Trabajador> trabajadorList;
	
	public Procesos() {
		trabajadorList=new ArrayList<Trabajador>();
		System.out.println("Entra al constructor");
		iniciar();
	}

	public void iniciar() {
		
		int repita=0;
		do {
			
			crearTrabajadores();
			
			repita=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 para crear otro trabajador"));
		} while (repita==1);
		
		imprimirTrabajadores();
		realizarCalculo();
	}
	
	public void realizarCalculo() {
		Trabajador trabajadorTemporal;
		for (int i = 0; i < trabajadorList.size(); i++) {
			trabajadorTemporal=trabajadorList.get(i);
			calcularSalarioFinal(trabajadorTemporal);
		}
		
		
	}

	private void calcularSalarioFinal(Trabajador trabajadorTemporal) {
		int estrato=trabajadorTemporal.estrato;
		double salario=trabajadorTemporal.salario;
		double salarioFinal=0;
		
		switch (estrato) {
		case 1: salarioFinal=salario+(salario*0.1);	break;
		case 2: salarioFinal=salario+(salario*0.2);	break;
		default: salarioFinal=salario;
			break;
		}
		
		trabajadorTemporal.salarioFinal=salarioFinal;
		trabajadorTemporal.mostrarResultados();
	}

	private void imprimirTrabajadores() {
		for (int i = 0; i < trabajadorList.size(); i++) {
			System.out.println(trabajadorList.get(i));
		}
	}

	public void crearTrabajadores() {
		
		Trabajador trabajador=new Trabajador();
		trabajador.documento=JOptionPane.showInputDialog("Ingrese el documento del trabajador");
		trabajador.nombre=JOptionPane.showInputDialog("Ingrese el nombre del trabajador");
		trabajador.estrato=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el estrato del trabajador"));
		trabajador.salario=solicitarSalario();
		
		trabajadorList.add(trabajador);
	}
	
	public double solicitarSalario() {
		
		double salario=0;
		
		do {
			try {
				salario=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del trabajador"));
				if (salario<0) {
					JOptionPane.showMessageDialog(null, "El salario no puede ser negativo, ingreselo nuevamente");
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error en el ingreso, intentelo nuevamente");
				salario=-1;
			}
		
		} while (salario<0);
		return salario;
	}
	
}
