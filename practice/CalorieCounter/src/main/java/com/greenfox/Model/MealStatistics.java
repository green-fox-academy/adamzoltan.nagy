package com.greenfox.Model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * Created by Adam on 2017. 06. 04..
 */
@Component
@Getter
@Setter
public class MealStatistics {

  private int numberOfMeals;
  private int totalCalories;

  public MealStatistics() {
  }
}
