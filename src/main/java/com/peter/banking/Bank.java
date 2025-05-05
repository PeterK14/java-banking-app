package com.peter. banking; 
import java.util.HashMap;

public class Bank {
  private Map <String, Account>
  accounts = new HashMap<> ();

public void AddAccount(Stringname, double initialDeposit){
if (!
accounts.containsKey(name)){
  accounts.put(name, new 
  Account(name, initialDeposit));
}
}
  public Account getAccount(Stringname) {
    return accounts.get(name);
  }
  public void showAllAccounts() {
    for (String name : accounts.keySet()){
      Account acc = 
        accounts. get (name);
      System.out.println(name +":" + acc. getBalance ());
    }
  }
}
        
    
  
