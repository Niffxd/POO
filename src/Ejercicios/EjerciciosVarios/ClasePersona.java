package Ejercicios.EjerciciosVarios;

public class ClasePersona {
  private String nombre;
  private int edad;
  private int DNI;

  public ClasePersona() {}

  public ClasePersona(String nombre) {
    this.nombre = nombre;
  }

  public ClasePersona(String nombre, int edad, int DNI) {
    this.nombre = nombre;
    this.edad = edad;
    this.DNI = DNI;
  }

  public String mostrarDatos () {
    return "Hola, mis datos son: " + "\nNombre: " + nombre + "\nEdad: " + edad + "\nDNI: " + DNI;
  }

  public boolean esMayor () {
    return (edad >= 18);
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public int getDNI() {
    return DNI;
  }

  public void setDNI(int DNI) {
    this.DNI = DNI;
  }
}
