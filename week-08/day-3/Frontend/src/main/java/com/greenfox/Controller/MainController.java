package com.greenfox.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Adam on 2017. 05. 10..
 */
@Controller
public class MainController {

  @RequestMapping("/index")
  public String index() {
    return "index";
  }

}
