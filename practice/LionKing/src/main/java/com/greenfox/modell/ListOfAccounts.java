package com.greenfox.modell;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 2017. 05. 07..
 */
public class ListOfAccounts {
  private List<BankAccount> accountList;

  public ListOfAccounts() {
    accountList = new ArrayList<>();
  }

  public void addAcount(BankAccount account) {
    accountList.add(account);
  }

  public List<BankAccount> getAccountList() {
    return accountList;
  }

  public void setAccountList(List<BankAccount> accountList) {
    this.accountList = accountList;
  }
}
