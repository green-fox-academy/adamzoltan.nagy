package com.greenfox.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Adam on 2017. 06. 02..
 */
@Controller
public class MainController {

  @RequestMapping
  public String index() {
    
    return "index";
  }
}
