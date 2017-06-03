package com.greenfox.Controller;

import com.greenfox.Model.Meal;
import com.greenfox.Model.Status;
import com.greenfox.Repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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

  @PostMapping("/meal")
  public Status saveMeal(@RequestBody Meal meal) {
    mealRepository.save(meal);
    return new Status();
  }
}
