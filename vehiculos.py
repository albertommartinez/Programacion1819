'''
Crea la clase Vehiculo, asi como las clases Bicicleta y Coche 
como subclases de la primera. 
Para la clase Vehiculo, crea los atributos de clase vehiculosCreados y
kilometrosTotales, asi como el atributo de instancia kilometrosRecorridos. 
Crea tambien algun metodo especifico para cada una de las subclases. 
Prueba las clases creadas mediante un programa con un menu 

@author: Alberto Miguel Martinez Jimenez
@version: 1.0
'''
class vehiculo():
  vehiculosCreados=0
  kilometrosTotales=0
  
def __init__(self):
    __kilometrosRecorridos=0

def andar(self,distancia):
    self.__kilometrosRecorridos+=distancia

def __str__(self):

@property
def kilometrosRecorridos(self):
    return self.__kilometrosRecorridos