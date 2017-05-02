package com.greenfoxacademy.controllers;

import org.springframework.web.bind.annotation.*;

/**
 * Created by Adam on 2017. 05. 02..
 */

@RestController
public class HelloRESTController {

  @RequestMapping(value = "/greeting")
  @ResponseBody
  public Greeting greeting(@RequestParam("name") String name) {
    Greeting greeting = new Greeting(1,"Hello " + name);
    return greeting;
  }
}
