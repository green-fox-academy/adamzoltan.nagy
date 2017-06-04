package com.greenfox.Service;

import com.greenfox.Model.Meal;
import com.greenfox.Repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Adam on 2017. 06. 04..
 */
@Service
public class CalorieCounterService {

  @Autowired
  private MealRepository mealRepository;

  public int totalCalorie() {
    int sumCalorie = 0;
    for(Meal meal : mealRepository.findAll()) {
      sumCalorie = sumCalorie + (int)meal.getCalories();
    }
    return sumCalorie;
  }

  public int countMeals() {
    int meals = 0;
    for(Meal meal : mealRepository.findAll()) {
      meals ++;
    }
    return meals;
  }

}
