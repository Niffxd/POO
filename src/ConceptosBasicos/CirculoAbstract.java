package ConceptosBasicos;

public class CirculoAbstract extends FiguraAbstract {
  private double radius;

  public CirculoAbstract(){}

  public CirculoAbstract(double x, double y, double radius) {
    super(x, y);
    this.radius = radius;
  }

  @Override
  public double calcularArea() {
    double area = Math.PI * radius * radius;
    return area;
  }
}
