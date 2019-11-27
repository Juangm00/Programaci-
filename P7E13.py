# Práctica 7 - Ejercicio 13
# Escribe un programa que le pida al usuario si quiere calcular si un número es primo con for o con while, por tanto, habrán dos funciones que se caracterizan por hacer ese mismo cálculo de una manera (con for y sin breaks), o de otra (con while). Ambas funciones devolverá true (si es es primo) o false (si no es primo). El programa principal informará del resultado. Además, como mejora puedes calcular el tiempo que tarda en encontrar la solución de una manera u otra. Comentario: aprovecha el código que tienes ya creado

from datetime import datetime
import sys

start = 0

def primoWhile(x):
    global start
    start = datetime.now()

    if x==2:
        return True
    if x%2==0:
        return False
    i=3
    while i**2<=x:
        if x%i==0:
            return False
        i=i+2
    return True


def primoFor(n):
    global start
    start = datetime.now()
    
    cont = 0
    if n < 2: 
        return False
    else:
        for i in range(1, n+1):
            if n % i == 0:
                cont += 1

        if cont == 2:
            return True
        else:
            return False

numero = input("Dime un número: ")
try:
    numero = int(numero)
except ValueError:
    sys.exit("¡Número no válido!")

print("¿De qué manera quieres saber si es primo?")
print("1. while")
print("2. for")
seleccion = input("=> ")

if seleccion == "2":
    if primoFor(numero):
        print("Es primo")
    else:
        print("No es primo")
elif seleccion == "1":
    if primoWhile(numero):
        print("Es primo")
    else:
        print("No es primo")
else:
    print("No se detecta la opción")

print("El programa ha tardado {0}".format(datetime.now()-start))