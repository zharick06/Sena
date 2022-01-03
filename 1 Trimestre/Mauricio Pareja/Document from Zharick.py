#Importar las bibliotecas
from io import open
import pathlib
import os
import os.path

#archivo = archivo txt

#se hace una funcion para la creacion del archivo
def crear():
    #pedir el nombre del archivo
    Nom=str(input("Nombre del disco: "))
    #con el nombre del disco se realiza el enrutamiento
    ro = "./disco/" + Nom + ".txt"
    #buscar archivo o si no existe crear el archivo
    ruta = str(pathlib.Path().absolute()) + ro
    #lo que lleva dentro el dico
    ID = str(input("¿Cuál es el ID?: "))
    Autor =  str(input("¿Cuál es el nombre del autor?: "))
    Nombre= str(input("¿Cuál es el nombre de la canción?: "))
    genero= str(input("¿Cuál es el género?: ")) 
    tiempo = str(input("¿Cuál es la duración de la canción?: "))
    #concatenamos lo que llevara el dico en su interior
    nuevo= ID + " " + Autor +" "+ Nombre +" "+ genero +" "+ tiempo
    #abriremos la archico para esribir
    archivo = open(ruta,"a+")
    #Introduciremos los datos concatenados
    archivo.write(nuevo + '\n')
    #cerramos el archivo
    archivo.close

     
#se hace una funcion para mostrar si existe y la información         
def mostrar():
    #Se pide el dico que se quiere ver
    mo= str(input("¿Qué disco quieres ver?: "))
    #con el nombre del archivo se realiza el enrutamiento
    re = "/disco/"+  mo + ".txt"
    #buscar archivo
    ruta = str(pathlib.Path().absolute()) + re
    #abrir el archivo
    ar = open(ruta,"r")
    #leer el contenido
    contenido = ar.read()
    #buscar el archivo
    mostrare = (os.path.abspath("./" ) + re)
    #si el archivo existe mostrar el disco existe  
    if os.path.isfile(mostrare):
        print("Este Disco",mo,"si existe", contenido)
    
    #si no mostrar: disco no existe
    else:
        print("Este Disco no existe")
    #cerar el archivo    
    ar.close()    
         
# se hace una funcion para Mostrar la imformacion del archivo           
def buscar():
     #Se pide el dico que se quiere ver
     mo= str(input("¿Qué disco quieres ver?: "))
     #con el nombre del archivo se realiza el enrutamiento
     re = "./disco/" + mo + ".txt"
     #buscar archivo
     archivore =str(pathlib.Path().absolute()) + re
     #Abrir archivo
     ar = open(archivore,"r")
     #Leer el contenido
     contenido = ar.read()
     #imprimir el disco
     print("Disco si existe","-" +contenido)
     #cerar el archivo
     ar.close()
     
#se hace una funcion para introducir texto en un archivo     
def introducir():
    #Se pide el dico en el que se quiere introducir
    mo= str(input("¿En qué disco quieres introducir?: "))
    #con el nombre del archivo se realiza el enrutamiento
    re = "./disco/" + mo + ".txt"
    #se pregunta lo que se va aintroducir en el archivo 
    ID = str(input("¿Cuál es el ID?: "))
    Autor =  str(input("¿Cuál es el nombre del autor?: "))
    Nombre= str(input("¿Cuál es el nombre de la canción?: "))
    genero= str(input("¿Cuál es el genero?: ")) 
    tiempo = str(input("¿Cuál es la duracion de la canción?: "))
    #concatenamos lo que llevara el dico en su interior
    nuevo= ID + " " + Autor +" "+ Nombre +" "+ genero +" "+ tiempo
    #abriremos la archico para esribir
    archivo = open(re,"a+")
    #Introduciremos los datos concatenados
    archivo.write(nuevo + '\n' )
    #cerramos el archivo
    archivo.close
     
 
 
# se hace una funcion para elimar el archivo       
def eliminar():
    #se pide el nombre del disco que se quiere elimar
    mo= str(input("¿Qué disco quieres eliminar?: "))
    #con el nombre del disco se realiza el enrutamiento
    re = "./disco/" + mo + ".txt"
    #Buscar archivo
    archivore =str(pathlib.Path().absolute()) + re
    #Eliminar archivo
    os.remove(archivore)
    

# se hace una funcion para renombrar el archivo       
def  renombrar():
    #se pide el nombre del archivo que desea cambiar el nombre
    mo= str(input("¿Qué disco quieres cambiar?: "))
    #con el nombre del disco se realiza el enrutamiento
    re =  "./disco/" + mo + ".txt"
    #se pide el nuevo nombre del archivo
    o = str(input("¿Cuál es el nuevo Nombre?: "))
    #con el nombre del disco se realiza el enrutamiento
    rere =  "./disco/" + o + ".txt"
    #se renombra el archivo
    os.rename(re, rere)

#se hace una funcion prar el menu        
def menu():
    #Se dice que correcto es falso para poder pedir el numero
    correcto=False
    #se dice que num es 0 para poder pedir el numero
    num=0
    
    #Mientras no sea correcto 
    while(not correcto):
        #tratar de pedir un numero
        try:
            #se pide un numero de la opcion del menu
            num = int(input("Introduce un numero entero: "))
            #despues de pedir el numero correcto = verdadero para poder retornar el numero 
            correcto=True
        #si no ingresa un numero entero imprimir : Error, introduce un numero entero. y volver a preguntar 
        except ValueError:
            print('Error, introduce un numero entero')
    #se reotna un numero 
    return num
#se dice que salir es falso para que el menu vuelva a salir despues de haber hecho una opción del menu
salir = False
opcion = 0
 
while not salir:
    #Se imprimen las opciones del menu
    print ("1. Crear Disco")
    print ("2. Mostrar información")
    print ("3. Buscar disco")
    print ("4. Introducir en disco")
    print ("5. Eliminar disco")
    print ("6. Renombrar disco")
    print ("7. Salir")
     
    print ("Elige una opcion")
 
    opcion = menu()
    #se hace la conparacion para activar las fuciones, dependiendo de la opcion elegida
    
    #si el numero fue 1 imprimir la función crear
    if opcion == 1:
        print (crear())
        
    #si el numero fue 2 imprimir la función mostrar    
    elif opcion == 2:
        print (mostrar())
        
    #si el numero fue 3 imprimir la función buscar    
    elif opcion == 3:
        print(buscar())
        
    #si el numero fue 4 imprimir la función introducir   
    elif opcion == 4:
        print(introducir()) 
        
    #si el numero fue 5 imprimir la función eliminar      
    elif opcion == 5:
       print(eliminar()) 
       
    #si el numero fue 6 imprimir la función renombrar   
    elif opcion ==  6:
      print(renombrar())  
      
    #si el numero fue 7 detener el menu  
    elif opcion == 7:
           salir = True
    #si ningun numero elegido esta en el menu imprimir:      
    else:
        print ("Introduce un numero entre 1 y 7")
#cuando se elija la opcion 7 imprimir
print ("Fin")  
 
