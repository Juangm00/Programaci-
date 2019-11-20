frase= str(input("Introduzca una frase: "))
vocal= str(input("Introduzca una vocal: "))
def cambiarVocal(frase,vocal):
    fraseFinal=frase
    for i in frase:
        if i=="a" or i=="e" or i=="i" or i=="o" or i=="u":
            fraseFinal= fraseFinal.replace(i,vocal)
    return fraseFinal
print(cambiarVocal(frase,vocal))
