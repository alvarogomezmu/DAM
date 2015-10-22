#_*_coding:utf-8_*_

'''
Pedirle una palabra al usuario e indicar si es un palíndromo.
'''
cadena = raw_input("Introduzca una palabra para averiguar si es un palindromo:\n")

if cadena == cadena[::-1]:
    print("Enhorabuena. La palabra que ha introducido es un palindromo")
else:
    print("No es un palindromo")
