package com.greenfox.Controller;

import com.greenfox.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Adam on 2017. 05. 31..
 */
@Controller
@RequestMapping("/todo")
public class Todocontroller {

  @Autowired
  private TodoRepository todoRepository;

  @RequestMapping(value = {"/", "/list"})
  public String todo(Model model, @RequestParam (value = "done", required = false, defaultValue = "false") String done ) {
    if(done.equals("true")) {
      model.addAttribute("todo", todoRepository.findAllByDoneTrue());
    } else {
      model.addAttribute("todo", todoRepository.findAll());
    }
    return "index";
  }
}
