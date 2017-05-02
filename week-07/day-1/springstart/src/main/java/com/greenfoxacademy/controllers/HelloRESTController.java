package com.greenfoxacademy.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Adam on 2017. 05. 02..
 */

@RestController
public class HelloRESTController {

  @RequestMapping(value = "/")
  @ResponseBody
  public Greeting greeting() {
    Greeting greeting = new Greeting(1,"Hello World!");
    return greeting;
  }
}
