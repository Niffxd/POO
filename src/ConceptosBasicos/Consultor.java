package ConceptosBasicos;

public class Consultor extends Persona {
    String nombreConsultora;
    int numConsultor;

    public Consultor() {}

    public Consultor(int id, String DNI, String nombre, String apellido, String domicilio, String telefono, String nombreConsultora, int numConsultor) {
        super(id, DNI, nombre, apellido, domicilio, telefono);
        this.nombreConsultora = nombreConsultora;
        this.numConsultor = numConsultor;
    }

    public String getNombreConsultora() {
        return nombreConsultora;
    }

    public void setNombreConsultora(String nombreConsultora) {
        this.nombreConsultora = nombreConsultora;
    }

    public int getNumConsultor() {
        return numConsultor;
    }

    public void setNumConsultor(int numConsultor) {
        this.numConsultor = numConsultor;
    }
}
