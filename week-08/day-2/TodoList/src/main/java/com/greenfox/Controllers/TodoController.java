package com.greenfox.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Adam on 2017. 05. 09..
 */

@Controller
@RequestMapping("/todo")
public class TodoController {

  @RequestMapping({"/", "/list"})
  @ResponseBody
  public String list(Model model) {
    return "This is my first todo";
  }
}
