
#Se crea la funcion para hacer los procesos y se le ingresa los datos para realizar los procesos
def Procesos(n1,n2):
   #se multiplica la cantidad de horas por el valor de cada hora
    hora=(n1 *3000) 
    #se multiplica la cantidad de minutos por el valor de cada minuto
    minutos=(n2*50)
    #se suma el valor de los minutos y las horas
    pagar=hora + minutos  
    #se returna el precio total a pagar
    return(pagar)
           
            
    
   
  