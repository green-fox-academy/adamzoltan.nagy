package com.greenfox.Controller;

import com.greenfox.Model.Meal;
import com.greenfox.Repository.MealRepository;
import com.greenfox.Repository.MealTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Adam on 2017. 06. 02..
 */
@Controller
public class MainController {

  @Autowired
  private MealRepository mealRepository;

  @Autowired
  private MealTypeRepository mealTypeRepository;

  @RequestMapping("/index")
  public String index(Model model) {
    model.addAttribute("meal", mealRepository.findAll());
    return "index";
  }

  @RequestMapping("/addMeal")
  public String addMeal(Model model) {
    model.addAttribute("mealTypes", mealTypeRepository.findAll());
    return "addMeal";
  }

  @RequestMapping("/saveMeal")
  public String saveMeal(@RequestParam (name="type") String type,
                         @RequestParam (name="description") String description,
                         @RequestParam (name="calories") Double calories) {
    mealRepository.save(new Meal(type,description,calories));
    return "redirect:/index";
  }

  @RequestMapping("/deleteMeal/{id}")
  public String deleteMeal(@PathVariable("id") long id) {
    mealRepository.delete(id);
    return "redirect:/index";
  }
}
