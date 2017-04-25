/**
 * Created by Adam on 2017. 04. 25..
 */
public abstract class Plants {
  private double waterLevel;
  private double absorption;
  private int waterLimit;

  public Plants(double waterLevel, double absorption, int waterLimit) {
    this.waterLevel = waterLevel;
    this.absorption = absorption;
    this.waterLimit = waterLimit;
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
