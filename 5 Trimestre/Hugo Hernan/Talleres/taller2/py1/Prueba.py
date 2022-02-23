import random
from Procesos import *

def prueba():
    numero=random.uniform(0,12)
    numero2=random.uniform(0,60)
    llega=Procesos(numero, numero2)
    resultadoReal=((numero*3000)+(numero2*50))
    if(llega==resultadoReal):
        print("su total a pagar es: ", llega)
    else:
        print("ERROR")