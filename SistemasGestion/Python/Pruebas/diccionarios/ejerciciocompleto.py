#_*_coding:utf-8_*_

import operator

# Declaramos los dos diccionarios
comidas = {'Primero':'','Segundo':'','Postre':''}
mesas = {'Precio':0}

# Pedimos al usuario que introduzca valores a cada clave
comidas['Primero'] = raw_input('Introduce un primer plato: ')
comidas['Segundo'] = raw_input('Introduce un segundo plato: ')
comidas['Postre'] = raw_input('Introduce un postre: ')

# Creamos una lista y pedimos al usuario que introduzca precios para los platos
precio = []
precio.append(raw_input('Introdce un precio para el primer plato: '))
precio.append(raw_input('Introdce un precio para el segundo plato: '))
precio.append(raw_input('Introdce un precio para el postre: '))

# Anadimos la lista al diccionario mesas
mesas['Precio'] = precio

# Ordenamos las claves de comidas
print sorted(comidas.items(), key=operator.itemgetter(0))
# Ordenamos los valores de comidas
print sorted(comidas.items(), key=operator.itemgetter(1))
# Ordenamos los precios
mesas['Precio'].sort()

# Creamos un diccionaro que incluye a los otros dos
comimesa = dict()

comimesa['Comidas'] = comidas
comimesa['Mesas'] = mesas

# Mostramos el precio de las mesas
print comimesa['Mesas']['Precio']

# Mostramos el postre
print comimesa['Comidas']['Postre']
