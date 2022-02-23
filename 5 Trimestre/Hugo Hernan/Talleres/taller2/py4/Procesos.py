

def Procesos(edadJ, edadM,edadP):
    contemporaneos=""
    if edadJ==edadM & edadM==edadP:
        contemporaneos="Los 3 son contemporaneos"
    else:
        if edadJ==edadM:
            contemporaneos="Juan y Mario son contemporaneos"
            
        elif edadJ==edadP:
            contemporaneos="Juan y Pedro son contemporaneos"
            
        elif edadM==edadP:
            contemporaneos="Mario y Pedro son contemporaneos" 
        
        else:
            contemporaneos="ninguno es contemporaneo"    
    
    return(print(contemporaneos))                   
            
  
           
            
    
   
  