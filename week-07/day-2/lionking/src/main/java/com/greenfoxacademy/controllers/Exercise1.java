package com.greenfoxacademy.controllers;

import com.greenfoxacademy.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Adam on 2017. 05. 03..
 */

@Controller
public class Exercise1 {

  @RequestMapping("/")
  public String  bankAccount(Model model) {
    BankAccount Symba = new BankAccount("Symba", 2000, "lion");
    model.addAttribute("account",Symba);
    return "index";
  }
}
