#_*_coding:utf-8_*_
from datetime import datetime
from datetime import date
import time

print "Fecha y hora: " + str(datetime.now())
print "Fecha y hora en ISO: " + str(datetime.now().isoformat())

year=date.today().year
mes=5
dia=23

print "Año: " + str(year)
print "Mes: " + str(mes)
print "Dia: " + str(dia)

print "Formato dd/mm/yyyy = " + time.strftime("%d/%m/%y")

hora=time.strftime("%H")
minuto=time.strftime("%M")
segundo=time.strftime("%S")

print "Hora: " + str(hora)
print "Minutos: " + str(minuto)
print "Segundos: " + str(segundo)

print "Formato hh:mm:ss = " + str(time.strftime("%H:%M:%S"))

