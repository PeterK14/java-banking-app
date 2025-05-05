package com.peter.banking;
public class Account {
  private String ownerName;
  private double balance;

public Accounts(String OwnerName, 
  double balance){
  this.ownerName = ownerName;
  this.balance = balance;
}
  public void withdraw (double amount) {
    if (amount<= balance) { 
    balance -= amount;
    }
  }
  public double getBalance () {
    return balance;
  }
  public String getOwnerName(){
    return ownerNamne;
  }
}
