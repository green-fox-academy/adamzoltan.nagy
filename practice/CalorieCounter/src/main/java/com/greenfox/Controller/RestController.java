package com.greenfox.Controller;


import com.greenfox.Model.Id;
import com.greenfox.Model.Meal;
import com.greenfox.Model.MealStatistics;
import com.greenfox.Model.Status;
import com.greenfox.Repository.MealRepository;
import com.greenfox.Service.CalorieCounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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

  @Autowired
  private MealStatistics mealStatistics;

  @Autowired
  private CalorieCounterService calorieCounterService;

  @GetMapping("/getmeals")
  public Iterable<Meal> getMeals() {
    return mealRepository.findAll();
  }

  @PostMapping("/meal")
  public Status saveMeal(@RequestBody Meal meal) {
    mealRepository.save(meal);
    return new Status();
  }

  @GetMapping("/getstats")
  public MealStatistics getMealStatistics() {
    mealStatistics.setTotalCalories(calorieCounterService.totalCalorie());
    mealStatistics.setNumberOfMeals(calorieCounterService.countMeals());
    return mealStatistics;
  }

  @DeleteMapping("/meal")
  public Status deleteMeal(@RequestBody Id id) {
    mealRepository.delete(id.getId());
    return new Status();
  }
}
