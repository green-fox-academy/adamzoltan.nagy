package com.greenfox.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Adam on 2017. 05. 31..
 */
@Entity
@Getter
@Setter
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO )
  private long id;

  private String title;
  private boolean urgent = false;
  private boolean done = false;


  public Todo() {
  }

  public Todo(String title) {
    this.title = title;
  }
}
