import os
from traceback import print_tb

def clearConsole():
    command = 'clear'
    if os.name in ('nt', 'dos'):  # If Machine is running on Windows, use cls
        command = 'cls'
    os.system(command)

clearConsole()



print("Programa para clasificar listas de datos mediante desviaciones con respecto a la media, ingrese los siguientes datos:")

print("=====================================================================================================================")
print("")

menu=True
while menu==True:
    #pedir la cantidad de listas y el tamaño
    cantidad = int(input("Cantidad de listas"))
    tamaño = int(input("Tamaño de las listas"))
    print("")
    
    #Inicializar las listas
    diccionarioListas=[]
    listaTotal=[]
    listaSuma=[]

    #Crear cada lista
    def crearLista():
        
        b=1
        for i in range(cantidad):
            diccionarioListas.append(input("ingrese el nombre de la lista "+str(b)+ ": "))
            datos = []
            a=1
            for x in range(tamaño):
                
                x=int(input("Ingrese el dato numero "+ str(a) +"  en la lista :"))
                datos.append(x) 
                a+=1
            diccionarioListas.append(datos) 
            b+=1
    
    
    #Hacer las respectivas operaciones
    def sumarDatos():
        print("")
    
        x=1
        v=0
        c=1
        y=1
        suma=0
        for t in range(len(diccionarioListas)):
        
            if(x<len(diccionarioListas)):
 
                for  i in range(len(diccionarioListas)):
                    
                    if(x<len(diccionarioListas)):
                        
                       suma=(sum(diccionarioListas[c]))/tamaño
                       
                    if (y<len(diccionarioListas)):
                        
                        for sub in diccionarioListas[y]:
                            desviacion=suma-sub
                            ww=desviacion+desviacion
                            total=ww/tamaño
                            listaTotal.append(total)
                        
                        if(v<len(diccionarioListas)):
                            if(t<len(listaTotal)):
                                
                                print("Lista " +str(diccionarioListas[v])+" presenta una media de "+str(suma)+" y una desviación con respecto a la media de " + str(listaTotal[t]))
                        v+=2 
                        t+=1
                        y+=2
                        x+=2 
                        c+=2
                 
            
    def listas(): 
        crearLista()
        sumarDatos() 
        
    listas()
    print("")
    menu=input("Desea continuar Si/No: ") 
    if(menu=='si'):
        clearConsole()
        print("Programa para clasificar listas de datos mediante desviaciones con respecto a la media, ingrese los siguientes datos:")

        print("=====================================================================================================================")
        print("")
        
        menu=True
    else:
        menu=False      
    
         
        
     
    