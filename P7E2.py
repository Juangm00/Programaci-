nombre= str(input("Introduce tu nombre: "))
apellido1= str(input("Introduce tu apellido: "))
apellido2= str(input("Introduce tu segundo apellido: "))
def nombreCompleto(a,b,c):
    nombrecomp= a+" "+b+" "+c
    print(nombrecomp)
    return nombrecomp
nombreCompleto(nombre,apellido1,apellido2)
