package com.greenfox.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Adam on 2017. 06. 02..
 */
@Entity
@Getter
@Setter
public class MealType {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO )
  private long id;
  private String mealType;

  public MealType() {
  }

  public MealType(String mealType) {
    this.mealType = mealType;
  }
}
