#_*_coding:utf-8_*_

'''
Pedirle al usuario una contraseña y compararla con una cadena hardcodeada en el código

("secreta"). Si es correcta, mostrar "Bien!" y salir; si es incorrecta, volverla a pedir, pero sólo tres

intentos, a la tercer falla mostrar "Incorrecto" y salir
'''


secreta = "Parrales"

for i in range(3):
    clave = raw_input("Ingrese la clave, por favor: ")
    if clave == secreta:
        print("Todo bien, todo correcto")
        break
    else:
		print("Incorrecto")

