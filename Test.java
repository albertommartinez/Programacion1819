package rectangulo;

class Test {

  public static void main(String[] args) {
    Rectangulo rectangulo = new Rectangulo(8,6);
    rectangulo.toString();
    rectangulo.pintarRectangulo();
    rectangulo.toString();
    Rectangulo rectanguloError = new Rectangulo(12,15);
    rectangulo.pintarRectangulo();
    rectangulo.toString();
  }

}
