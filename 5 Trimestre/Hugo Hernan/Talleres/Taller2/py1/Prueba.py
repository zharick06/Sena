#se importa la funcion random
import random
#se importa el documento procesos con todos sus valores
from Procesos import *

#se crea la funcion prueba
def prueba():
    #se genera un numero al azar entre 0 y 12
    numero=random.uniform(0,12)
    #se genera un numero al azar entre 0 y 60
    numero2=random.uniform(0,60)
    #se le envian los numero a proceso
    llega=Procesos(numero, numero2)
    #se rectifica que el valor que llegue de procesos
    resultadoReal=((numero*3000)+(numero2*50))
    if(llega==resultadoReal):
        #si el el valor que llega de procesos es igual al que se rectifico se imprime cual es el valor a pagar
        print("su total a pagar es: ", llega)
    else:
        #si el valor que llega de procesos es no igual al que se rectifico se imprime ERROR
        print("ERROR")