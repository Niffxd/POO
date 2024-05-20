package Ejercicios.EjerciciosVarios;

public class Motocicleta extends ClaseVehiculo {
  private String placa;
  private double kilometros;
  private String motor;
  private boolean encendido;
  private double velocidad;
  private int marchaActual;

  public Motocicleta() {}

  public Motocicleta(String marca, String modelo, String velMax, String placa, double kilometros) {
    super(marca, modelo, velMax);
    this.placa = placa;
    this.kilometros = kilometros;
    this.encendido = false;
    this.velocidad = 0;
    this.marchaActual = 0;
  }

  public void encender() {
    if(!encendido) {
      encendido = true;
      velocidad = 0;
      marchaActual = 0;
      System.out.println("El vehiculo se encendió");
    } else System.out.println("El vehiculo ya esta encendido");
  }

  public void apagar() {
    if(encendido) {
      encendido = true;
      velocidad = 0;
      marchaActual = 0;
      System.out.println("El vehiculo se apagó");
    } else System.out.println("El vehiculo ya esta apagado");
  }

  public void subirMarcha() {
    if(encendido) {
      if(marchaActual < 6) {
        marchaActual++;
        velocidad += 20;
        System.out.println("La velocidad actual es: " + velocidad);
      } else System.out.println("Estás en la velocidad máxima.");
    } else System.out.println("Primero necesitas encender el vehículo.");
  }

  public void bajarMarcha() {
    if(encendido && marchaActual > 0) {
      marchaActual--;
      velocidad -= 20;
      System.out.println("La velocidad actual es: " + velocidad);
    } else System.out.println("Primero necesitas encender el vehículo.");
  }

  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public double getKilometros() {
    return kilometros;
  }

  public void setKilometros(double kilometros) {
    this.kilometros = kilometros;
  }
}
