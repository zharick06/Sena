
public class Arrelo2{
public static void main(String[] args) {

	/*Haga un arreglo de tipo entero de datos quemados del 1 al
	 *  10, por cada numero debe mostrar la tabla de multiplicar 
	 *  (debe ser del 1 al 10) con su respectivo resultado, hacerlo con un for*/
	
    
      int j=0;

	  int[] arreglo= {1,2,3,4,5,6,7,8,9,10};
	  for (int i=0 ; i < arreglo.length; ) {
		  System.out.println(arreglo[i] + "*"+ j + "=" + (arreglo[i]+j));
		  j++;
		  if (j== arreglo.length) {
			  j=0;
			i++;
		}
		
		 
	}
	 
	 
	  
	  
}

}
