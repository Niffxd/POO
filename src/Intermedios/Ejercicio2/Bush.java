package Intermedios.Ejercicio2;

public class Bush extends Plant {
  private double width;
  private boolean isDomestic;
  private String varietyBush;
  private String leafsColor;
  private boolean ableToTrim;

  public Bush(String name, double tall, boolean hasLeafs, String idealWeather, double width, boolean isDomestic, String varietyBush, String leafsColor, boolean ableToTrim) {
    super(name, tall, hasLeafs, idealWeather);
    this.width = width;
    this.isDomestic = isDomestic;
    this.varietyBush = varietyBush;
    this.leafsColor = leafsColor;
    this.ableToTrim = ableToTrim;
  }

  public void sayHi() {
    System.out.println("Hi! I'm a bush");
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public boolean isDomestic() {
    return isDomestic;
  }

  public void setDomestic(boolean domestic) {
    isDomestic = domestic;
  }

  public String getVarietyBush() {
    return varietyBush;
  }

  public void setVarietyBush(String varietyBush) {
    this.varietyBush = varietyBush;
  }

  public String getLeafsColor() {
    return leafsColor;
  }

  public void setLeafsColor(String leafsColor) {
    this.leafsColor = leafsColor;
  }

  public boolean isAbleToTrim() {
    return ableToTrim;
  }

  public void setAbleToTrim(boolean ableToTrim) {
    this.ableToTrim = ableToTrim;
  }
}
