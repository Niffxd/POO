package ConceptosBasicos;

public class Main {
    public static void main(String[] args) {
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(5, "Luisina", "de Paula");

        System.out.println("\nEl ID del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre es: " + alu2.getNombre());
        System.out.println("El apellido es: " + alu2.getApellido());

        alu1.setId(8);
        alu1.setNombre("Suscribite");
        alu1.setApellido("TodoCode");

        System.out.println("\n-----------------------\n");

        System.out.println("El ID del alumno 1 es: " + alu1.getId());
        System.out.println("El nombre es: " + alu1.getNombre());
        System.out.println("El apellido es: " + alu1.getApellido());
    }
}