package TallerCiclos;

import javax.swing.JOptionPane;

public class Ejercicio3 {
	public static void main(String[] args) {
		int opcion=2;
		int total;
		int semillas;
		int menu2;
		String menu;
		menu="1.Tomate\n"
			 +"2.Repollo\n"
			 +"3.Papa\n"
			 +"4.Cebolla\n"
		      +"5.salir";
		int menu3;
		do {
		 menu3=Integer.parseInt(JOptionPane.showInputDialog("1.Comprar\n"+"2.Sair"));	
		 if (menu3==1) {
			 do {
					opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));	
					switch (opcion) {
					case 1:
						menu2=Integer.parseInt(JOptionPane.showInputDialog("1.Chonto\n"+"2.ensalada"));
						semillas=Integer.parseInt(JOptionPane.showInputDialog("Cuantas semillas vas a llevar?"));
						if (menu2==1) {
							total=JOptionPane.showConfirmDialog(null, "El total a pagar es: $"+(15*semillas));
							System.out.println("Tomate chonto X " + semillas+ "u/n es igual = $"+ (15*semillas));
						}
						else if (menu2==2) {
							total=JOptionPane.showConfirmDialog(null, "El total a pagar es: $"+(20*semillas));
							System.out.println("Tomate Ensalada X " + semillas+ "u/n  es igual = $"+ (20*semillas));
						}
						
						
						break;
					case 2:
						
						semillas=Integer.parseInt(JOptionPane.showInputDialog("Cuantas semillas vas a llevar?"));
						
							total=JOptionPane.showConfirmDialog(null, "El total a pagar es: $"+(10*semillas));
							System.out.println("Repollo X " + semillas+ "u/n es igual = $"+ (10*semillas));
						
						break;
						

					case 3:
						menu2=Integer.parseInt(JOptionPane.showInputDialog("1.Criolla\n"+"2.Pastusa\n"+"3.Salentuna"));
						semillas=Integer.parseInt(JOptionPane.showInputDialog("Cuantas semillas vas a llevar?"));
						if (menu2==1) {
							total=JOptionPane.showConfirmDialog(null, "El total a pagar es: $"+(8*semillas));
							System.out.println("Papa crioola X " + semillas+ "u/n es igual = $"+ (8*semillas));
						}
						else if (menu2==2) {
							total=JOptionPane.showConfirmDialog(null, "El total a pagar es: $"+(9*semillas));
							System.out.println("Papa pastusa X " + semillas+ "u/n  es igual = $"+ (9*semillas));
						}
						else if (menu2==3) {
							total=JOptionPane.showConfirmDialog(null, "El total a pagar es: $"+(11*semillas));
							System.out.println("Papa salentuna X " + semillas+ "u/n  es igual = $"+ (11*semillas));
						}
						
						break;
						

					case 4:
						menu2=Integer.parseInt(JOptionPane.showInputDialog("1.Larga\n"+"2.Huevo"));
						semillas=Integer.parseInt(JOptionPane.showInputDialog("Cuantas semillas vas a llevar?"));
						if (menu2==1) {
							total=JOptionPane.showConfirmDialog(null, "El total a pagar es: $"+(15*semillas));
							System.out.println("Cebolla larga X " + semillas+ "u/n es igual = $"+ (15*semillas));
						}
						else if (menu2==2) {
							total=JOptionPane.showConfirmDialog(null, "El total a pagar es: $"+(13*semillas));
							System.out.println("Cebolla de huevo X " + semillas+ "u/n  es igual = $"+ (13*semillas));
						}
						
						break;
						

					default:
						break;
					}
					
				} while (opcion!=5);
			
		}
		 
		} while (opcion!=5);
		
		
		
	}

}