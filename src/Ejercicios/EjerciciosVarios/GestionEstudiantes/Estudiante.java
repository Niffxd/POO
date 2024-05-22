package Ejercicios.EjerciciosVarios.GestionEstudiantes;

import java.util.List;

public class Estudiante {
  private String nombre;
  private String apellido;
  private int id;
  private List<Calificacion> calificaciones;

  public Estudiante(String nombre, String apellido, int id, List<Calificacion> calificaciones) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.id = id;
    this.calificaciones = calificaciones;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void agregarCalificacion(Calificacion calificacion) {
    calificaciones.add(calificacion);
  }

  public void obtenerCalificaciones() {
    String lista = "\nCalificaciones: \n\n";

    for (Calificacion calificacion : calificaciones) {
      lista += "Materia: " + calificacion.getMateria() + ". Nota: " + calificacion.toString() + "\n";
    }

    System.out.println(lista);
  }

  public void getPromedio() {
    if(calificaciones.isEmpty()) {
      System.out.println("No hay calificaciones");
    } else {
      double promedio = 0;
      for (Calificacion calificacion : calificaciones) {
        promedio += calificacion.getNota();
      }
      promedio = promedio/calificaciones.size();

      System.out.println("Promedio: " + promedio);
    }
  }
}
