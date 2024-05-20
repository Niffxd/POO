package Ejercicios.EjerciciosVarios.Biblioteca;

public class Libro {
  private String titulo;
  private String autor;
  private String ISBN;
  private boolean prestado;

  public Libro(String titulo) {
    this.titulo = titulo;
    this.autor = "Anónimo";
    this.ISBN = null;
    this.prestado = false;
    // System.out.println("Libro agregado con éxito");
  }

  public Libro(String titulo, String autor) {
    this.titulo = titulo;
    this.autor = autor;
    this.ISBN = null;
    this.prestado = false;
    // System.out.println("Libro agregado con éxito");
  }

  public Libro(String titulo, String autor, String ISBN) {
    this.titulo = titulo;
    this.autor = autor;
    this.ISBN = ISBN == null ? "" : ISBN;
    this.prestado = false;
    // System.out.println("Libro agregado con éxito");
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getISBN() {
    return ISBN;
  }

  public void setISBN(String ISBN) {
    this.ISBN = ISBN;
  }

  public boolean getPrestado() {
    return prestado;
  }

  public void setPrestado() {
    if(this.prestado) this.prestado = false;
    else this.prestado = true;
  }
}
