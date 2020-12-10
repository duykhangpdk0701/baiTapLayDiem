public class App {
  public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");
    Customer c1 = new Customer(100, "khang", 'm');
    Account a1 = new Account(100, c1, 1234.11);

    System.out.println(a1.toString());
  }
}
