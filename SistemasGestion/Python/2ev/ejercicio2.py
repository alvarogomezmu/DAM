# Suponemos que existe un archivo llamado menu.txt que contiene una lista de comidas. El orden en el que se ha guardado la información es “entrante”, “primero” y “postre”, así sucesivamente. Lo que queremos hacer es un pequeño menú que lea todos los entrantes de los que dispone nuestro menú.txt, y que muestre el último postre introducido.


#_*_coding_utf-8_*_

import os

def comprobarFichero(f) :
	if (f, os.W_OK) :
		print 'Fichero OK, Escritura OK'
	elif (f, os.R_OK) :
		print 'Fichero OK, Lectura OK'
	else :
		print 'Fichero no OK'

def pedirDirectorio() :
	opcion = raw_input("Introduce nombre del archivo: ")
	return opcion

# main

archivo = open (pedirDirectorio(), "r")

comprobarFichero(archivo)
