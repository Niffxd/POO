package ConceptosBasicos;

public class Encapsulamiento {
    public static void main(String[] args) {
        Alumno alu = new Alumno();
        Alumno alu2 = new Alumno(15, "Suscribite", "Todo code");

        System.out.println("id: " + alu.getId());
        System.out.println("nombre: " + alu.getNombre());
        System.out.println("apellido: " + alu.getApellido());
    }
}
