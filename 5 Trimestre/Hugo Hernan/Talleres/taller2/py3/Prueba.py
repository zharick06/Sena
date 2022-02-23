import random
from Procesos import *

def prueba():
    numero=random.randint(1,10)
    llega=Procesos(numero)
    
    precio=12000
    total=numero*precio
    if numero > 3:
        descuento=0.15*total
        obsequio=numero-3
        totalpagar=total-descuento
        if llega==totalpagar:     
            print("Cantidad de docenas pedidas: ",numero,
               "\nDescuento: ",descuento,
               "\nObsequio: ",obsequio,
               "\nTotal a pagar: $", totalpagar
               )
        else:
            print("ERROR")    
        
    else:
        descuento=0.15*total
        totalpagar=total-descuento
        if llega==totalpagar: 
            print("\nCantidad de docenas pedidas: ",numero,
               "\nDescuento: ",descuento,
               "\nTotal a pagar: $", totalpagar)
        else:
            print("ERROR")     

        
   
              
      
        
            
