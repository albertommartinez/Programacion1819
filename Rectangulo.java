package rectangulo;

class Rectangulo {
  private int ancho;
  private int alto;
  
  Rectangulo(int ancho,int alto) {
    setAncho(ancho);
    setAlto(alto);
  }

  public int getAncho() {
    return ancho;
  }
/**
 * establece el ancho del rectangulo
 * @param ancho int
 * @throws ArithmeticException
 */
  public void setAncho(int ancho) throws ArithmeticException {
    if((ancho<=0)||(ancho>10)) {
      throw new ArithmeticException();
    }else {
      this.ancho = ancho;
    }
  }
/**
 * devuelve el alto del rectangulo
 * @return alto int
 */
  public int getAlto() {
    return alto;
  }
/**
 * establece el alto del rectangulo
 * @param alto int
 * @throws ArithmeticException
 */
  public void setAlto(int alto)throws ArithmeticException {
    if((alto<=0)||(alto>10)) {
      throw new ArithmeticException();
    }else {
      this.alto = alto;
    }
  }
/**
 * Dibuja con # el rectangulo  
 */
  public void pintarRectangulo() {
    for(int i=0;i<this.getAlto();i++) {
      for(int j=0;j<this.getAncho();j++) {
        System.out.print("#");
      }
      System.out.print("\n");
    }
  }

  @Override
  public String toString() {
    return "Rectangulo [ancho=" + getAncho() + ", alto=" + getAlto() + "\n" + pintarRectangulo()"]";
  }
  
  
}
