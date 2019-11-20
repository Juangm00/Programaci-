frase= str(input("Introduzca una frase:"))
def comprimirFrase(frase):
    for i in frase:
        if i==" ":
           fraseFinal = frase.replace(" ","")
    return fraseFinal
print(comprimirFrase(frase))
