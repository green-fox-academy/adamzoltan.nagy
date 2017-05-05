package com.greenfox.modell;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 2017. 05. 05..
 */

@Component
public class Fox {
  private String name;
  private String food;
  private String drink;
  private List<Trick> listOfTricks = new ArrayList<>();

  public Fox() {
    name = "Mr. Fox";
    food = "salad";
    drink = "water";
  }

  public int tricksNumber () {
    return listOfTricks.size();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }
}
