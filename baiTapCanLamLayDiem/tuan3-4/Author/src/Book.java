public class Book {
  private String name;
  private Author author;
  private int qty;
  private double price;

  public Book(String name, Author author, double price) {
    this.name = name;
    this.author = author;
    this.price = price;
    this.qty = 0;
  }

  public Book(String name, Author author, double price, int qty) {
    this.name = name;
    this.author = author;
    this.price = price;
    this.qty = qty;
  }

  public String getName() {
    return name;
  }

  public Author getAuthor() {
    return author;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQty() {
    return qty;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }

  public String toString() {
    return "Book[name = " + this.name + ", " + this.author.toString() + ", price = " + this.price + " ,qty = "
        + this.qty + "]";
  }
}
