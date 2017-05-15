package com.greenfox.Model;

/**
 * Created by Adam on 2017. 05. 15..
 */
public class OutputMessage {
  private String recieved;
  private String translated;

  public OutputMessage() {
    this.recieved = recieved;
    this.translated = "I am Groot!";
  }

  public String getRecieved() {
    return recieved;
  }

  public void setRecieved(String recieved) {
    this.recieved = recieved;
  }

  public String getTranslated() {
    return translated;
  }

  public void setTranslated(String translated) {
    this.translated = translated;
  }
}
