package ConceptosBasicos;

public class CuadradoInterface implements FiguraInterface, Dibujable {
  private double lado;

  public CuadradoInterface() {}

  public CuadradoInterface(double lado) {
    this.lado = lado;
  }

  @Override
  public double calcularArea() {
    double area = this.lado * this.lado;
    return area;
  }

  @Override
  public void dibujar() {
    System.out.println("Hola, estoy dibujando un cuadrado");
  }
}
