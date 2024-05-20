package ConceptosBasicos;

public class CuadradoAbstract extends FiguraAbstract {
  private double lado;

  public CuadradoAbstract() {}

  public CuadradoAbstract(double x, double y, double lado) {
    super(x, y);
    this.lado = lado;
  }

  @Override
  public double calcularArea() {
    double area = this.lado * this.lado;
    return area;
  }
}
