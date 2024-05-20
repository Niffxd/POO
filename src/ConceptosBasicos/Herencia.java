package ConceptosBasicos;

public class Herencia {
    public static void main(String[] args) {
//        ConceptosBasicos.Empleado emple = new ConceptosBasicos.Empleado();
//
//        emple.getNumLegajo();
//        emple.getNombre();
//
//        ConceptosBasicos.Consultor consul = new ConceptosBasicos.Consultor();
//
//        consul.getNumConsultor();
//        consul.getNombre();

        Persona vector[] = new Persona[5];

        vector[0] = new Persona();
        vector[1] = new Empleado();
        vector[2] = new Consultor();
        vector[3] = new Jefe();
    }
}
