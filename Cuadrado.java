package rectangulo;

class Cuadrado extends Rectangulo implements Comparable<Cuadrado> {
  
  
  
  Cuadrado(int lado) {
    super(lado, lado); 
  }
/**
 * compara un cuadrado con este
 * @return int 
 */
  public int compareTo(Cuadrado cuadrado) {
    return this.compareTo(cuadrado);
  }
/**
 * devuelve el lado del cuadrado  
 * @return lado int
 */
  public int getLado() {
    return this.getAlto();
  }
/**
 * establece el valor del lado del cuadrado
 * @param lado int
 */
  public void setLado(int lado) {
    this.setAlto(lado);
    this.setAncho(lado);
  }
@Override
public String toString() {
  return "Cuadrado [getLado()=" + getLado() + "]";
}
  
  
}
