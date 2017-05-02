package com.greenfoxacademy.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
  AtomicLong atomic = new AtomicLong();

  @RequestMapping(value = "/greeting")
  @ResponseBody
  public Greeting greeting(@RequestParam("name") String name) {
    Greeting greeting = new Greeting(atomic.getAndIncrement(),"Hello " + name);
    return greeting;
  }
}
