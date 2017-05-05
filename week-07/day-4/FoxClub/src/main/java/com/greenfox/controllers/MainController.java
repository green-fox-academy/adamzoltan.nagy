package com.greenfox.controllers;

import com.greenfox.modell.Fox;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Adam on 2017. 05. 05..
 */

@Controller
public class MainController {

  @Autowired
  Fox fox;

  @RequestMapping("/")
    public String index(Model model) {
    model.addAttribute("name",fox.getName());
    model.addAttribute("food",fox.getFood());
    model.addAttribute("drink",fox.getDrink());
    model.addAttribute("tricknum",fox.tricksNumber());
    return "index";
  }
}
