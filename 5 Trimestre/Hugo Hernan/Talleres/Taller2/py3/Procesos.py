
#Se crea la funcion para hacer los procesos y se le ingresa los datos para realizar los procesos
def Procesos(docenas):
    #se le asigna un valor a las docenas
    precio=12000
    #se multiplica la cantidad de docenas por el precio
    total=docenas*precio
    #si las docenas compradas es mayor que 3 
    if docenas > 3:
        #se le hara un descuento del 15%
        descuento=0.15*total
        #se le restara el descuento a el total
        totalpagar=total-descuento
        #se retornara el precio total que tiene que pagar
        return(totalpagar)
    #si las docenas compradas son menor que 3
    else:
        #se le hara un descuento del 10%
        descuento=0.10*total
        #se le restara el descuento a el total
        totalpagar=total-descuento
        #se retornara el precio total que tiene que pagar
        return(totalpagar)
            
  
           
            
    
   
  