package Ejercicios.EjerciciosVarios.Vehiculos;

public class ClaseVehiculo {
  private String marca;
  private String modelo;
  private String velMax;

  public ClaseVehiculo() {}

  public ClaseVehiculo(String marca, String modelo, String velMax) {
    this.marca = marca;
    this.modelo = modelo;
    this.velMax = velMax;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getVelMax() {
    return velMax;
  }

  public void setVelMax(String velMax) {
    this.velMax = velMax;
  }
}
