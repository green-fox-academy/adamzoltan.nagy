package com.greenfox.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.stereotype.Component;

/**
 * Created by Adam on 2017. 05. 15..
 */

public class ShipCargo {
  private int caliber25 = 0;
  private int caliber30 = 0;
  private int caliber50 = 0;
  private String shipStatus = "empty";
  private Boolean ready = false;
  @JsonIgnore
  private int maxAmount = 12500;

  public ShipCargo() {
    this.caliber25 = caliber25;
    this.caliber30 = caliber30;
    this.caliber50 = caliber50;
    this.shipStatus = shipStatus;
    this.ready = ready;
  }

  public int getCaliber25() {
    return caliber25;
  }

  public void setCaliber25(int caliber25) {
    this.caliber25 = caliber25;
  }

  public int getCaliber30() {
    return caliber30;
  }

  public void setCaliber30(int caliber30) {
    this.caliber30 = caliber30;
  }

  public int getCaliber50() {
    return caliber50;
  }

  public void setCaliber50(int caliber50) {
    this.caliber50 = caliber50;
  }

  public String getShipStatus() {
    return shipStatus;
  }

  public void setShipStatus(String shipStatus) {
    this.shipStatus = shipStatus;
  }

  public Boolean getReady() {
    return ready;
  }

  public void setReady(Boolean ready) {
    this.ready = ready;
  }

  @JsonIgnore
  public int getMaxAmount() {
    return maxAmount;
  }
  @JsonIgnore
  public void setMaxAmount(int maxAmount) {
    this.maxAmount = maxAmount;
  }
}
