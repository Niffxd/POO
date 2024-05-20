package Ejercicios.EjerciciosVarios;

public class Main {
  public static void main(String[] args) {
    // Ejercicio 1:

    ClasePersona persona = new ClasePersona("Nicolas", 27, 40216736);

    System.out.println("Datos de la persona: \n\n" + persona.mostrarDatos());
    System.out.println("La persona es mayor: " + (persona.esMayor() ? "Si" : "No"));

    // Ejercicio 2:

    ClaseCirculo circulo = new ClaseCirculo(5);

    System.out.println(circulo.getArea());
    System.out.println(circulo.getPerimetro());
  }
}
