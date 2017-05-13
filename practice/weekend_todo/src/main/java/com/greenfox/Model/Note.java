package com.greenfox.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Adam on 2017. 05. 13..
 */

@Entity
@Getter
@Setter
public class Note {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long Id;

  private String text;
  private Date date;

  public Note() {
  }

  public Note(String text) {
    this.text = text;
    this.date = new Date();
  }

  public String toString() {
    return Id + ". " + text;
  }
}
