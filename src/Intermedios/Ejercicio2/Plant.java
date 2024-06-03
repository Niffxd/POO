package Intermedios.Ejercicio2;

public class Plant {
  private String name;
  private double tall;
  private boolean hasLeafs;
  private String idealWeather;

  public Plant(String name, double tall, boolean hasLeafs, String idealWeather) {
    this.name = name;
    this.tall = tall;
    this.hasLeafs = hasLeafs;
    this.idealWeather = idealWeather;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getTall() {
    return tall;
  }

  public void setTall(double tall) {
    this.tall = tall;
  }

  public boolean getHasLeafs() {
    return hasLeafs;
  }

  public void setHasLeafs(boolean hasLeafs) {
    this.hasLeafs = hasLeafs;
  }

  public String getIdealWeather() {
    return idealWeather;
  }

  public void setIdealWeather(String idealWeather) {
    this.idealWeather = idealWeather;
  }
}
