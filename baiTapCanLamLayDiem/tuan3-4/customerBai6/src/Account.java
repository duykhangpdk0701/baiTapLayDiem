public class Account {
  int id;
  Customer customer;
  double balance;

  public Account(int id, Customer customer, double balance) {
    this.id = id;
    this.customer = customer;
    this.balance = balance;
  }

  public Account(int id, Customer customer) {
    this.id = id;
    this.customer = customer;
    this.balance = 0.0;
  }

  public int getId() {
    return id;
  }

  public Customer getCustomer() {
    return customer;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String toString() {
    return this.customer.toString() + " balance = $"
        + ((this.balance * 100 % 10 == 0) ? (this.balance + "0") : this.balance);
  }

  public String getCustomName() {
    return this.customer.getName();
  }

  public Account deposit(double amount) {
    Account a;
    a = new Account(this.id, this.customer, this.balance);
    a.balance += amount;
    return a;
  }

  public Account withdraw(double amount) {
    Account a;
    a = new Account(this.id, this.customer, this.balance);
    if (a.balance > amount) {
      a.balance -= amount;
    } else {
      System.out.println("Amount withdraw exceeds the current balance!");
    }
    return a;
  }

}
