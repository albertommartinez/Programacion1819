'''

@author: Alberto Miguel Martinez Jimenez
'''
from symbol import except_clause

class Rectangulo():
  def __init__(self,ancho,alto):
    try:
      self.ancho=ancho
      self.alto=alto
    except ArithmeticError as Error:  
      print("Valores fuera de rango")
      
  def pintarRectangulo(self):
    i=0
    
    while i<self.alto :
      j=0
      while j<self.ancho :
        print("#")
        j=j+1
      i=i+1 
  @property
  def ancho(self):
    return self.__ancho
  
  @ancho.setter
  def ancho(self,ancho):
    if(ancho>0)or(ancho<10):
      self.ancho=ancho
          
  @property
  def alto(self):
    return self.__alto
  
  @ancho.setter
  def ancho(self,alto):
    self.alto=alto
    
if __name__ == "__main__":
  r=Rectangulo(8,4)
  r.pintarRectangulo()