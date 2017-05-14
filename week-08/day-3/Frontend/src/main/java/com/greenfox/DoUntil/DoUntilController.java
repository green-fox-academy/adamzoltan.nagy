package com.greenfox.DoUntil;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Adam on 2017. 05. 14..
 */
@RestController
public class DoUntilController {

  @PostMapping("/dountil/{what}")
  public DoUntil math(@PathVariable("what")String what, @RequestBody Input input) {
    DoUntil doUntil = new DoUntil();
    if (what.equals("sum")) {
      doUntil.sum(input.getUntil());
    }
    if (what.equals("factor")) {
      doUntil.factor(input.getUntil());
    }
    return doUntil;
  }
}
