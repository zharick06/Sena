#se importa la funcion random
import random
#se importa el documento procesos con todos sus valores
from Procesos import *

#se crea la funcion prueba
def prueba():
    #se crea un numero al azar entre 1 y 10
    numero=random.randint(1,10)
    #se le entrega el numero a procesos
    llega=Procesos(numero)
    #se realiza la rectificacion
    precio=12000
    total=numero*precio
    #si las docenas compradas fueron mayores que 3
    if numero > 3:
        #se le hara un descuento del 15%
        descuento=0.15*total
        #se le hara un obsequio
        obsequio=numero-3
        #se le restara el descuento a el total
        totalpagar=total-descuento
        #Si el el resultado que llega es igual a la rectificacion 
        if llega==totalpagar:     
            #se imprimira:
            print("Cantidad de docenas pedidas: ",numero,
               "\nDescuento: ",descuento,
               "\nObsequio: ",obsequio,
               "\nTotal a pagar: $", totalpagar
               )
        #Si el el resultado que llega no es igual a la rectificacion       
        else:
            #se imprimira:
            print("ERROR")    
    #si las docenas compradas fueron menores que 3    
    else:
        #se le hara un descuento del 10%
        descuento=0.15*total
        #se le restara el descuento a el total
        totalpagar=total-descuento
        #Si el el resultado que llega es igual a la rectificacion
        if llega==totalpagar: 
            #se imprimira:

            print("\nCantidad de docenas pedidas: ",numero,
               "\nDescuento: ",descuento,
               "\nTotal a pagar: $", totalpagar)
         #Si el el resultado que llega no es igual a la rectificacion       
        else:
            #se imprimira:
            print("ERROR")     

        
   
              
      
        
            
