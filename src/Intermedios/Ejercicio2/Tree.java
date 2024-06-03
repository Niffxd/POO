package Intermedios.Ejercicio2;

public class Tree extends Plant {
  private String variety;
  private String trunkType;
  private double trunkRadius;
  private String color;
  private String leafType;

  public Tree(String name, double tall, boolean hasLeafs, String idealWeather, String variety, String trunkType, double trunkRadius, String color, String leafType) {
    super(name, tall, hasLeafs, idealWeather);
    this.variety = variety;
    this.trunkType = trunkType;
    this.trunkRadius = trunkRadius;
    this.color = color;
    this.leafType = leafType;
  }

  public void sayHi() {
    System.out.println("Hi! I'm a tree");
  }

  public String getVariety() {
    return variety;
  }

  public void setVariety(String variety) {
    this.variety = variety;
  }

  public String getTrunkType() {
    return trunkType;
  }

  public void setTrunkType(String trunkType) {
    this.trunkType = trunkType;
  }

  public double getTrunkRadius() {
    return trunkRadius;
  }

  public void setTrunkRadius(double trunkRadius) {
    this.trunkRadius = trunkRadius;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getLeafType() {
    return leafType;
  }

  public void setLeafType(String leafType) {
    this.leafType = leafType;
  }
}
