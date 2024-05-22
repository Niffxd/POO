package Ejercicios.EjerciciosVarios.Persona;

public class Gerente extends ClaseEmpleado {
  private double bono;

  public Gerente() {}

  public Gerente(String nombre, double salario, String departamento, double bono) {
    super(nombre, salario, departamento);
    this.bono = bono;
  }

  @Override
  public void mostrarInfo() {
    super.mostrarInfo();
    System.out.println("Bono: " + this.bono);
  }

  @Override
  public double getSalario() {
    return super.getSalario() + bono;
  }

  public double getBono() {
    return bono;
  }

  public void setBono(double bono) {
    this.bono = bono;
  }
}
