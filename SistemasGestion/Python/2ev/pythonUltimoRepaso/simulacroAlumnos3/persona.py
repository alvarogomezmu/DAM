#_*_coding:utf-8_*_

'''
dameTitulo(): devuelve el título del cuento 

dameAutor(): devuelve el autor del cuento
'''

class Perro() :
	def __init__(self, raza, peso, nacionalidad) :
		self.raza = raza
		self.peso = peso
		self.nacionalidad = nacionalidad

	def mostrar(self) :
		print self.raza, self.peso, self.nacionalidad

	def mostrar_peso(self) :
		return self.peso
