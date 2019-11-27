# Desarrolla un programa utilizando la metodología “pair programming”, que nos sirva para gestionar nuestros contactos (la información a gestionar será el teléfono, nombre, apellido1, apellido2 y correo electrónico. El programa tendrá un menú, con las siguientes opciones: añadir contacto, consultar contacto a partir de la clave, consultar todos los contactos y eliminar contacto. Aprovecha lo que has aprendido hasta el momento (diccionarios, funciones, procedimientos…).

contacts = []

menuOptions = {
    1: "listContacts",
    2: "addContact",
    3: "removeContact",
    4: "showContact"
}

def showMenu():
    print("1. Mostrar lista de contactos")
    print("2. Agregar contacto")
    print("3. Eliminar contacto por ID")
    print("4. Mostrar contacto por ID")
    option = input("Elige una opción => ")
    optMenu(option)

def listContacts():
    global contacts
    for i, c in enumerate(contacts):
        print("")
        print("ID: " + str(i))
        print("Nombre: " + c['name'])
        print("Apellido: " + c['apellido'])
        print("Segundo Apellido: " + c['apellido2'])
        print("Email: " + c['email'])
        print("")

def addContact(t, n, a1, a2, e):
    global contacts
    contact = {'phone': t, 'name': n, 'apellido': a1, 'apellido2': a2, 'email': e}
    contacts.append(contact)
    return(contact)

def removeContact(i):
    global contacts
    del contacts[i]

def showContact(i):
    global contacts
    c = contacts[int(i)]
    print("")
    print("ID: " + str(i))
    print("Nombre: " + c['name'])
    print("Apellido: " + c['apellido'])
    print("Segundo Apellido: " + c['apellido2'])
    print("Email: " + c['email'])
    print("")
def optMenu(o):
    if o == "1":
        listContacts()
        showMenu()
    elif o == "2":
        phone = input("Dime el número de teléfono => ")
        name = input("Dime el nombre => ")
        a1 = input("Dime el primer apellido => ")
        a2 = input("Dime el segundo apellido => ")
        email = input("Dime el email => ")
        addContact(phone, name, a1, a2, email)
        print("AGREGADO CORRECTAMENTE")
        showMenu()
    elif o == "3":
        id = input("Dime el ID => ")
        removeContact(int(id))
        print("ELIMINADO CORRECTAMENTE")
        showMenu()
    elif o == "4":
        id = input("Dime el ID => ")
        showContact(id)
        showMenu()
    else:
        print("¡Opción no válida!")
        showMenu()

showMenu()