package com.greenfox.Controller;

import com.greenfox.Repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Adam on 2017. 06. 02..
 */
@Controller
public class MainController {

  @Autowired
  private MealRepository mealRepository;

  @RequestMapping("/index")
  public String index(Model model) {
    model.addAttribute("meal", mealRepository.findAll());
    return "index";
  }
}
