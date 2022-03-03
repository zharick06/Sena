
print("tipos de datos")
a= 2
pi= 3.1416
c= 'a'
name ='JhonJhon Camilo'
q= True
x=None

print(pi)
print(c)
print(name)
print(q)
print(x)

print("--------------------------------------------")

print("listas")
man = ["pepito", "juanita","martin","diana","alicia"]
man.reverse()
print(man[0])
print(man[2])
print(man[-2])
print(man[-4])
print(man[-1])
print(len(man))
print(man)
for indes in man:
  print(indes)

for indes in range(4):
  print(man[indes])  

for indes in range(len(man)):
  print(indes)

print("--------------------------------------------")

print("Diccionarios")
dats={'name':'zharick','edad':16,'telefono':3146754331,'genero':'femenino '}
print(dats)
print(dats['name'])
print(dats.keys())
print(dats.values())

print("--------------------------------------------")

print("Operadoresprperadores de Cojuntos")
print({1,2,3,4,5}({3,4,5,6}))
print({1,2,3,4,5} & ({3,4,5,6}))
#union
print({1,2,3,4,5}|({3,4,5,6}))
#diferencia
print({1,2,3,4,5}-({3,4,5,6}))
#diferencia simetrica
print({1,2,3,4,5}^({3,4,5,6}))
#superset check
print({1,2,}>=({1,2,3}))
#subsetsubset check
print({1,2,}<=({1,2,3}))
#disjoint check
print({1,2}.isdisjoint({3,4}))
#existence check
print(2 in{1,2,3})
print(4 in{1,2,3})
print(4 not in{1,2,3})

print("--------------------------------------------")

#Add and Remove
s={1,2,3}
s.add(4)
s.discard(3)
s.discard(5)
print(s)

print("--------------------------------------------")

restaurante=["McDonal´s","Buerger King","McDonal´s","chicken chicken"]
unique_restaurante= set(restaurante)
print(unique_restaurante)
print(list(unique_restaurante))

print("--------------------------------------------")

print("Operadores")
import math
a,b=2,3
print(a ** b)
print(pow(a,b))
print(math.pow(a,b))

print("--------------------------------------------")

print("Operadores incremento decremento")
a= 3
a+= 1
print(a)
b=8
b*= 2 
print(b)
b**=3
print(b)
b /= 2
print(b)
b//= 3
print(b)
b%= 2
print(b)
b**=3
print(b)

print("--------------------------------------------")

print("Operadores")
x = True
y = True
z = x and y
print(z)

print("--------------------------------------------")

x = True
y = False
z = x and y
print(z)

print("--------------------------------------------")

x = False
y = True
z = x and y
print(z)

print("--------------------------------------------")

x = True
y = True
z = x or y
print(z)

print("--------------------------------------------")

x = True
y = False
z = x or y
print(z)

print("--------------------------------------------")

x = False
y = True
z = x or y
print(z)

print("--------------------------------------------")

x = True
y = not x
print(y)

print("--------------------------------------------")

x = False
y = not x
print(y)

print("--------------------------------------------")

print("Condicionales")

n=5
print("El nuneronunero es mayor a" if n>2 else "el numero es menor o igual a 2" )

print("--------------------------------------------")

a = 4
if a in (3,4,6):
    print('yes') 
else:
    print('no')

print("--------------------------------------------")
    
if True:
    print('conectado') 
else:
    print('deconectado')
    
print("--------------------------------------------")

def mayoredad():
    edad=int(input("¿Cuantos años tiene?"))
    if edad < 18:
        print("Es usted menor de edad")
    else:
        print("Es usted mayor de edad")
    print("Hasta luego")

mayoredad()   

print("--------------------------------------------")

print("Ciclos")
i=0
while i< 7:
    print(i)
    if i == 4:
        print("Se paro el ciclo")
        break
    i+= 1
    
print("--------------------------------------------")
    
def rango():
    for i in range (1,6):
        print(i)
rango()

print("--------------------------------------------")

for i in (0,1,2,3,4):
    print(i)
    if i == 2:
        break

print("--------------------------------------------")
    
def positivos():
    numero= int(input("Escriba un numero positivo"))
    while numero < 0:
        print("Ha escrito un numero negativo IntenteloIntentelo de nuevo")
        numero = int(input("Escirba un numero positivo: "))
    print("Gracias por su colaboracion")
positivos()


print("--------------------------------------------")

def saludos():
    veces = int(input("¿Cuantas veces quiere que le salude"))
    for i in range(veces):
        print("Hola", end="")
    print()
    print("Adios")
saludos() 

print("--------------------------------------------")

def multiplos(): 
    print("Comenzamos")
    cuenta=0
    for i in range(1,6):
        if i % 2 == 0:
            cuenta = cuenta + 1
    print("DesdeDesde 1 hasta 5 hay {cuenta} multiplos de 2")
multiplos() 

print("--------------------------------------------")

def  rango():
    for i in range (1,6):
        print(i)
        print("añañai")
rango()

print("--------------------------------------------")

print("Recorre Lista")

def lista ():
    for x in ['one','two','three', 'four']:
        print(x)
lista()

print("--------------------------------------------")

def enumera():
    for index, item in enumerate(['Diana','Yonier','Alejandro','Anggy']): 
        print(index,item)
enumera()   

print("--------------------------------------------")

print("Recorrer listas y diccionarios")

while i <3:
    print(i)
else: 
    print('done')
    
print("--------------------------------------------")
     
for i in range(2):
    print(i)
    if i == 1:
        break
    else:
        print('done')       
        
d = {"a":1, "b": 2, "c":3}  
for key in d:
    print(key)

print("--------------------------------------------")
    
    
print("Recorrer listas de tuplas")

def tuplas():
    colletion =[('a','b','c'),('x','y','z'),('1','2','3')]
    for item in colletion:
        i1=item[0]
        i2= item[1]
        i3= item[2]
        print(i1)
tuplas() 
  
print("--------------------------------------------")

print("Ingresar daros por teclado")

def teclado():
    nombre= raw_input("introduce tu nombre") 
    print("Bienvenido")
    letra= raw_input("introduce enter para finalizar")
teclado() 
  
print("--------------------------------------------")
 
def teclado():
    n1= int(input("Ingrese primer numero")) 
    n2= int(input("Ingrese segundo numero"))
    n3= n2+ n1
    print("La suma es") 
    print(n3)
teclado()

print("--------------------------------------------")

def teclas():
    print("¿Como se llamaComosellama?")
    nombre= input()
    print(f"me alegro de conocerte, {nombre}")
teclas()

print("--------------------------------------------")

def convertir():
    cantidad = float(input("Digame una cantidad de pesos")) 
    print(f"{cantidad} pesoscantidadpesos equivalen a {round(cantidad * 2900)} dolares")
convertir()

print("--------------------------------------------")

def mostraredad():
    edad= int(input("Diga su edad"))
    print(f"Su edad son {edad} años") 
mostraredad()

print("--------------------------------------------")

def restar():
    numero1= int(input("Digame un numero: "))
    numero2= int(input("Digame un numero mayor que {numero1}: "))
    print(f"La diferencia entre ellos es {numero2 - numero1}.")
restar()
    
               
       
    

    
         
           
          
            
            
          
     
            





