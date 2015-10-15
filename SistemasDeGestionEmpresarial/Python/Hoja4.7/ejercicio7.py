#_*_coding:utf-8_*_

#Ejercicio 7 de la Hoja Python 4-7
'''
Realiza un programa que nos de información sobre el Rally Dakar 

Deberá existir las siguientes variables diccionario:
• dorsal_moto-nombre
• dorsal_moto-nacionalidad
• dorsal_moto-marca
• dorsal_moto-posicion_clasificación_general 
(cuando un piloto abandona su posición será 0)
• dorsal_coche-nombre_piloto
• dorsal_coche-nombre_copiloto
• dorsal_coche-nacionalidad_piloto
• dorsal_coche-nacionalidad_copiloto
• dorsal_coche-marca
• dorsal_coche-posicion_clasificación_general

El programa presentará un menú donde aparecerán todas las posibilidades de consulta para todos la
información que guardamos, todas las posibilidades de añadir nuevas entradas a nuestro diccionario,
poder variar la clasificación general de un vehículo, poder realizar abandonos de vehículos
existentes y la opción de Salir.

Inicialmente las variables diccionario contendrán al menos 5 palabras cada una. 
Durante la ejecución del programa se deben añadir al menos una entrada de cada tipo.
Cuando el usuario elija Salir se deben imprimir por pantalla todas las variables diccionario.
'''
import os

dorsal_moto_nombre = {0:"Paco Bisonte",1:"Carlos Alcazar"}
dorsal_moto_nacionalidad = {0:"Alemana",1:"Japonesa"}
dorsal_moto_marca = {0:"Bmw",1:"Kawasaki"}
dorsal_moto_posicion_clasificacion_general = {0:5,1:2}
dorsal_coche_nombre_piloto = {0:"Chanta Klaus",1:"Sandro Rey"}
dorsal_coche_nombre_copiloto = {0:"Luis Lillo",1:"Douglas Mcdonald"}
dorsal_coche_nacionalidad_piloto = {0:"Suecia",1:"Espagnol"}
dorsal_coche_nacionalidad_copiloto = {0:"Venezuela",1:"Ruso"}
dorsal_coche_marca = {0:"Audi",1:"Lotus"}
dorsal_coche_posicion_clasificacion_general = {0:4,1:7}

operacion = 0
clear = lambda: os.system('cls')

while operacion != 288 :
	print '''Bienvenidoal menu del Rally Dakar
	
Selecciona una opcion:
1. Motos
2. Coches
288. Salir
'''
	operacion = int(raw_input("Tu opcion: "))
	
	if operacion == 1 :
		
		print '''Bienvenido al menu de motos del Rally Dakar
Selecciona una opcion:
1. Mostrar
2. Anadir
3. Modificar
5. Atras
'''

		operacion = int(raw_input("Tu opcion: "))
	
		if operacion == 1:
			print '''Bienvenido al menu de motos del Rally Dakar
		
1. Consultar todos los datos de motos
2. Consultar nombres y nacionalidades (motos)
3. Consultar marcas de motos
4. Consultar clasificaciones de motos
16. Atras
'''


			operacion = int(raw_input("Tu opcion: "))

			if operacion == 1 :
			elif operacion == 2 :
			elif operacion == 3 :
	
	

	
	elif operacion == 2 :
		print '''Bienvenido al menu de coches del Rally Dakar
		
5. Consultar todos los datos de coches
6. Consultar nombres y nacionalidades (coches)
7. Consultar marcas de coches
8. Consultar clasificaciones de coches
24. Atras'''
