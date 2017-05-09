package com.greenfox.Controllers;

import com.greenfox.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

  @Autowired
  TodoRepository todoRepository;

  @RequestMapping({"/", "/list"})
  @ResponseBody
  public String list(Model model) {
    return "This is my first todo";
  }
}
