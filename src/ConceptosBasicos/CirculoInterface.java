package ConceptosBasicos;

public class CirculoInterface implements FiguraInterface, Dibujable, Rotable {
  private double radius;

  public CirculoInterface(){}

  public CirculoInterface(double radius) {
    this.radius = radius;
  }

  @Override
  public double calcularArea() {
    double area = Math.PI * radius * radius;
    return area;
  }


  @Override
  public void dibujar() {
    System.out.println("Hola, estoy dibujando un circulo");
  }

  @Override
  public void rotar() {
    System.out.println("Hola, estoy rotando un circulo");
  }
}
