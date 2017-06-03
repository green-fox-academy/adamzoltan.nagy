package com.greenfox.Controller;

import com.greenfox.Model.Meal;
import com.greenfox.Repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Adam on 2017. 06. 03..
 */

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @Autowired
  private MealRepository mealRepository;

  @GetMapping("/getmeals")
  public Iterable<Meal> getMeals() {
    return mealRepository.findAll();
  }
}
