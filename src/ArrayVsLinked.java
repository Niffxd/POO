import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayVsLinked {
  public static void main(String[] args) {
    List<Persona> listaArray = new ArrayList<Persona>();

    listaArray.add(new Persona(1, "Luisiona", 30));
    listaArray.add(new Persona(2, "Gabriel", 30));
    listaArray.add(new Persona(3, "Ibra", 9));
    listaArray.add(new Persona(4, "TodoCode", 2));

    List<Persona> listaLinked = new LinkedList<Persona>();

    listaLinked.add(new Persona(1, "Luisiona", 30));
    listaLinked.add(new Persona(2, "Gabriel", 30));
    listaLinked.add(new Persona(3, "Ibra", 9));
    listaLinked.add(new Persona(4, "TodoCode", 2));

    // Remove en ArrayList
    listaArray.remove(1);

    // Remove en LinkedList
    String nombreBorrar = "Gabriel";
    for (Persona persona : listaLinked) {
      if (persona.getNombre().equals(nombreBorrar)) {
        listaLinked.remove(persona);
        break;
      }
    }

    System.out.println("----------- Luego de eliminar ------------");
    // Recorrido for Each
    System.out.println("----------- ArrayList ------------");
    for(Persona persona : listaArray) {
      System.out.println("Prueba: " + persona.getNombre());
    }

    System.out.println("----------- LinkedList ------------");
    for(Persona persona : listaLinked) {
      System.out.println("Prueba: " + persona.getNombre());
    }

    // Tamaño de la lista
    System.out.println("----------- Tamaño de la lista ------------");
    System.out.println("ArrayList: " + listaArray.size());
    System.out.println("LinkedList: " + listaLinked.size());

    // Obtener primer y último objeto
    System.out.println("----------- Primer y último objeto ------------");

    // recordar que el método "toString()" tiene Override en la clase

    // System.out.println("Primero de LinkedList: " + listaLinked.getFirst().getNombre());
    // System.out.println("Último de LinkedList: " + listaLinked.getLast().getNombre());
    // System.out.println("Primero de ArrayList: " + listaArray.get(0).getNombre());
    // System.out.println("Último de ArrayList: " + listaArray.get(listaArray.size() - 1).getNombre());
    System.out.println("Primero de LinkedList: " + listaLinked.getFirst().toString());
    System.out.println("Último de LinkedList: " + listaLinked.getLast().toString());
    System.out.println("Primero de ArrayList: " + listaArray.get(0).toString());
    System.out.println("Último de ArrayList: " + listaArray.get(listaArray.size() - 1).toString());

    // Borrar toda la lista
    System.out.println("----------- Borrando listas --------------");
    listaArray.clear();
    listaLinked.clear();

    // Comprobar si está vacía
    System.out.println("----------- Está vacía ? --------------");
    System.out.println("ArrayList: " + listaArray.isEmpty());
    System.out.println("LinkedList: " + listaLinked.isEmpty());
  }
}
