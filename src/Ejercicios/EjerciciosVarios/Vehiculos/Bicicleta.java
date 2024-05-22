package Ejercicios.EjerciciosVarios.Vehiculos;

public class Bicicleta extends ClaseVehiculo {
  private String rodado;
  private int cambios;
  private int cambioActual;
  private int velActual;
  private boolean andar;

  public Bicicleta() {}

  public Bicicleta(String marca, String modelo, String velMax, String rodado, int cambios) {
    super(marca, modelo, velMax);
    this.rodado = rodado;
    this.cambios = cambios;
    this.cambioActual = 0;
    this.velActual = 0;
    this.andar = false;
  }

  public void andar() {
    if(!andar) {
      andar = true;
      velActual = 10;
      cambioActual = 1;
    } else System.out.println("Ya estás andando");
  }

  public void subirCambio() {
    if(cambioActual < cambios) {
      cambioActual += 1;
      velActual += 10;
    } else System.out.println("Ya estás en la velocidad máxima");
  }

  public void bajarCambio() {
    if(cambioActual > 0) {
      if(cambioActual > 1) {
        cambioActual -= 1;
        velActual -= 10;
      } else {
        andar = false;
        velActual = 0;
        cambioActual = 0;
      }
    } else System.out.println("Tienes que comenzar a andar primero");
  }

  public String getRodado() {
    return rodado;
  }

  public void setRodado(String rodado) {
    this.rodado = rodado;
  }
}
