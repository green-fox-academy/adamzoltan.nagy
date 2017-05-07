package com.greenfox.modell;

import org.springframework.stereotype.Component;

/**
 * Created by Adam on 2017. 05. 07..
 */

public class BankAccount {
  private String name;
  private String animalType;
  private int balance;
  private boolean king;
  private boolean goodGuy;

  public BankAccount(String name, String animalType, int balance, boolean king, boolean goodGuy) {
    this.name = name;
    this.animalType = animalType;
    this.balance = balance;
    this.king = king;
    this.goodGuy = goodGuy;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public boolean isKing() {
    return king;
  }

  public void setKing(boolean king) {
    this.king = king;
  }

  public boolean isGoodGuy() {
    return goodGuy;
  }

  public void setGoodGuy(boolean goodGuy) {
    this.goodGuy = goodGuy;
  }
}
