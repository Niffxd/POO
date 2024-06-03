package Intermedios.Ejercicio2;

public class Flower extends Plant {
  private String petalColor;
  private double petalAverage;
  private String pistilColor;
  private String varietyFlower;
  private String floweringSeason;

  public Flower(String name, double tall, boolean hasLeafs, String idealWeather, String petalColor, double petalAverage, String pistilColor, String varietyFlower, String floweringSeason) {
    super(name, tall, hasLeafs, idealWeather);
    this.petalColor = petalColor;
    this.petalAverage = petalAverage;
    this.pistilColor = pistilColor;
    this.varietyFlower = varietyFlower;
    this.floweringSeason = floweringSeason;
  }

  public void sayHi() {
    System.out.println("Hi! I'm a flower");
  }

  public String getPetalColor() {
    return petalColor;
  }

  public void setPetalColor(String petalColor) {
    this.petalColor = petalColor;
  }

  public double getPetalAverage() {
    return petalAverage;
  }

  public void setPetalAverage(double petalAverage) {
    this.petalAverage = petalAverage;
  }

  public String getPistilColor() {
    return pistilColor;
  }

  public void setPistilColor(String pistilColor) {
    this.pistilColor = pistilColor;
  }

  public String getVarietyFlower() {
    return varietyFlower;
  }

  public void setVarietyFlower(String varietyFlower) {
    this.varietyFlower = varietyFlower;
  }

  public String getFloweringSeason() {
    return floweringSeason;
  }

  public void setFloweringSeason(String floweringSeason) {
    this.floweringSeason = floweringSeason;
  }
}
