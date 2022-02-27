#se importa la funcion random
import random
#se importa el documento procesos con todos sus valores
from Procesos import *

#se crea la funcion prueba
def prueba():
    #se genera un numero al azar entre -10 hata 10
    numero=random.randint(-10,10)
    #se le envia el numero al azar a procesos
    llega=Procesos(numero)
    #se realiza la operacion para rectificar que el resultado que llegue de procesos es correcto
    resultadoReal=(numero%2)
    #si el resultado que llega es igual a la rectificacion
    if(llega==resultadoReal):
        #si el resultado que llega es mayor a 0 
        if llega>0:
            #y el numero es menor que 0
            if  numero<0:
                #se imprimira:
               print("El numero es positivo y no es par")
            
            else:
            #pero si el numero el menor que 0, se imprimira:
              print("El numero es negativo y no es par")     
            
        #si el resultado que llega es menor que 0
        else:
            #y el numero es mayor que 0, se imprimira:
            if numero>0:
               print("El numero es positivo y es par")
            
            #si el numero el menor que 0, se imprimira:
            else:
              print("El numero es positivo y no es par")
              
      
        
            
    #si el resultado que llega no es igual a la rectificacion se imprimira ERROR        
    else:
        print("ERROR")