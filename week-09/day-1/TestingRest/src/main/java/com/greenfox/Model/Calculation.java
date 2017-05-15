package com.greenfox.Model;

/**
 * Created by Adam on 2017. 05. 15..
 */
public class Calculation {
  private String distance;
  private String time;
  private String speed;


  public Calculation() {
    this.distance = distance;
    this.time = time;
  }

  public void calculateSpeed() {
    double distance = Double.parseDouble(getDistance());
    double time = Double.parseDouble(getTime());
    double speed = distance/time;
    setSpeed(String.valueOf(speed));
  }

  public String getDistance() {
    return distance;
  }

  public void setDistance(String distance) {
    this.distance = distance;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public String getSpeed() {
    return speed;
  }

  public void setSpeed(String speed) {
    this.speed = speed;
  }
}
