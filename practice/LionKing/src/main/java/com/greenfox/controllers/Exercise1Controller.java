package com.greenfox.controllers;

import com.greenfox.modell.BankAccount;
import com.greenfox.modell.ListOfAccounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 2017. 05. 07..
 */

@Controller
public class Exercise1Controller {
  @Autowired
  BankAccount simba;

  @Autowired
  BankAccount nala;

  @Autowired
  BankAccount timon;

  @Autowired
  BankAccount pumba;

  @Autowired
  BankAccount scar;
  ArrayList<BankAccount> accounts = new ArrayList<>();

  @RequestMapping("/index1")
  public String index1(Model model) {
    model.addAttribute("name", simba.getName());
    model.addAttribute("type", simba.getAnimalType());
    model.addAttribute("balance", simba.getBalance());
    model.addAttribute("name1", nala.getName());
    model.addAttribute("type1", nala.getAnimalType());
    model.addAttribute("balance1", nala.getBalance());
    return "index1";
  }

  @RequestMapping("/index2")
  public String index2(Model model) {
    if (accounts.size() == 0) {
      accounts.add(simba);
      accounts.add(nala);
      accounts.add(timon);
      accounts.add(pumba);
      accounts.add(scar);
    }
    model.addAttribute("list", accounts);
    return "index2";
  }
@RequestMapping("/add")
  public String addZebras(@RequestParam("id") int id) {
    int increase = 10;
    int balance = accounts.get(id -1).getBalance();
    accounts.get(id - 1).setBalance(balance + increase);
    return "redirect:/index2";
}
}

