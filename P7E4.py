frase= str(input("Introduzca una frase: "))
def sustituirEspacios(frase):
    fraseFinal = frase.replace(" ", "*")
    return fraseFinal
    

print(sustituirEspacios(frase))