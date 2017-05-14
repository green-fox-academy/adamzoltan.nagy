package com.greenfox.Greeter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Adam on 2017. 05. 14..
 */

@RestController
public class GreeterRestController {

  @GetMapping
  public Greeter greeter(@RequestParam("name") String name, @RequestParam("title") String title) {
    Greeter greeter = new Greeter();
    greeter.setWelcomeMessage("Oh, hi there " + name + ", my dear " + title + "!");
    return greeter;
  }
}
