package com.greenfox.Controller;

import com.greenfox.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Adam on 2017. 05. 31..
 */
@Controller
@RequestMapping("/todo")
public class Todocontroller {

  @Autowired
  private TodoRepository todoRepository;

  @RequestMapping({"/", "/list"})
  public String todo(Model model) {
    model.addAttribute("todo",todoRepository.findAll());
    return "index";
  }
}
