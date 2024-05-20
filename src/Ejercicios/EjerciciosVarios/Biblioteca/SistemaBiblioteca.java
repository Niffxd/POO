package Ejercicios.EjerciciosVarios.Biblioteca;

public class SistemaBiblioteca {

  /* Falta implementar lista de autores y obtenerlos sin repetirse
  *  Hacer funciones para agregar libros por medio de listas
  *
  *
  */

  public static void main(String[] args) {
    Biblioteca biblioteca = new Biblioteca("Java");

    Usuario usuario1 = new Usuario("Nicolas");
    Usuario usuario2 = new Usuario("Valentin");
    Usuario usuario3 = new Usuario("Jimena");

    Libro libro1 = new Libro("El Enigma del Tiempo", "Laura Martínez", "978-3-16-148410-0");
    Libro libro2 = new Libro("Sombras en el Bosque", "Javier Rodríguez", "978-1-4028-9462-6");
    Libro libro3 = new Libro("Viaje al Corazón del Mar", "Ana López", "978-0-545-01022-1");
    Libro libro4 = new Libro("Misterios del Pasado", "Carlos Sánchez", "978-0-307-29118-1");
    Libro libro5 = new Libro("La Torre de Cristal", "Elena García", "978-0-7432-7352-1");
    Libro libro6 = new Libro("Horizontes Lejanos", "Manuel Gómez", "978-1-250-07621-3");
    Libro libro7 = new Libro("El Secreto de las Estrellas", "Paula Fernández", "978-0-375-71276-8");
    Libro libro8 = new Libro("Ecos del Silencio", "Sergio Álvarez", "978-0-452-27214-9");
    Libro libro9 = new Libro("El Laberinto de los Sueños", "Isabel Torres", "978-0-06-112241-5");
    Libro libro10 = new Libro("Las Puertas del Destino", "Andrés Herrera", "978-1-61608-734-2");

    // biblioteca.mostrarInfo();

    biblioteca.agregarSocio(usuario1);
    biblioteca.agregarSocio(usuario2);
    biblioteca.agregarSocio(usuario3);

    biblioteca.agregarLibro(libro1);
    biblioteca.agregarLibro(libro2);
    biblioteca.agregarLibro(libro3);
    biblioteca.agregarLibro(libro4);
    biblioteca.agregarLibro(libro5);
    biblioteca.agregarLibro(libro6);
    biblioteca.agregarLibro(libro7);
    biblioteca.agregarLibro(libro8);
    biblioteca.agregarLibro(libro9);
    biblioteca.agregarLibro(libro10);

    // biblioteca.mostrarInfo();

    usuario1.tomarPrestadoLibro(libro1);
    usuario2.tomarPrestadoLibro(libro2);
    usuario3.tomarPrestadoLibro(libro2);

    biblioteca.mostrarInfo();
  }
}
