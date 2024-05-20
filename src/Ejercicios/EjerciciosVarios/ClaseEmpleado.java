package Ejercicios.EjerciciosVarios;

public class ClaseEmpleado {
  private String nombre;
  private double salario;
  private String departamento;

  public ClaseEmpleado() {}

  public ClaseEmpleado(String nombre, double salario, String departamento) {
    this.nombre = nombre;
    this.salario = salario;
    this.departamento = departamento;
  }

  public void mostrarInfo() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Salario: " + salario);
    System.out.println("Departamento: " + departamento);
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public String getDepartamento() {
    return departamento;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }
}
