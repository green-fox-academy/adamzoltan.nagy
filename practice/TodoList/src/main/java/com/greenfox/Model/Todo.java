package com.greenfox.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Adam on 2017. 05. 12..
 */

@Entity
@Table (name = "Todos")
@Getter
@Setter
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String title;
  private boolean urgent;
  private boolean done;

  public Todo() {

  }

  public Todo(String title) {
    this.title = title;
    this.urgent = false;
    this.done = false;
  }
}
