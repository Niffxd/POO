import java.util.List;
import java.util.LinkedList;

public class LindkedLists {
  public static void main(String[] args) {
    List<Persona> lista = new LinkedList<Persona>();

    lista.add(new Persona(1, "Luisiona", 30));
    lista.add(new Persona(2, "Gabriel", 30));
    lista.add(new Persona(3, "Ibra", 9));
    lista.add(new Persona(4, "TodoCode", 2));

    // Agregar al principio

    lista.add(0, new Persona(5, "Probando", 98));

    System.out.println("-----------For Each-------------");

    for(Persona persona : lista) {
      System.out.println("Prueba: " + persona.getNombre());
    }
  }
}
