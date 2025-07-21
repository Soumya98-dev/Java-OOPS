package Boxing.BankingSystem;

import java.util.*;

public class Customer {
  private String name;
  private ArrayList<Double> transactions;

  public Customer(String initialName, double initialTransactions) {
    this.name = initialName;
    this.transactions = new ArrayList<Double>();
    addTransaction(initialTransactions);
  }

  public String getName() {
    return this.name;
  }

  public ArrayList<Double> getTransactions() {
    return this.transactions;
  }

  public void addTransaction(double transaction) {
    transactions.add(transaction);
  }

}
