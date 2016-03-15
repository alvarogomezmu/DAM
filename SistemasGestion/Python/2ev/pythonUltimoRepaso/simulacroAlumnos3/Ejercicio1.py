'''
Definir una lista con un conjunto de nombres

Guardar dicha lista en un fichero.

Leer el fichero y mostrar la  cantidad que comienzan con la letra a

'''
#_*_coding:utf-8_*_

import os 

def existe_fichero(f):
	if os.path.isfile(f):
		return True
	else:
		return False

def guardar_lista(f,l):
	if existe_fichero(f):
		print 'El fichero ya existe'
	else:
		with open(f,'w') as fw:
			for i in l:
				fw.write(i + '\n')
		leer_fichero(f)
		
def leer_fichero(f):
	with open(f,'r') as fr:
		cant=0
		for i in lista:
			if i[0]=='A':
				cant=cant+1
		print lista
		print '\nCantidad de nombres que comienzan con a es:', cant

	

			
# main
lista = ['Jesus','Ruben','Marta','Javier','Ana']

fich = 'Ejercicio1.txt'

guardar_lista(fich,lista)
