package Ejercicios.EjerciciosVarios.Biblioteca;

import java.util.List;
import java.util.ArrayList;

public class Usuario {
  private String nombre;
  private int numSocio;
  private List<Libro> librosPrestados;

  public Usuario(String nombre) {
    this.nombre = nombre;
    this.numSocio = 0;
    this.librosPrestados = new ArrayList<>();
  }

  public void tomarPrestadoLibro(Libro libro) {
    if(numSocio == 0) {
      System.out.println("Sólo los socios pueden obtener prestado un libro.");
    } else {
      if(libro.getPrestado()) {
        for (Libro foundLibro : librosPrestados) {
          if(foundLibro.equals(libro)) {
            System.out.println("El libro ya fue prestado a este socio.");
            break;
          }
        }
        if(libro.getPrestado() && librosPrestados.isEmpty()) {
          System.out.println(nombre + " no puede tomar el libro ya que fue prestado a otro socio.");
        }
      } else {
        libro.setPrestado();
        librosPrestados.add(libro);
        System.out.println(nombre + " tomó prestado '" + libro.getTitulo() + "'.");
      }
    }
  }

  public void devolverLibro(Libro libro) {
    if(numSocio == 0) {
      System.out.println("Sólo los socios pueden devolver un libro prestado.");
    } else {
      for (Libro foundLibro : librosPrestados) {
        if(foundLibro.equals(libro)) {
          libro.setPrestado();
          librosPrestados.remove(libro);
          System.out.println("El socio devolvió el libro prestado.");;
        } else {
          System.out.println("Este libro no fue tomado por este socio.");
        }
      }
    }
  }

  public String mostrarInfo() {
    return "Nombre: " + nombre
             + "\nNumero de socio: " + (numSocio == 0 ? " No es socio." : numSocio)
             + "\nLibros: \n\t\t" + getLibrosPrestados();
  }

  public String getNombre() {
    return nombre;
  }

  public String getNumSocio() {
     if(numSocio == 0) {
       return "El usuario necesita registrarse para obtener un número de socio.";
     } else {
       return "Socio N° " + numSocio + ".";
     }
  }

  public String getLibrosPrestados() {
    if(!librosPrestados.isEmpty()) {
      String libros = "";
      for (Libro libro : librosPrestados) {
        libros += libro.toString() + "\n";
      }

      return libros;
    } else return "Este usuario no posee libros prestados aún.";
  }

  public void setNumSocio(int socio) {
    numSocio = socio;
  }
}
