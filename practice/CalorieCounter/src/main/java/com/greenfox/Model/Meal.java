package com.greenfox.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Date;

/**
 * Created by Adam on 2017. 06. 02..
 */
@Entity
@Getter
@Setter
public class Meal {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO )
  private long id;
  private LocalDate date;
  private String type;
  private String description;
  private double calories;

  public Meal() {
  }

  public Meal(String type, String description, double calories) {
    date = LocalDate.now();
    this.type = type;
    this.description = description;
    this.calories = calories;
  }
}
