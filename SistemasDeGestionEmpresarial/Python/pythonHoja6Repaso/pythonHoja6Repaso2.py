#_*_coding:utf-8_*_

'''
Diseñar un programa que pida una cadena por teclado e informe por pantalla del número de blancos

que tiene dicha cadena.
'''

from collections import Counter

cadena = raw_input ("Introduzca una cadena para visualizar el numero de blancos que hay en ella:\n")
print ("El numero de espacios en blanco: " +str(cadena.count(" ")))


