package com.greenfox.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Created by Adam on 2017. 05. 15..
 */
public class ShipCargo {
  private int caliber25 = 0;
  private int caliber30 = 0;
  private int caliber50 = 0;
  @JsonIgnore
  private Double received;
  @JsonIgnore
  private int amount;
  private String shipStatus = "empty";
  private Boolean ready = false;
  @JsonIgnore
  private int maxAmount = 12500;


  public ShipCargo() {

  }

  public void fillingShip(Double received, int amount) {
    setReceived(received);
    setAmount(getAmount() + amount);
  }
  public void changeStatus() {
    int amount = (getAmount()*100)/getMaxAmount();
    if(amount > 0 && amount < 100) {
      setShipStatus(String.valueOf(amount));
    }
  }

  public void changeReady() {
    if(getShipStatus().equals("full")) {
      setReady(true);
    }
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
  public Double getRecieved() {
    return received;
  }
  @JsonIgnore
  public void setReceived(Double recieved) {
    this.received = recieved;
  }
  @JsonIgnore
  public int getAmount() {
    return amount;
  }
  @JsonIgnore
  public void setAmount(int amount) {
    this.amount = amount;
  }

  public Double getReceived() {
    return received;
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
