package array_list;

public class Procesos {
	
	int[] m= {2,3,4,5};
	int[] n;

	public void llenarArreglos() {

		n= new int[4];
		n[0]=2;	n[2]=4;
		n[1]=3;	n[3]=5;	
		
		imprimirArreglos(m,"Arreglo m");
		imprimirArreglos(n,"Arreglo n");
		System.out.println();
		compararArreglos();
	}
	
	public void imprimirArreglos(int[] arreglo,String msj) {
		System.out.println();
		System.out.print(msj+"=[");
		for (int i = 0; i < arreglo.length; i++) {
			System.out.print(arreglo[i]+" ");
		}
		System.out.print("]");
	}
	
	public void compararArreglos() {
		boolean validaDiferencia=false;
		if (m.length==n.length) 
		{
			for (int i = 0; i < m.length; i++) {
				if (m[i]!=n[i]) {
					validaDiferencia=true;
				}
			}			
			
			if (validaDiferencia==true) {
				System.out.println("Los arreglos son diferentes");
			}else {
				System.out.println("Son iguales");
			}

		}else {
			System.out.println("Los tamaños son diferentes");
			System.out.println("Tam m: "+m.length);
			System.out.println("Tam n: "+n.length);
		}
		

		
	}

}
