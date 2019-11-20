palabra1= str(input("Introduzca una palabra: "))
palabra2= str(input("Introduzca otra palabra: "))
def rimaPalabras(a,b):
    if a[-3:]== b[-3:]:
        print("Las palabras ",a," y ",b," riman.")
    elif a[-2:]==b[-2:]:
        print("Las palabras ",a," y ",b," riman poco.")
    else:
        print("Las palabras no riman.")
rimaPalabras(palabra1,palabra2)