salir = False
while salir==False:
    class recargas():
     def __int__(self,op):
         self.op=input()
        
      
     def claro(self):   
      
            print("\n------------ESTAS SON LAS OPCIONES----------") 
            print("1: recargas")
            print("2: paquetes")
            print("3: paquete-recarga")
            print("4: salir")
            l = int(input("que opcion eligiras?: "))
            if l == 1:
                print("-----Valores de recarga son: -------")
                print("1. $5.000")
                print("2. $10.000")
                print("3. $20.000")
                print("4. $50.000")
                p= int(input("¿Que recarga quiere llevar?"))
                if p ==1:
                  q= 5000 / 100
                  print( "Tu recarga de 5.000 tiene:", q," minutos")
                
                elif p ==2:
                  q= 10000/ 100
                  print( "Tu recarga de 10.000 tiene:", q," minutos")    
                           
                elif p ==3:
                  r= 20000/100
                  q= (20000/100) *2
                  print( "Tu recarga de 20.000 tiene:", r," minutos, pero por haber recargado mas 20.000 recibiste un premio con el doble de minutos, tus minutos totales som:",q)
                
                 
                elif p ==4:
                  r=50000/100
                  q= (50000/100) *2
                  print( "Tu recarga de 50.000 tiene:", r," minutos, pero por haber recargado mas 20.000 recibiste un premio con el doble de minutos, tus minutos totales som:",q)
                
                else:
                  print("Opcion no valida")    
                 
            elif  l == 2:
              print("1.Datos para 1 dia: $3.000")
              print("2. Datos 3 dias: $5.000")
              print("3: Datos 8 dias: $ 10.000")
              p= int(input("¿Que paquete quiere llevar?"))
              if p ==1:
                  print("tu paquete que datos surara 1 dia y el costo total sera de: 3.000")
             
              elif p ==2:
                 print("tu paquete que datos surara 3 dias y el costo total sera de: 5.000") 
                
              elif p == 3:
                 print("tu paquete que datos surara 8 dias y el costo total sera de: 10.000")
                
              else:
                print("Opcion no valida")
                
          
            elif l==3:
             print("1.Costo de paquete $8.000")
             print("2.Costo de paquete $10.000")
             print("3.Costo de paquete $13.000")
             print("4.Costo de paquete $15.000")
             print("5.Costo de paquete $15.000")
             print("6.Costo de paquete $20.000")
             print("7.Costo de paquete $23.000")
             print("8.Costo de paquete $25.000")
             print("9.Costo de paquete $30.000")
             print("10.Costo de paquete $53.000")
             print("11.Costo de paquete $55.000")
             print("12.Costo de paquete $60.000")
             p= int(input("¿Que paquete quiere llevar?"))
             if p ==1:
                 print("tu paquete de 8.000 tiene 50 minutos y 1 dia de datos")
                
             elif p== 2:
                 print("tu paquete de 10.000 tiene 100 minutos y 3 dias de datos")  
                
             elif p== 3:
                 print("tu paquete de 13.000 tiene 100 minutos y 1 dia de datos")
                
             elif p== 4:
                 print("tu paquete de 15.000 tiene 50 minutos y 8 dias de datos")
                
             elif p== 5:
                 print("tu paquete de 15.000 tiene 100 minutos y 3 dias de datos")
                
             elif p== 6:
                 print("tu paquete de 20.000 tiene 100 minutos y 8 dias de datos")
                
             elif p== 7:
                 print("tu paquete de 23.000 tiene 200 minutos y 1 dia de datos")
                
             elif p== 8:
                 print("tu paquete de 25.000 tiene 200 minutos y 3 dias de datos")
                
             elif p== 9:
                 print("tu paquete de 30.000 tiene 200 minutos y 8 dias de datos") 
                
             elif p== 10:
                 print("tu paquete de 53.000 tiene 500 minutos y 1 dia de datos")
                                                                  
             elif p== 11:
                 print("tu paquete de 55.000 tiene 500 minutos y 3 dias de datos") 
                
             elif p== 12:
                 print("tu paquete de 60.000 tiene 500 minutos y 8 dia de datos")               
             
             else:
                 ("Eleciones un numero del 1 al 12") 
        
            elif l==4:
                 salir= True
                
            else:
                 ("Opcion invalida")        
                 
     def tigo(self):   
       
            print("\n------------ESTAS SON LAS OPCIONES----------") 
            print("1: recargas")
            print("2: paquetes")
            print("3: paquete-recarga")
            print("4: salir")
            l = int(input("que opcion eligiras?: "))
            if l == 1:
                print("-----Valores de recarga son: -------")
                print("1. $5.000")
                print("2. $10.000")
                print("3. $20.000")
                print("4. $50.000")
                p= int(input("¿Que recarga quiere llevar?"))
                if p ==1:
                    q= 5000 / 102
                    print( "Tu recarga de 5.000 tiene:", q," minutos")
                
                elif p ==2:
                    q= 10000/ 102
                    print( "Tu recarga de 10.000 tiene:", q," minutos")    
                           
                elif p ==3:
                    r= 20000/102
                    q= (20000/102) *2
                    print( "Tu recarga de 20.000 tiene:", r," minutos, pero por haber recargado mas 20.000 recibiste un premio con el doble de minutos, tus minutos totales som:",q)
                
                 
                elif p ==4:
                    r=50000/102
                    q= (50000/102) *2
                    print( "Tu recarga de 50.000 tiene:", r," minutos, pero por haber recargado mas 20.000 recibiste un premio con el doble de minutos, tus minutos totales som:",q)
                
                else:
                  print("Opcion no valida")    
                 
            elif  l == 2:
                print("1.Datos para 1 dia: $3.000")
                print("2. Datos 3 dias: $5.000")
                print("3: Datos 8 dias: $ 10.000")
                p= int(input("¿Que paquete quiere llevar?"))
                if p ==1:
                   print("tu paquete que datos surara 1 dia y el costo total sera de: 3.000")
             
                elif p ==2:
                  print("tu paquete que datos surara 3 dias y el costo total sera de: 5.000") 
                
                elif p == 3:
                  print("tu paquete que datos surara 8 dias y el costo total sera de: 10.000")
                
                else:
                  print("Opcion no valida")
                
          
            elif l==3:
             print("1.Costo de paquete $8.000")
             print("2.Costo de paquete $10.000")
             print("3.Costo de paquete $13.000")
             print("4.Costo de paquete $15.000")
             print("5.Costo de paquete $15.000")
             print("6.Costo de paquete $20.000")
             print("7.Costo de paquete $23.000")
             print("8.Costo de paquete $25.000")
             print("9.Costo de paquete $30.000")
             print("10.Costo de paquete $53.000")
             print("11.Costo de paquete $55.000")
             print("12.Costo de paquete $60.000")
             p= int(input("¿Que paquete quiere llevar?"))
             if p ==1:
                 print("tu paquete de 8.000 tiene 49 minutos y 1 dia de datos")
                
             elif p== 2:
                 print("tu paquete de 10.000 tiene 98 minutos y 3 dias de datos")  
                
             elif p== 3:
                 print("tu paquete de 13.000 tiene 98 minutos y 1 dia de datos")
                
             elif p== 4:
                 print("tu paquete de 15.000 tiene 49 minutos y 8 dias de datos")
                
             elif p== 5:
                 print("tu paquete de 15.000 tiene 49 minutos y 3 dias de datos")
                
             elif p== 6:
                 print("tu paquete de 20.000 tiene 49 minutos y 8 dias de datos")
                
             elif p== 7:
                 print("tu paquete de 23.000 tiene 196 minutos y 1 dia de datos")
                
             elif p== 8:
                 print("tu paquete de 25.000 tiene 196 minutos y 3 dias de datos")
                
             elif p== 9:
                 print("tu paquete de 30.000 tiene 196 minutos y 8 dias de datos") 
                
             elif p== 10:
                 print("tu paquete de 53.000 tiene 490 minutos y 1 dia de datos")
                                                                  
             elif p== 11:
                 print("tu paquete de 55.000 tiene 490 minutos y 3 dias de datos") 
                
             elif p== 12:
                 print("tu paquete de 60.000 tiene 490 minutos y 8 dia de datos")               
             
             else:
                 ("Eleciones un numero del 1 al 12") 
        
            elif l==4:
                 salir= True
                
            else:
                 ("Opcion invalida")     
                 
     def movistar(self):   
       
            print("\n------------ESTAS SON LAS OPCIONES----------") 
            print("1: recargas")
            print("2: paquetes")
            print("3: paquete-recarga")
            print("4: salir")
            l = int(input("que opcion eligiras?: "))
            if l == 1:
                print("-----Valores de recarga son: -------")
                print("1. $5.000")
                print("2. $10.000")
                print("3. $20.000")
                print("4. $50.000")
                p= int(input("¿Que recarga quiere llevar?"))
                if p ==1:
                  q= 5000 / 110
                  print( "Tu recarga de 5.000 tiene:", q," minutos")
                
                elif p ==2:
                  q= 10000/ 110
                  print( "Tu recarga de 10.000 tiene:", q," minutos")    
                           
                elif p ==3:
                  r= 20000/110
                  q= (20000/110) *2
                  print( "Tu recarga de 20.000 tiene:", r," minutos, pero por haber recargado mas 20.000 recibiste un premio con el doble de minutos, tus minutos totales som:",q)
                
                 
                elif p ==4:
                  r=50000/110
                  q= (50000/110) *2
                  print( "Tu recarga de 50.000 tiene:", r," minutos, pero por haber recargado mas 20.000 recibiste un premio con el doble de minutos, tus minutos totales som:",q)
                
                else:
                  print("Opcion no valida")    
                 
            elif  l == 2:
              print("1.Datos para 1 dia: $3.000")
              print("2. Datos 3 dias: $5.000")
              print("3: Datos 8 dias: $ 10.000")
              p= int(input("¿Que paquete quiere llevar?"))
              if p ==1:
                  print("tu paquete que datos surara 1 dia y el costo total sera de: 3.000")
             
              elif p ==2:
                 print("tu paquete que datos surara 3 dias y el costo total sera de: 5.000") 
                
              elif p == 3:
                 print("tu paquete que datos surara 8 dias y el costo total sera de: 10.000")
                
              else:
                print("Opcion no valida")
                
          
            elif l==3:
              print("1.Costo de paquete $8.000")
              print("2.Costo de paquete $10.000")
              print("3.Costo de paquete $13.000")
              print("4.Costo de paquete $15.000")
              print("5.Costo de paquete $15.000")
              print("6.Costo de paquete $20.000")
              print("7.Costo de paquete $23.000")
              print("8.Costo de paquete $25.000")
              print("9.Costo de paquete $30.000")
              print("10.Costo de paquete $53.000")
              print("11.Costo de paquete $55.000")
              print("12.Costo de paquete $60.000")
              p= int(input("¿Que paquete quiere llevar?"))
              if p ==1:
                  print("tu paquete de 8.000 tiene 45 minutos y 1 dia de datos")
                
              elif p== 2:
                  print("tu paquete de 10.000 tiene 90 minutos y 3 dias de datos")  
                
              elif p== 3:
                  print("tu paquete de 13.000 tiene 90 minutos y 1 dia de datos")
                
              elif p== 4:
                  print("tu paquete de 15.000 tiene 45 minutos y 8 dias de datos")
                
              elif p== 5:
                  print("tu paquete de 15.000 tiene 45 minutos y 3 dias de datos")
                
              elif p== 6:
                  print("tu paquete de 20.000 tiene 45 minutos y 8 dias de datos")
                
              elif p== 7:
                  print("tu paquete de 23.000 tiene 181 minutos y 1 dia de datos")
                
              elif p== 8:
                  print("tu paquete de 25.000 tiene 181 minutos y 3 dias de datos")
                
              elif p== 9:
                  print("tu paquete de 30.000 tiene 181 minutos y 8 dias de datos") 
                
              elif p== 10:
                  print("tu paquete de 53.000 tiene 454 minutos y 1 dia de datos")
                                                                  
              elif p== 11:
                  print("tu paquete de 55.000 tiene 454 minutos y 3 dias de datos") 
                
              elif p== 12:
                  print("tu paquete de 60.000 tiene 454 minutos y 8 dia de datos")               
             
              else:
                  ("Eleciones un numero del 1 al 12") 
        
            elif l==4:
                 salir= True
                
            else:
                 ("Opcion invalida")                              
                 
     def virgin(self):   
        
            print("\n------------ESTAS SON LAS OPCIONES----------") 
            print("1: recargas")
            print("2: paquetes")
            print("3: paquete-recarga")
            print("4: salir")
            l = int(input("que opcion eligiras?: "))
            if l == 1:
                print("-----Valores de recarga son: -------")
                print("1. $5.000")
                print("2. $10.000")
                print("3. $20.000")
                print("4. $50.000")
                p= int(input("¿Que recarga quiere llevar?"))
                if p ==1:
                  q= 5000 / 90
                  print( "Tu recarga de 5.000 tiene:", q," minutos")
                
                elif p ==2:
                  q= 10000/ 90
                  print( "Tu recarga de 10.000 tiene:", q," minutos")    
                           
                elif p ==3:
                  r= 20000/90
                  q= (20000/90) *2
                  print( "Tu recarga de 20.000 tiene:", r," minutos, pero por haber recargado mas 20.000 recibiste un premio con el doble de minutos, tus minutos totales som:",q)
                
                 
                elif p ==4:
                  r=50000/102
                  q= (50000/90) *2
                  print( "Tu recarga de 50.000 tiene:", r," minutos, pero por haber recargado mas 20.000 recibiste un premio con el doble de minutos, tus minutos totales som:",q)
                
                else:
                  print("Opcion no valida")    
                 
            elif  l == 2:
              print("1.Datos para 1 dia: $3.000")
              print("2. Datos 3 dias: $5.000")
              print("3: Datos 8 dias: $ 10.000")
              p= int(input("¿Que paquete quiere llevar?"))
              if p ==1:
                  print("tu paquete que datos surara 1 dia y el costo total sera de: 3.000")
             
              elif p ==2:
                 print("tu paquete que datos surara 3 dias y el costo total sera de: 5.000") 
                
              elif p == 3:
                 print("tu paquete que datos surara 8 dias y el costo total sera de: 10.000")
                
              else:
                print("Opcion no valida")
                
          
            elif l==3:
             print("1.Costo de paquete $8.000")
             print("2.Costo de paquete $10.000")
             print("3.Costo de paquete $13.000")
             print("4.Costo de paquete $15.000")
             print("5.Costo de paquete $15.000")
             print("6.Costo de paquete $20.000")
             print("7.Costo de paquete $23.000")
             print("8.Costo de paquete $25.000")
             print("9.Costo de paquete $30.000")
             print("10.Costo de paquete $53.000")
             print("11.Costo de paquete $55.000")
             print("12.Costo de paquete $60.000")
             p= int(input("¿Que paquete quiere llevar?"))
             if p ==1:
                 print("tu paquete de 8.000 tiene 55 minutos y 1 dia de datos")
                
             elif p== 2:
                 print("tu paquete de 10.000 tiene 111 minutos y 3 dias de datos")  
                
             elif p== 3:
                 print("tu paquete de 13.000 tiene 111 minutos y 1 dia de datos")
                
             elif p== 4:
                 print("tu paquete de 15.000 tiene 55 minutos y 8 dias de datos")
                
             elif p== 5:
                 print("tu paquete de 15.000 tiene 55 minutos y 3 dias de datos")
                
             elif p== 6:
                 print("tu paquete de 20.000 tiene 55 minutos y 8 dias de datos")
                
             elif p== 7:
                 print("tu paquete de 23.000 tiene 222 minutos y 1 dia de datos")
                
             elif p== 8:
                 print("tu paquete de 25.000 tiene 222 minutos y 3 dias de datos")
                
             elif p== 9:
                 print("tu paquete de 30.000 tiene 222 minutos y 8 dias de datos") 
                
             elif p== 10:
                 print("tu paquete de 53.000 tiene 555 minutos y 1 dia de datos")
                                                                  
             elif p== 11:
                 print("tu paquete de 55.000 tiene 555 minutos y 3 dias de datos") 
                
             elif p== 12:
                 print("tu paquete de 60.000 tiene 555 minutos y 8 dia de datos")               
             
             else:
                 ("Eleciones un numero del 1 al 12") 
        
            elif l==4:
                 salir= True
                
            else:
                 ("Opcion invalida")    
                 
                 
     def menu(self):
        
         print("\n------------ESTO SON LOS OPERADORES----------") 
         print("1: Claro")
         print("2: Tigo")
         print("3: Movistar")
         print("4: Virgin Movie")
         print("5: salir")
         ope = int(input("que opcion eligiras?: "))
        
         if ope == 1:
             print(claro())
            
         elif  ope== 2:
             print(tigo())
          
         elif  ope== 3:
             print(movistar())
            
         elif ope==4:
             print(virgin())
       
         elif ope == 5:
             salir==True
             print("tu servicio ha terminado")
         else:
             print("opcion")   
    pr= recargas() 
    pr.menu()        
                                   