#_*_coding:utf-8_*_

# Ejercicio 4

# #_*_coding:utf-8_*_

# Ejercicio 2

# Vamos a realizar un ejercicio con listas, pero en este caso debemos aplicar lo explicado en clase para que el método que usemos sea mediante RECURSIVIDAD.
# Aplicar: vamos a pasar a dicha función los siguientes parámetros: una función que quepa en una lista y deberá aplicar esa función sobre dicha lista.

# Un ejemplo seria:
# Aplicar (lambda x: x+1, [1,2,3]) y nos devolverá 2,3,4. La función puede ser cualquiera

#Nota: recordad hacer el tratamiento de la posición 0 de la lista y luego del resto de la lista  [1:]


# Aplicamos la funcion pasada al valor de la lista pasado
def aplicar(fun,n) :
	a = fun(n)   
	return a
	
# Metodo que trata cada valor de la lista
def tratamiento(l,num) :
	# Si la posicion de la lista es nulo, devolvemos la lista
	if num == (len(l)) :
		print l
	# Si el valor de la posicion es distinta a la siguiente, llamamos al metodo aplicar con una funcion
	else :
		l[num] = aplicar(lambda x : x + 1, l[num])
		num += 1
		tratamiento(l,num)
		
# main

# Lanzamos la funcion pricipal con una lista
tratamiento([1,2,3],0)
