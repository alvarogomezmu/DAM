#_*_coding:utf-8_*_

#Ejercicio 6 de la Hoja Python 4-7
'''
Escriba un programa que cree un diccionario asociando a cada palabra su cantidad de letras:

Solución:

'el gato y el pato son amigos'

{'el': 2, 'son': 3, 'gato': 4, 'y': 1, 'amigos': 6, 'pato': 4}
'''
# Creamos cadena de caracteres de tipo String
cadena = "el gato y el pato son amigos"
# Troceamos el string y lo convertimos en lista
lista = cadena.split()
# Creamos el diccionario
diccionario = dict()

for i,c in enumerate(lista) :
	# Incluimos en el diccionario cada palabra del string
	diccionario[c] = 0

	# Contamos el numero de letras
	for j,d in enumerate(c) :
		num = diccionario.get(c)
		num += 1
		diccionario[c] = num

# Imprimimos el resultado
for a,b in enumerate(diccionario) :
	print b,diccionario[b]
