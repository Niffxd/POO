package ConceptosBasicos;

public class Empleado extends Persona {
    int numLegajo;
    String cargo;
    Double sueldo;

    public Empleado() {}

    public Empleado(int id, String DNI, String nombre, String apellido, String domicilio, String telefono, int numLegajo, String cargo, Double sueldo) {
        super(id, DNI, nombre, apellido, domicilio, telefono);
        this.numLegajo = numLegajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public int getNumLegajo() {
        return numLegajo;
    }

    public void setNumLegajo(int numLegajo) {
        this.numLegajo = numLegajo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
}
