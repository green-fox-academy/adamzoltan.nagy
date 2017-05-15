package com.greenfox.Model;

/**
 * Created by Adam on 2017. 05. 15..
 */
public class FillShip {
  private String received;
  private int amount;
  private String shipStatus;
  private boolean ready = false;

  public FillShip(String received, int amount) {
    this.received = received;
    this.amount = amount;
    this.shipStatus = shipStatus;
    this.ready = ready;
  }

  public void changeStatus() {
    int amount = (getAmount()*100)/12500;
    if(amount > 0 && amount < 100){
      setShipStatus(String.valueOf(amount)+"%");
    }
  }

  public void changeReady() {
    if(getShipStatus().equals("full")) {
      setReady(true);
    }
  }
  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public String getShipStatus() {
    return shipStatus;
  }

  public void setShipStatus(String shipStatus) {
    this.shipStatus = shipStatus;
  }

  public boolean isReady() {
    return ready;
  }

  public void setReady(boolean ready) {
    this.ready = ready;
  }
}
