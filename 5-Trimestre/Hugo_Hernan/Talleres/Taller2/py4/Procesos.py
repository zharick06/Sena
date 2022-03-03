
#Se crea la funcion para hacer los procesos y se le ingresa los datos para realizar los procesos
def Procesos(edadJ, edadM,edadP):
    #se crea la variable contemporaneos
    contemporaneos=""
    #si la edad de los 3 es igual
    if edadJ==edadM & edadM==edadP:
        #se le dara este valor a contemporaneos
        contemporaneos="Los 3 son contemporaneos"
    #si la edad de los 3 no es igual    
    else:
        #si la edad de juan y mario es igual
        if edadJ==edadM:
            #se le dara este valor a contemporaneos
            contemporaneos="Juan y Mario son contemporaneos"
        #si la edad de juan y pedro es igual    
        elif edadJ==edadP:
            #se le dara este valor a contemporaneos
            contemporaneos="Juan y Pedro son contemporaneos"
        #si la edad de mario y pedro es igual    
        elif edadM==edadP:
            #se le dara este valor a contemporaneos
            contemporaneos="Mario y Pedro son contemporaneos" 
        #si ninguna de las edades es igual
        else:
            #se le dara este valor a contemporaneos
            contemporaneos="ninguno es contemporaneo"    
    #se retorna la variable ontemporaneos
    return(print(contemporaneos))                   
            
  
           
            
    
   
  