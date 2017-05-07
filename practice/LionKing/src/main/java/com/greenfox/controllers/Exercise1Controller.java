package com.greenfox.controllers;

import com.greenfox.modell.BankAccount;
import com.greenfox.modell.ListOfAccounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
//  @Autowired
//  ListOfAccounts accountList;


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
    List<BankAccount> accounts = new ArrayList<>();

    accounts.add(simba);
    accounts.add(nala);
    accounts.add(timon);
    accounts.add(pumba);
    accounts.add(scar);

    model.addAttribute("list", accounts);

    return "index2";
  }
}
