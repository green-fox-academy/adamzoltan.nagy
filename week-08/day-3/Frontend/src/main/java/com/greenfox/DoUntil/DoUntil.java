package com.greenfox.DoUntil;

/**
 * Created by Adam on 2017. 05. 14..
 */
public class DoUntil {
  private int result;

  public DoUntil() {

  }

  public void sum(int number) {
    int result = 0;
    for (int i = 1; i <= number; i++) {
      result = result + i;
    }
    this.result = result;
  }

  public void factor(int number) {
    int result = 1;
    for (int i = 1; i <= number; i++) {
      result = result * i;
    }
    this.result = result;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
