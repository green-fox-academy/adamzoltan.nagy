package com.greenfox.AppendA;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Adam on 2017. 05. 14..
 */

@RestController
public class AppendAController {

  @GetMapping("/appenda/{appendable}")
  public AppendA appendA(@PathVariable("appendable")String appendable) {
    AppendA appendA = new AppendA();
    appendA.setAppended(appendable + "a");
    return appendA;
  }
}
