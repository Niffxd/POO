package Ejercicios.EjerciciosVarios;

public class ClaseCirculo {
  private double radio;

  public ClaseCirculo() {}

  public ClaseCirculo(double radio) {
    this.radio = radio;
  }

  public String getArea() {
    return String.format("El area del circulo es: %.2f", Math.PI * radio * radio);
  }

  public String getPerimetro() {
    return String.format("El perimetro del circulo es: %.2f", 2 * Math.PI * radio);
  }

  public double getRadio() {
    return radio;
  }

  public void setRadio(double radio) {
    this.radio = radio;
  }
}
