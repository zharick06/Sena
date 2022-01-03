package equis;

public class Matrices {
	public static void main(String[] args) {
		/*esto es una matriz*/
		int matrizx[][]= {{2,4,6,9},
				          {1,2,3,5},
				          {6,7,8,0}};
		/*hasta aqui*/
		
		int matrizy[][]={{1,8,9,1},
		                 {7,2,10,1},
		                 {4,6,3,5}};
		
		int matrizr[][]=new int[3][4];
		
		matrizr[0][0]=matrizx[0][0]*matrizy[0][0];
		
		int res=matrizx[1][2]*matrizy[0][2];
		matrizr[1][2]=res;
		
		System.out.println();
		int filas=3;
		int columnas=4;
		
		System.out.println("matriz X");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print( matrizx[i][j]+",");
			}
			
			System.out.println();
		}
		System.out.println("matriz Y");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print( matrizy[i][j]+",");
			}
			
			System.out.println();
		}
		
		System.out.println("matriz R");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(matrizx[i][j]*matrizy[i][j]+",");
			}
			
			System.out.println();
		}
	}

}
