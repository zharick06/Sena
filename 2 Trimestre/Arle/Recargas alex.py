# Ejercicio recargas
class telefonia():

    def __init__(self, operador, recarga, pom):
        self.operador = operador
        self.recarga = recarga
        self.pom = pom

    def calcular(self):
        costoP = 0
        total = 0
        elecion = 0
        if self.operador == "claro":
            if self.recarga == 5000:
                if self.pom == "minutos":
                    print("ud ha recargado ", self.recarga / 100, " minutos")
                elif self.pom == "paquete":
                    costoP = int(input(
                        "elija la opcion del paquete que desea: \n 3000 \n 5000 \n  10000 \n "))
                    if costoP == 1:
                        print("Su paquete es de: ", costoP)
                    elif costoP == 2:
                        print("Su paquete es de: ", costoP)
                    elif costoP == 3:
                        print("Su paquete es de: ", costoP)
                elif "paqueteyminutos":
                    eleccion = int((input(
                        "elija la opcion del paquete que desea: 3000, 5000 o 10000: ")))
                    total = self.recarga - eleccion
                    totalMinutos = total / 100
                    print("su paquete es de ", eleccion)
                    print("sus minutos son ", totalMinutos)
            if self.recarga == 10000:
                if self.pom == "minutos":
                    print("ud ha recargado ", self.recarga / 100, " minutos")
                elif self.pom == "paquete":
                    costoP = int(input(
                        "elija la opcion del paquete que desea: \n 3000 \n 5000 \n  10000 \n "))
                    if costoP == 1:
                        print("Su paquete es de: ", costoP)
                    elif costoP == 2:
                        print("Su paquete es de: ", costoP)
                    elif costoP == 3:
                        print("Su paquete es de: ", costoP)
                elif "paqueteyminutos":
                    eleccion = int((input(
                        "elija la opcion del paquete que desea: 3000, 5000 o 10000: ")))
                    total = self.recarga - eleccion
                    totalMinutos = total / 100
                    print("su paquete es de ", eleccion)
                    print("sus minutos son ", totalMinutos)
            if self.recarga == 20000:
                if self.pom == "minutos":
                    print("ud ha recargado ", self.recarga / 100 * 2, " minutos")
                elif self.pom == "paquete":
                    costoP = int(input(
                        "elija la opcion del paquete que desea: \n 3000 \n 5000 \n  10000 \n "))
                    if costoP == 1:
                        print("Su paquete es de: ", costoP)
                    elif costoP == 2:
                        print("Su paquete es de: ", costoP)
                    elif costoP == 3:
                        print("Su paquete es de: ", costoP)
                elif "paqueteyminutos":
                    eleccion = int((input(
                        "elija la opcion del paquete que desea: 3000, 5000 o 10000: ")))
                    total = self.recarga - eleccion
                    totalMinutos = (total / 100) * 2
                    print("su paquete es de ", eleccion)
                    print("sus minutos son ", totalMinutos)
            if self.recarga == 50000:
                if self.pom == "minutos":
                    print("ud ha recargado ", self.recarga / 100 * 2, " minutos")
                elif self.pom == "paquete":
                    costoP = int(input(
                        "elija la opcion del paquete que desea: \n 3000 \n 5000 \n  10000 \n "))
                    if costoP == 1:
                        print("Su paquete es de: ", costoP)
                    elif costoP == 2:
                        print("Su paquete es de: ", costoP)
                    elif costoP == 3:
                        print("Su paquete es de: ", costoP)
                elif "paqueteyminutos":
                    eleccion = int((input(
                        "elija la opcion del paquete que desea: 3000, 5000 o 10000: ")))
                    total = self.recarga - eleccion
                    totalMinutos = (total / 100) * 2
                    print("su paquete es de ", eleccion)
                    print("sus minutos son ", totalMinutos)

        elif self.operador == "movistar":
            if self.recarga == 5000:
                if self.pom == "minutos":
                    print("ud ha recargado ", self.recarga / 110, " minutos")
                elif self.pom == "paquete":
                    costoP = int(input(
                        "elija la opcion del paquete que desea: \n 3000 \n 5000 \n  10000 \n "))
                    if costoP == 1:
                        print("Su paquete es de: ", costoP)
                    elif costoP == 2:
                        print("Su paquete es de: ", costoP)
                    elif costoP == 3:
                        print("Su paquete es de: ", costoP)
                elif "paqueteyminutos":
                    eleccion = int((input(
                        "elija la opcion del paquete que desea: 3000, 5000 o 10000: ")))
                    total = self.recarga - eleccion
                    totalMinutos = total / 110
                    print("su paquete es de ", eleccion)
                    print("sus minutos son ", totalMinutos)
            if self.recarga == 10000:
                if self.pom == "minutos":
                    print("ud ha recargado ", self.recarga / 110, " minutos")
                elif self.pom == "paquete":
                    costoP = int(input(
                        "elija la opcion del paquete que desea: \n 3000 \n 5000 \n  10000 \n "))
                    if costoP == 1:
                        print("Su paquete es de: ", costoP)
                    elif costoP == 2:
                        print("Su paquete es de: ", costoP)
                    elif costoP == 3:
                        print("Su paquete es de: ", costoP)
                elif "paqueteyminutos":
                    eleccion = int((input(
                        "elija la opcion del paquete que desea: 3000, 5000 o 10000: ")))
                    total = self.recarga - eleccion
                    totalMinutos = total / 110
                    print("su paquete es de ", eleccion)
                    print("sus minutos son ", totalMinutos)
            if self.recarga == 20000:
                if self.pom == "minutos":
                    print("ud ha recargado ", self.recarga / 110 * 2, " minutos")
                elif self.pom == "paquete":
                    costoP = int(input(
                        "elija la opcion del paquete que desea: \n 3000 \n 5000 \n  10000 \n "))
                    if costoP == 1:
                        print("Su paquete es de: ", costoP)
                    elif costoP == 2:
                        print("Su paquete es de: ", costoP)
                    elif costoP == 3:
                        print("Su paquete es de: ", costoP)
                elif "paqueteyminutos":
                    eleccion = int((input(
                        "elija la opcion del paquete que desea: 3000, 5000 o 10000: ")))
                    total = self.recarga - eleccion
                    totalMinutos = (total / 110) * 2
                    print("su paquete es de ", eleccion)
                    print("sus minutos son ", totalMinutos)
            if self.recarga == 50000:
                if self.pom == "minutos":
                    print("ud ha recargado ", self.recarga / 110 * 2, " minutos")
                elif self.pom == "paquete":
                    costoP = int(input(
                        "elija la opcion del paquete que desea: \n 3000 \n 5000 \n  10000 \n "))
                    if costoP == 1:
                        print("Su paquete es de: ", costoP)
                    elif costoP == 2:
                        print("Su paquete es de: ", costoP)
                    elif costoP == 3:
                        print("Su paquete es de: ", costoP)
                elif "paqueteyminutos":
                    eleccion = int((input(
                        "elija la opcion del paquete que desea: 3000, 5000 o 10000: ")))
                    total = self.recarga - eleccion
                    totalMinutos = (total / 110) * 2
                    print("su paquete es de ", eleccion)
                    print("sus minutos son ", totalMinutos)

        elif self.operador == "tigo":
            if self.recarga == 5000:
                if self.pom == "minutos":
                    print("ud ha recargado ", self.recarga / 102, " minutos")
                elif self.pom == "paquete":
                    costoP = int(input(
                        "elija la opcion del paquete que desea: \n 3000 \n 5000 \n  10000 \n "))
                    if costoP == 1:
                        print("Su paquete es de: ", costoP)
                    elif costoP == 2:
                        print("Su paquete es de: ", costoP)
                    elif costoP == 3:
                        print("Su paquete es de: ", costoP)
                elif "paqueteyminutos":
                    eleccion = int((input(
                        "elija la opcion del paquete que desea: 3000, 5000 o 10000: ")))
                    total = self.recarga - eleccion
                    totalMinutos = total / 102
                    print("su paquete es de ", eleccion)
                    print("sus minutos son ", totalMinutos)
            if self.recarga == 10000:
                if self.pom == "minutos":
                    print("ud ha recargado ", self.recarga / 102, " minutos")
                elif self.pom == "paquete":
                    costoP = int(input(
                        "elija la opcion del paquete que desea: \n 3000 \n 5000 \n  10000 \n "))
                    if costoP == 1:
                        print("Su paquete es de: ", costoP)
                    elif costoP == 2:
                        print("Su paquete es de: ", costoP)
                    elif costoP == 3:
                        print("Su paquete es de: ", costoP)
                elif "paqueteyminutos":
                    eleccion = int((input(
                        "elija la opcion del paquete que desea: 3000, 5000 o 10000: ")))
                    total = self.recarga - eleccion
                    totalMinutos = total / 102
                    print("su paquete es de ", eleccion)
                    print("sus minutos son ", totalMinutos)
            if self.recarga == 20000:
                if self.pom == "minutos":
                    print("ud ha recargado ", self.recarga / 102 * 2, " minutos")
                elif self.pom == "paquete":
                    costoP = int(input(
                        "elija la opcion del paquete que desea: \n 3000 \n 5000 \n  10000 \n "))
                    if costoP == 1:
                        print("Su paquete es de: ", costoP)
                    elif costoP == 2:
                        print("Su paquete es de: ", costoP)
                    elif costoP == 3:
                        print("Su paquete es de: ", costoP)
                elif "paqueteyminutos":
                    eleccion = int((input(
                        "elija la opcion del paquete que desea: 3000, 5000 o 10000: ")))
                    total = self.recarga - eleccion
                    totalMinutos = (total / 102) * 2
                    print("su paquete es de ", eleccion)
                    print("sus minutos son ", totalMinutos)
            if self.recarga == 50000:
                if self.pom == "minutos":
                    print("ud ha recargado ", self.recarga / 102 * 2, " minutos")
                elif self.pom == "paquete":
                    costoP = int(input(
                        "elija la opcion del paquete que desea: \n 3000 \n 5000 \n  10000 \n "))
                    if costoP == 1:
                        print("Su paquete es de: ", costoP)
                    elif costoP == 2:
                        print("Su paquete es de: ", costoP)
                    elif costoP == 3:
                        print("Su paquete es de: ", costoP)
                elif "paqueteyminutos":
                    eleccion = int((input(
                        "elija la opcion del paquete que desea: 3000, 5000 o 10000: ")))
                    total = self.recarga - eleccion
                    totalMinutos = (total / 102) * 2
                    print("su paquete es de ", eleccion)
                    print("sus minutos son ", totalMinutos)

        elif self.operador == "virgin":
            if self.recarga == 5000:
                if self.pom == "minutos":
                    print("ud ha recargado ", self.recarga / 90, " minutos")
                elif self.pom == "paquete":
                    costoP = int(input(
                        "elija la opcion del paquete que desea: \n 3000 \n 5000 \n  10000 \n "))
                    if costoP == 1:
                        print("Su paquete es de: ", costoP)
                    elif costoP == 2:
                        print("Su paquete es de: ", costoP)
                    elif costoP == 3:
                        print("Su paquete es de: ", costoP)
                elif "paqueteyminutos":
                    eleccion = int((input(
                        "elija la opcion del paquete que desea: 3000, 5000 o 10000: ")))
                    total = self.recarga - eleccion
                    totalMinutos = total / 90
                    print("su paquete es de ", eleccion)
                    print("sus minutos son ", totalMinutos)
            if self.recarga == 10000:
                if self.pom == "minutos":
                    print("ud ha recargado ", self.recarga / 90, " minutos")
                elif self.pom == "paquete":
                    costoP = int(input(
                        "elija la opcion del paquete que desea: \n 3000 \n 5000 \n  10000 \n "))
                    if costoP == 1:
                        print("Su paquete es de: ", costoP)
                    elif costoP == 2:
                        print("Su paquete es de: ", costoP)
                    elif costoP == 3:
                        print("Su paquete es de: ", costoP)
                elif "paqueteyminutos":
                    eleccion = int((input(
                        "elija la opcion del paquete que desea: 3000, 5000 o 10000: ")))
                    total = self.recarga - eleccion
                    totalMinutos = total / 90
                    print("su paquete es de ", eleccion)
                    print("sus minutos son ", totalMinutos)
            if self.recarga == 20000:
                if self.pom == "minutos":
                    print("ud ha recargado ", self.recarga / 90 * 2, " minutos")
                elif self.pom == "paquete":
                    costoP = int(input(
                        "elija la opcion del paquete que desea: \n 3000 \n 5000 \n  10000 \n "))
                    if costoP == 1:
                        print("Su paquete es de: ", costoP)
                    elif costoP == 2:
                        print("Su paquete es de: ", costoP)
                    elif costoP == 3:
                        print("Su paquete es de: ", costoP)
                elif "paqueteyminutos":
                    eleccion = int((input(
                        "elija la opcion del paquete que desea: 3000, 5000 o 10000: ")))
                    total = self.recarga - eleccion
                    totalMinutos = (total / 90) * 2
                    print("su paquete es de ", eleccion)
                    print("sus minutos son ", totalMinutos)
            if self.recarga == 50000:
                if self.pom == "minutos":
                    print("ud ha recargado ", self.recarga / 90 * 2, " minutos")
                elif self.pom == "paquete":
                    costoP = int(input(
                        "elija la opcion del paquete que desea: \n 3000 \n 5000 \n  10000 \n "))
                    if costoP == 1:
                        print("Su paquete es de: ", costoP)
                    elif costoP == 2:
                        print("Su paquete es de: ", costoP)
                    elif costoP == 3:
                        print("Su paquete es de: ", costoP)
                elif "paqueteyminutos":
                    eleccion = int((input(
                        "elija la opcion del paquete que desea: 3000, 5000 o 10000: ")))
                    total = self.recarga - eleccion
                    totalMinutos = (total / 90) * 2
                    print("su paquete es de ", eleccion)
                    print("sus minutos son ", totalMinutos)


recarga1 = telefonia(input("ingrese su operador: "), int(input(
    "ingrese el monto de la recarga: ")), input("ingrese si desea minutos, paquete o paqueteyminutos: "))
#recarga1 = telefonia("claro", 5000, "minutos")
print(recarga1.calcular())
