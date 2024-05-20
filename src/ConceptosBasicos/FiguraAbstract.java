package ConceptosBasicos;

public abstract class FiguraAbstract {
  protected double x;
  protected double y;

  public FiguraAbstract() {}

  public FiguraAbstract(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public abstract double calcularArea();
}
