package Boxing.BankingSystem;

import java.util.*;

public class Branch {
  private String name;
  private ArrayList<Customer> customers;

  public Branch(String initialName) {
    this.name = initialName;
    this.customers = new ArrayList<Customer>();
  }

  public String getName() {
    return this.name;
  }

  public ArrayList<Customer> getCustomers() {
    return this.customers;
  }

  public boolean newCustomer(String nameOfCustomer, double initialTransaction) {
    if (findCustomer(nameOfCustomer) != null) {
      return false;
    }
    customers.add(new Customer(nameOfCustomer, initialTransaction));
    return true;
  }

  public boolean addCustomerTransaction(String nameOfCustomer, double transaction) {
    Customer existingCustomer = findCustomer(nameOfCustomer);

    if (existingCustomer != null) {
      existingCustomer.addTransaction(transaction);
      return true;
    }

    return false;
  }

  public Customer findCustomer(String nameOfCustomer) {
    for (int i = 0; i < this.customers.size(); i++) {
      Customer customerInList = this.customers.get(i);
      if (customerInList.getName().equals(nameOfCustomer)) {
        return customerInList;
      }
    }

    return null;
  }
}
