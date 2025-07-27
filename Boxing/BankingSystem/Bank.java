package Boxing.BankingSystem;

import java.util.ArrayList;

public class Bank {
  private String name;
  private ArrayList<Branch> branches;

  public Bank(String initialNameOfBank) {
    this.name = initialNameOfBank;
    this.branches = new ArrayList<Branch>();
  }

  public boolean addBranch(String nameOfBranch) {
    if (findBranch(nameOfBranch) != null) {
      return false;
    }

    branches.add(new Branch(nameOfBranch));
    return true;
  }

  public boolean addCustomer(String nameOfBranch, String nameOfCustomer, double initialtransaction) {
    //* Finding the branch
    Branch branchFound = findBranch(nameOfBranch);

    if(branchFound != null){
      return branchFound.newCustomer(nameOfCustomer, initialtransaction);
    }

    return false;
  }

  public boolean addCustomerTransaction(String nameOfBranch, String nameOfCustomer, double transaction) {
    Branch branchFound = findBranch(nameOfBranch);

    if(branchFound != null) {
      return branchFound.addCustomerTransaction(nameOfCustomer, transaction);
    }

    return false;
  }

  public boolean listCustomers(String nameOfBranch, boolean printTransactions) {
    // * Getting the required branch
    Branch branchFound = findBranch(nameOfBranch);
    // * If branch name is found
    if (branchFound != null) {
      System.out.println("Customer details for branch " + nameOfBranch);
      // * ArrayList is going to hold all the customers for that branch
      ArrayList<Customer> branchCustomers = branchFound.getCustomers();

      for (int i = 0; i < branchCustomers.size(); i++) {
        // * Accessing the current customer
        Customer currentCustomer = branchCustomers.get(i);
        System.out.println("Customer: " + currentCustomer.getName() + "[" + (i + 1) + "]");
        // * If the boolean parameter is true
        if (printTransactions) {
          System.out.println("Transactions");
          // * ArrayList to hold all the transactions for that specific cusotomer
          ArrayList<Double> getTransactions = currentCustomer.getTransactions();
          for (int j = 0; j < getTransactions.size(); j++) {
            System.out.println("[" + (j + 1) + "]" + " Amount " + getTransactions.get(j));
          }
        }
      }
      return true;
    }
    return false;
  }

  private Branch findBranch(String nameOfBranch) {
    for (int i = 0; i < branches.size(); i++) {
      Branch foundBranch = this.branches.get(i);
      if (foundBranch.getName().equals(nameOfBranch)) {
        return foundBranch;
      }
    }

    return null;
  }

}
