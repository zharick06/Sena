import random
from Procesos import *

def prueba():
    numero=random.randint(-10,10)
    llega=Procesos(numero)
    resultadoReal=(numero%2)
    if(llega==resultadoReal):
        if llega>0:
            if  numero<0:
               print("El numero es positivo y no es par")
            
            else:
              print("El numero es negativo y no es par")     
            
        
        else:
            if numero>0:
               print("El numero es positivo y es par")
            
            else:
              print("El numero es positivo y no es par")
              
      
        
            
            
    else:
        print("ERROR")