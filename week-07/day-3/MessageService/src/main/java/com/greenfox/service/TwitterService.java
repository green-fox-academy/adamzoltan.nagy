package com.greenfox.service;

/**
 * Created by Adam on 2017. 05. 04..
 */
public class TwitterService implements MessageService {

  @Override
  public void sendMessage(String s1, String s2) {
    System.out.println("Twitter sent to: " + s2 + " with message =" +s2);
  }
}
