import javax.swing.JOptionPane;

public class Hospital {

	public static void main(String[] args) {
		String nombre,documento;
		double valorTotalPagar,costoTratamiento,costoMedicamentos,valorHospitalizacion;
		double valorEntradas;
		final int COSTO_DIA_HOSPITAL=100000;
		int pregunta=0;
		int i=0;
		
		do {

			nombre=JOptionPane.showInputDialog("Ingrese su nombre");
			documento=JOptionPane.showInputDialog("Ingrese su documento");
			valorTotalPagar=0;
			costoTratamiento=Double.parseDouble(JOptionPane
					.showInputDialog("Ingrese el costo del tratamiento"));
			int diasHospital=Integer.parseInt(JOptionPane.
					showInputDialog("Ingrese los dias de hospitalización"));
			costoMedicamentos=Double.parseDouble(JOptionPane
					.showInputDialog("Ingrese el costo de los medicamentos"));
			
			valorHospitalizacion=diasHospital*COSTO_DIA_HOSPITAL;
			
			int estrato=Integer.parseInt(JOptionPane.
					showInputDialog("Ingrese el estrato: \n1. Estrato 1\n2. Estrato 2\n"));;
		
			valorEntradas=costoTratamiento+costoMedicamentos+valorHospitalizacion;		
					
			if (estrato==1) {
				System.out.println("El descuento es del 10%");
				valorTotalPagar=valorEntradas-(valorEntradas*0.1);
			}else {
				System.out.println("El descuento es del 5%");
				valorTotalPagar=valorEntradas-(valorEntradas*0.05);
			}
			System.out.println();
			System.out.println("Hola "+nombre+" El valor total a pagar es: "+valorTotalPagar);
		
			pregunta=Integer.parseInt(JOptionPane.
					showInputDialog("Ingrese 1, para continuar"));
			
			i++;
		} while (pregunta==1);
		System.out.println("Cantidad de pacientes = "+i);
	}

}
