package com.greenfox.controllers;

import com.greenfox.modell.BankAccount;
import com.greenfox.modell.ListOfAccounts;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Adam on 2017. 05. 07..
 */
@Configuration
public class BankAccountController {

  @Bean("simba")
  public BankAccount simbaAccount() {
    return new BankAccount("Simba", "lion", 2000, true, true);
  }

  @Bean("nala")
  public BankAccount nalaAccount() {
    return new BankAccount("Nala", "lion", 2500, false, true);
  }

  @Bean("timon")
  public BankAccount timonAccount() {
    return new BankAccount("Timon", "meerkat", 1000, false, true);
  }

  @Bean("pumba")
  public BankAccount pumbaAccount() {
    return new BankAccount("Pumba", "warthog", 1500, false, true);
  }

  @Bean("scar")
  public BankAccount scarAccount() {
    return new BankAccount("Scar", "lion", 500, false, false);
  }

//  @Bean("accountList")
//  public ListOfAccounts newAccount() {
//    return new ListOfAccounts();
//  }
}
