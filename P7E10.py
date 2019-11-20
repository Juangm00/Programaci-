a = input("Introduce una palabra o número para saber si son palíndroma o capicúa respectivamente: ")

def isCapicua(a):
    a = str(a)
    a = list(a)
    if a == a[::-1]:
        return True
    else:
        return False


capicua = isCapicua(a)
if capicua:
    print("%s es capicua o palindroma"%(a))
else:
    print("%s no es capicua o palindroma"%(a))
