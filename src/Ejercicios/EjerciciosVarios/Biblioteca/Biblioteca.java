package Ejercicios.EjerciciosVarios.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
  private String nombre;
  private List<Libro> libros;
  private List<Usuario> socios;
  private int totalLibrosPrestados;

  public Biblioteca(String nombre) {
    this.nombre = nombre;
    this.libros = new ArrayList<Libro>();
    this.socios = new ArrayList<Usuario>();
    this.totalLibrosPrestados = 0;
    // System.out.println("La biblioteca se creó con éxito");
  }

  public void agregarSocio(Usuario usuario) {
    usuario.setNumSocio(socios.size() + 1);
    socios.add(usuario);
    // System.out.println("Socio agregado");
  }

  public void agregarLibro(Libro libro) {
    this.libros.add(libro);
  }

  public void mostrarInfo() {
    System.out.println("\n");
    System.out.println("Biblioteca: Biblioteca " + getNombre() + ".");
    System.out.println("Socios actuales: " + getNumSocios() + " socios.");
    System.out.println("Total de libros: " + libros.size() + " libros.");
    System.out.println("Libros prestados hasta el momento: " + getTotalLibrosPrestados() + " libros.");
    System.out.println("\n");
  }

  public String getNombre() {
    return nombre;
  }

  public String getLibros() {
    String lista = "";

    for (Libro libro : libros) {
      lista += libro.getTitulo() + "\n";
    }

    return lista;
  }

  public int getTotalLibrosPrestados() {
    for(Libro libro : libros) {
      if(libro.getPrestado()) totalLibrosPrestados++;
    }

    return totalLibrosPrestados;
  }

  public int getNumSocios() {
    return socios.size();
  }
}
