package com.greenfox.service;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Adam on 2017. 05. 04..
 */
public class MessageProceeder {
  @Autowired
  private MessageService messageService;

    public void processMessage(String s1, String s2) {
       messageService.sendMessage(s1, s2);
    }
}
