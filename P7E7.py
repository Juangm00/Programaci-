frase= str(input("Introduzca una frase: "))

def contarVocales(frase):
    contadorA = frase.count("a")
    contadorE = frase.count("e")
    contadorI = frase.count("i")
    contadorO = frase.count("o")
    contadorU = frase.count("u") 
    
    print("El número de A es:",contadorA,",el número de E es:",contadorE,",el número de I es:",contadorI,",el número de O es:",contadorO,",el número de U es:",contadorU)
contarVocales(frase)
