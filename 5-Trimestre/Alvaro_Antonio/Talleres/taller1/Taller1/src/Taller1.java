
import javax.swing.JOptionPane;

public class Taller1 {

	public static void main(String[] args) {

		int cantidadB=500;
		int cantidadM=Integer.parseInt(JOptionPane.showInputDialog("Cual es la cantidad minima"));
		int cantidadT =cantidadB-cantidadM;
		
		
		if (cantidadB<cantidadM) {
			
			
			int pedido=Integer.parseInt(JOptionPane.showInputDialog(null,"Faltan: "+Math.abs(cantidadT)+"\nEs necesario realizar el pedido \n" + "Cantidad que sea comprar" ));
			int valorC=Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuanto cuesta la compra por unidad?" ));
			int cantidadC=Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuanto dinero hay en la caja?" ));
			
			int total=pedido*3350;
			
			
			if (total>cantidadC) {
				
				JOptionPane.showMessageDialog(null,"Cantidad en bodega: "+cantidadB +", Cantidad mínima requerida "+ cantidadM+". Entonces si es necesario realizar el pedido al proveedor.\n"
						+ "Cantidades de compra deseada: "+ pedido+ ". Valor de compra: "+valorC+", Valor en caja: "+cantidadC+".\n No es posible realizar el pedido"
						+ " Ya que en la caja hay: "+ cantidadC+ " y el pedido cuesta: "+total);
			
			}
			else {
				
				JOptionPane.showMessageDialog(null,"Cantidad en bodega: "+cantidadB +", Cantidad mínima requerida "+ cantidadM+". Entonces si es necesario realizar el pedido al proveedor.\n"
						+ "Cantidades de compra deseada: "+ pedido+ ". Valor de compra: "+valorC+", Valor en caja: "+cantidadC+". Si es posible realizar el pedido");
			}
			
		}
		
		else if (cantidadB>cantidadM) {
			JOptionPane.showMessageDialog(null, "La cantidad que queda en bodega es de:"+ cantidadT );

			
			if (cantidadT<=10) {
				JOptionPane.showMessageDialog(null, "\n se recomieda hacer el pedido");
				
			}
			
			
		}
		
		
		
	

	}

}
