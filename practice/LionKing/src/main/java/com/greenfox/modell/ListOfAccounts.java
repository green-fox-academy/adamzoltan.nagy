package com.greenfox.modell;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 2017. 05. 07..
 */
public class ListOfAccounts {
  private List<BankAccount> accountList;

  public ListOfAccounts() {
    this.accountList = new ArrayList<>();
  }

  public void addAcount(BankAccount account) {
    accountList.add(account);
  }

  public BankAccount get(int i) {
    return accountList.get(i);
  }

  public List<BankAccount> getAccountList() {
    return accountList;
  }

}



