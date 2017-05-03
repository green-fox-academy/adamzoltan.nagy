package com.greenfoxacademy.controllers;

import com.greenfoxacademy.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Adam on 2017. 05. 03..
 */

@Controller
public class Exercise1 {

  @RequestMapping("/")
  public String  bankAccount(Model model) {
    BankAccount account1 = new BankAccount("Symba", 2000, "lion");
    model.addAttribute("name",account1.getName());
    model.addAttribute("balance",account1.getBalance());
    model.addAttribute("type",account1.getAnimalType());
    return "index";
  }
}
