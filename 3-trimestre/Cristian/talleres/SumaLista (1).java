import java.util.ArrayList;

import javax.swing.JOptionPane;

public class SumaLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> original= new ArrayList<Integer>();
		ArrayList<Integer> copia= new ArrayList<Integer>();
		
		int num=0;
		original.add(5);
		original.add(3);
		original.add(4);
		original.add(1);
		
		copia.add(5);
		copia.add(3);
		copia.add(4);
		System.out.println(original);	
		System.out.println(copia);	
		
		ArrayList<Integer> sumas=new ArrayList<Integer>();
		
		if (original.size()==copia.size()) {

			for (int i = 0; i < original.size(); i++) {
				sumas.add(original.get(i)+copia.get(i));
			}	
		}
		else {
			System.out.println("No son iguales en tamaño no puede sumar");
		}
		
		
		System.out.println(sumas);	
		
		
		
	}

}
