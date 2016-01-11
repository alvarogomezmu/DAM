#_*_coding:utf-8_*_
'''
 Ejercicio 2

Se desea realizar una colección asociando nombres de módulos y notas obtetidas. El programa presentará un menú con cuatro posiciones:
	 1- Mostrar colección
	 2- Mostrar módulo con la mejor nota
	 3- Insertar un nuevo módulo y nota
	 4- Salir

Para ello se ha decidido implementar los métodos necesarios para la funcionalidad del problema.

Existirán los siguientes metodos:



 1) Crear el método pertinente para que se cree la colección pertinente de MODNOTA y dentro de él se guarden los datos siguientes que pediremos por teclado

	 MODULO   -->   NOTAS
	 AD	   -->	 6
	 DI       -->	 5.7
	 SGE      -->	 9
	
 2) Para mostrar la colección creamos un segundo método donde nos deberá mostrar la colección que le pasaremos por parámetro. El método se llamará visualizar_cal

 3) Este método nos debe mostrar de la colección el Módulo que tiene una nota mayor.
	# El módulo que más nota tiene es: ****
	
 4) insertar. Este método pedirá un nuevo módulo y nueva nota y lo deberá insertar en la colección en la posición donde le toque. Es decir, si ponemos por ejemplo ISO -> 4.3 deberá terminar insertada entre DI y SGE
'''


# Colección donde se guardaran los modulos y su nota correspondiente
modnota=dict()

# Método para inservar los valores iniciales a la coleccion
def insertar_valores(n):
	for i in range(n):
		# Se piden los valores y se añaden a la colección
		modulo = raw_input("Introduce el nombre del modulo: ")
		nota = raw_input("Introduce la nota del modulo: ")
		modnota[modulo] = nota
		
# Método para guardar el menú
def mostrar_menu() :
	print '''\nElige una opcion:
1- Mostrar coleccion
2- Mostrar modulo con la mejor nota
3- Insertar un nuevo modulo y nota
4- Salir'''

# Metodo para filtrar el resultado de la opcion elegida por el usuario
def seleccionar_opcion(n) :
	if n == 1 : # Metodo para visualizar la coleccion
		visualizar_col(modnota)
	elif n == 2 : # Metodo para mostrar el modulo con mejor nota
		visualizar_mayornota(modnota)
	elif n == 3 : # Metodo para insertar nuevo modulo y nota
		insertar_valores(1)
	elif n == 4 : # Salir
		print "Hasta la proxima"
	else : # Opcion no valida
		print "Opcion no valida, vuelve a intentarlo."

# Metodo para visualizar la coleccion
def visualizar_col(col) :
	# Se recorren los items de la coleccion y se muestran
	for clave,valor in col.items() :
		print "Modulo: " + clave + ", Nota: " + str(valor)

# Metodo para mostrar el modulo con mayor nota
def visualizar_mayornota(col) :
	# Inicializamos las variables donde se guardara el mayor
	clavemayor = str()
	valormayor = 0
	# Recorremos los items de la coleccion
	for clave,valor in col.items() :
		# Si el mayor que el almacenado inicialmente, lo sobreescribimos
		if valor > valormayor :
			valormayor = valor
			clavemayor = clave
	# Se muestra el resultado
	print "El modulo con mayor nota es " + clavemayor + ", con nota " + str(valormayor)

# main

# Pedimos al usuario que introduzca los valores iniciales
insertar_valores(3)

# Variable para seleccionar las opciones del menu
opcion = 0

# Bucle para no salir del menu a no ser que lo especifique el usuario
while opcion != 4 :
	# Se muestra el menu
	mostrar_menu()
	# Se pide al usuario que seleccione una opcion
	opcion = int(raw_input("Tu opcion: "))
	# Se ejecuta la accion correcta dependiendo de la opcion
	seleccionar_opcion(opcion)
	# Salto de linea para separar cada peticion
	print "\n"
