package com.greenfox.Modell;

/**
 * Created by Adam on 2017. 05. 14..
 */
public class ErrorMessage {
  private String message;

  public ErrorMessage(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
