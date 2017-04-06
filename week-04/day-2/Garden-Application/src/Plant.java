/**
 * Created by Adam on 2017. 04. 06..
 */
public class Plant {
  private double waterLevel;
  private String color;
  private String type;
  private double absorbtion;
  private int waterLimit;

  public Plant (String color) {
   this.color = color;
  }

  public double getWaterLevel() {
    return waterLevel;
  }

  public String getType() {
    return type;
  }

  public double getAbsorbtion() {
    return absorbtion;
  }

  public int getWaterLimit() {
    int waterLimit;
  }

  public void setWaterLevel(double waterLevel) {
    this.waterLevel = waterLevel;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setAbsorbtion(double absorbtion) {
    this.absorbtion = absorbtion;
  }

  public void setWaterLimit(int waterLimit) {
    this.waterLimit = waterLimit;
  }
}
