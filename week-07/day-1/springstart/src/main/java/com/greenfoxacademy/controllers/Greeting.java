package com.greenfoxacademy.controllers;

import lombok.Data;

/**
 * Created by Adam on 2017. 05. 02..
 */
public @Data class Greeting {
  private long id;
  private String content;

  public Greeting(long id, String content) {
    this.id = id;
    this.content = content;
  }

}
