frase = str(input("Escribe algo:"))
def contarPalabras(frase):
    palabras = frase.split(" ")
    cont = len(palabras)
    return cont

cuenta = contarPalabras(frase)
print("El número de palabras es:",cuenta)
