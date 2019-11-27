# Aprovechando el potencial de los diccionarios, escribe un programa que llame a un procedimiento, que recibe como parámetro la fecha en números y devuelve la fecha  con el nombre del mes. Comentario: no es necesario validar si la es correcta, damos por hecho que lo será.

meses = {
    1: "Enero",
    2: "Febrero",
    3: "Marzo",
    4: "Abril",
    5: "Mayo",
    6: "Junio",
    7: "Julio",
    8: "Agosto",
    9: "Septiembre",
    10: "Octubre",
    11: "Noviembre",
    12: "Diciembre"
}

def fechaBeautifier(n):
    fechaSplit = n.split("/")
    dia = fechaSplit[0]
    mes = fechaSplit[1]
    year = fechaSplit[2]
    if str(mes[0]) == "0":
        mes = mes.replace("0", "")

    print("{0} de {1} de {2}".format(dia, meses[int(mes)], year))
    
fecha = input("Introduce una fecha en formato dd/mm/aaaa: ")
fechaBeautifier(fecha)