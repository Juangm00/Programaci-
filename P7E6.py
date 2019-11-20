nombre= str(input("Introduzca su nombre: "))
letra= str(input("Introduzca una letra para ver si está en el nombre: "))

def encontrarLetra(nombre,letra):
    if letra in nombre:
        return True
    else:
        return False
resultado = encontrarLetra(nombre,letra)
if resultado:
    print("La letra está en el nombre ^^ ")
else:
    print("La letra no está en el nombre T.T ")
