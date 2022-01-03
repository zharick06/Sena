import javax.swing.JOptionPane;
public class Arreglo3 {
	public static void main(String[] args) {
		String nombre;
		String verduraSeleccionada="";
		int tipoVerdura=0;
		int numeroSemillas=0;
		double valorSemilla=0;
		double costoSemillas=0;
		double costoTotalSemillas=0;
		
		String menuVerduras="Menu Verduras\n";
		menuVerduras+="1. Tomate\n";
		menuVerduras+="2. Repollo\n";
		menuVerduras+="3. Papa\n";
		menuVerduras+="4. Cebolla\n";
		menuVerduras+="Seleccione una verdura a comprar\n";
		
		String menuTomate="Menu Tomate\n";
		menuTomate+="1. Chonto\n";
		menuTomate+="2. Ensalada\n";
		
		String menuPapa="Menu Papa\n";
		menuPapa+="1. Criolla\n";
		menuPapa+="2. Pastusa\n";
		menuPapa+="3. Salentuna\n";
		
		String menuCebolla="Menu Tomate\n";
		menuCebolla+="1. Larga\n";
		menuCebolla+="2. De Huevo\n";

		int cantidadAgricultores=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de agricultores"));
		
		for (int i = 0; i < cantidadAgricultores; i++) {

			String preg="";

			nombre=JOptionPane.showInputDialog("Ingrese el nombre del agricultor");
			
			do {
				/////////////////
				tipoVerdura=Integer.parseInt(
						JOptionPane.showInputDialog(menuVerduras));
				int cod=0;
				switch (tipoVerdura) {
				case 1:
					cod=Integer.parseInt(
								JOptionPane.showInputDialog(menuTomate));
					switch (cod) {
					case 1://chonto
						verduraSeleccionada="Tomate Chonto";
						valorSemilla=15;
						break;
					case 2://ensalada
						verduraSeleccionada="Tomate Ensalada";
						valorSemilla=20;
						
						break;

					default:System.out.println("No corresponde a un tipo de tomate!");
						break;
					}
					break;
				case 2:
					verduraSeleccionada="Repollo";
					valorSemilla=10;
					
				break;
				case 3:
					cod=Integer.parseInt(
							JOptionPane.showInputDialog(menuPapa));
					switch (cod) {
					case 1://Criolla
						verduraSeleccionada="Papa Criolla";
						valorSemilla=8;
						break;
					case 2://Pastusa
						verduraSeleccionada="Papa Pastusa";
						valorSemilla=9;
						break;
					case 3://Salentuna
						verduraSeleccionada="Papa Salentuna";
						valorSemilla=11;
						break;

					default:System.out.println("No corresponde a un tipo de papa!");
						break;
					}
				break;
				case 4:
					cod=Integer.parseInt(
							JOptionPane.showInputDialog(menuCebolla));
					switch (cod) {
					case 1://Larga
						verduraSeleccionada="Cebolla Larga";
						valorSemilla=15;
						break;
					case 2://De Huevo
						verduraSeleccionada="Cebolla de Huevo";
						valorSemilla=13;
						
						break;

					default:System.out.println("No corresponde a un tipo de Cebolla!");
						break;
					}
				break;
				default:
					break;
				}
				
				numeroSemillas=Integer.parseInt(
						JOptionPane.showInputDialog("Ingrese la "
								+ "cantidad de semillas para "
								+ verduraSeleccionada));
				
				costoSemillas=numeroSemillas*valorSemilla;
				System.out.println("Costo semillas: "+costoSemillas+" para "+verduraSeleccionada);
				
				
				
				costoTotalSemillas+=costoSemillas;
				
				/////////////////			
				preg=JOptionPane.showInputDialog("Desea comprar más verduras? (si)");
			} while (preg.equalsIgnoreCase("si"));
			System.out.println("Hola "+nombre+" Su compra finalizó");
			System.out.println("EL costo total de producción es: "+costoTotalSemillas);
			System.out.println();
		}
		
	
		
	}

}
