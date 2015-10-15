#_*_coding:utf-8_*_

#Ejercicio 5 de la Hoja Python 4-7
'''
Escriba un programa que cree un diccionario asociando a cada letra la cantidad de veces que aparece en la oración: 

Un ejemplo:

Solución:

'el elefante avanza hacia asia' 

nota: esta todo escrito en minúscula para facilitar el trabajo

{'a': 8, 'c': 1, 'e': 4, 'f': 1, 'h': 1, 'i': 2, 'l': 2, 'n': 2, 's': 1, 't': 1, 'v': 1, 'z': 1}
'''

# Creamos cadena de caracteres de tipo String
cadena = "el elefante avanza hacia asia"
# Creamos el diccionario
diccionario = dict()

# Iteramos el string
for i,c in enumerate(cadena) :
	# Hacemos una condicion para ignorar los espacios en blanco
	if (c != " ") :
		# Otro para que, si la letra ya esta incluida, incrementamos el valor
		if diccionario.has_key(c):
			num = diccionario.get(c)
			diccionario[c] = (num + 1)
		# Y sino, la incluimos
		else :
			diccionario[c] = 1
			
# Mostrar claves y valores
for i,v in enumerate(diccionario) :
	print (v,diccionario[v]) ,
