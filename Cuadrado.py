'''
@author: Alberto Miguel Martinez Jimenez
'''
from Rectangulo import Rectangulo

class Cuadrado(Rectangulo):
    def __init__(self,lado):
        super().__init__(lado,lado)
      
if __name__ == "__main__":
    C=Cuadrado(5)
    C.pintarRectangulo()
  
