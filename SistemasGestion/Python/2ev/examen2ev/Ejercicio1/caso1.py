'''
Ejercicio 1 (3 PUNTOS) USO DE MODULOS:
    CASO 1: Crearos un fichero con nombre exa.txt dentro de un directorio llamado direxa (1 PUNTO)
        1. Conocer el directorio donde estamos trabajando (Debemos ver por pantalla el path de direxa (0,25 puntos)
        2. Recorre el directorio direxa y todos sus elementos (0,25 puntos)
        3. Cambiar los permisos del fichero exa.txt para que pueda leer el propietario (0,25 puntos)
        4. Eliminar el fichero (0,25 puntos)
'''

#_*_coding:utf-8_*_

import os

def comprobar() :
	if os.path.isdir('./direxa') :
		if os.path.isfile('direxa/era.txt') :
			print "Existen el directorio y el fichero"
			return True
		else :
			print "Existe el directorio pero no el fichero"
			return False
	else :
		print "No existe el fichero ni el directorio"
		return False

if comprobar() == False :
	os.system('rm -rf direxa')
	# Crear directorio
	os.system('mkdir direxa')
	# Crear fichero
	os.system('touch direxa/era.txt')
	print "\nContenido de direxa"
	os.system('ls direxa')

# Mostrar directorio de direxa
print "\nPath de direxa"
print os.getcwd()

# Recorrer directorio y elementos de direxa
print "\nRecorrer directorio"
os.system('ls -a direxa')

# Cambiar permisos de fichero para que solo pueda leer el propietario
print "\nCambio de permisos"
os.system('chmod 400 direxa/era.txt')
os.system('ls -l direxa')

# Borrar fichero
os.remove('direxa/era.txt')
print "\nContenido final de direxa"
os.system('ls -a direxa')
