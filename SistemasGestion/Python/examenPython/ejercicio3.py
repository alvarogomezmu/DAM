#_*_coding:utf-8_*_

# Ejercicio 3

# Vamos a crear dos funciones, una de ellas llamada mostrar_inicial y la otra mostrar_final.
# Deberemos usar funciones de alto orden y de primer orden. Si no se hace uso de ellas, el ejercicio valdrá la mitad.

	# 1) mostrar_inicial: recibirá por parámetro una lista y deberá mostrar las iniciales de las palabras que contengan dicha lista.
	# 2) mostrar_final: recibirá por parámetro la misma lista pero ahora deberá mostrar la letra con la que terminan las palabras de dicha lista.
	
# Dichas funciones las debemos usar para que al final nuestro ejercicio nos muestre los datos de la siguiente manera::
	# La lista inicial es Nombres=['Ariel','Marcos','Ana','Luis','Pedro','Andrés']
	# Manera 1: [['a','m','a','l','p','a'],['l','s','o','s']]
	# Manera 2: ['a','l']
	#			['m','s']
	#			['a','a']...
	
	
# Método para mostrar inicial
def mostrar_inicial(l):
	# Declaramos la lista de las letras iniciales
	listaInicial = list()
	# Bucle para recorrer cada posición de la lista
	for i in range(len(l)):
		# Bucle para recorrer cada letra de la palabra de cada posición de la lista
		for j in lista[i]:
			# Guardamos la letra en la lista
			listaInicial.append(j)
			# Acabamos el bucle for ya que solo queremos la primera letra
			break
	return listaInicial

# Método para mostrar la letra final
def mostrar_final(l):
	listaFinal = list()
	# Bucle para recorrer cada posición de la lista
	for i in range(len(l)):
		letra = str()
		# Bucle para recorrer cada letra de la palabra de cada posición de la lista
		for j in lista[i]:
			# Guardamos cada letra en la variable
			letra = j
		#Acabamos y tendremos la última letra en la variable, la añadimos a la lista
		listaFinal.append(letra)
	return listaFinal

# Método para mostrar ambas letras
def mostrar_ambas(l):
	# Bucle para recorrer para posición de la lista
	for i in range(len(l)):
		li=list()
		# Añadimos la primera letra
		li.append(lista[i][0:1:])
		# Añadimos la ultima letra
		li.append(lista[i][-1::])
		print li


#main

# Declaramos la lista 
lista = ["Pepe","Pedro","Paco","Luis","Juan","Andres"]

# Declaramos la lista donde se guardaran la primera y ultima letra
lista2 = list()

# Anadimos la primera letra de cada nombre
lista2.append(mostrar_inicial(lista))

# Anadimos la ultima letra de cada nombre
lista2.append(mostrar_final(lista))

# Mostramos la lista
print lista2

# Salto de linea para separar
print "\n"

# Hacemos el otro modo
mostrar_ambas(lista)

