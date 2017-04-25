/**
 * Created by Adam on 2017. 04. 25..
 */
public abstract class Plants {
  private String color;
  private double waterLevel;
  private double absorption;
  private int waterLimit;

  public Plants(String color, double waterLevel, double absorption, int waterLimit) {
    this.color = color;
    this.waterLevel = waterLevel;
    this.absorption = absorption;
    this.waterLimit = waterLimit;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getWaterLevel() {
    return waterLevel;
  }

  public void setWaterLevel(double waterLevel) {
    this.waterLevel = waterLevel;
  }

  public double getAbsorption() {
    return absorption;
  }

  public void setAbsorbation(double absorption) {
    this.absorption = absorption;
  }

  public int getWaterLimit() {
    return waterLimit;
  }

  public void setWaterLimit(int waterLimit) {
    this.waterLimit = waterLimit;
  }
}
