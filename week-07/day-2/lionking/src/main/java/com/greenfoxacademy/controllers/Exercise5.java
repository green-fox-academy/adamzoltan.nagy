package com.greenfoxacademy.controllers;

import com.greenfoxacademy.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 2017. 05. 03..
 */
@Controller
public class Exercise5 {

  @RequestMapping("/5")
  public String accountList(Model model ) {
    List<BankAccount> accounts = new ArrayList<>();

    BankAccount symba = new BankAccount("Symba", 2000, "lion");
    BankAccount timon = new BankAccount("Timon", 1500, "meerkat");
    BankAccount pumba = new BankAccount("Pumba", 500, "warthog");
    BankAccount rafiki = new BankAccount("Rafiki", 2000, "mandrill");
    BankAccount zazu = new BankAccount("Zazu", 2500, "hornbill");

    accounts.add(symba);
    accounts.add(timon);
    accounts.add(pumba);
    accounts.add(rafiki);
    accounts.add(zazu);

    model.addAttribute("accounts", accounts);
    return "index5";
  }

}
