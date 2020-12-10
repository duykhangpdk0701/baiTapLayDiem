public class Book2 {
  private String name;
  private Author[] authors;
  private double price;
  private int qty = 0;

  public Book2(String name, Author authors[], double price) {
    this.name = name;
    this.authors = new Author[authors.length];
    this.authors = authors;
    this.price = price;
  }

  public Book2(String name, Author authors[], double price, int qty) {
    this.name = name;
    this.authors = new Author[authors.length];
    this.authors = authors;
    this.price = price;
    this.qty = qty;
  }

  public String getName() {
    return this.name;
  }

  public Author[] getAuthors() {
    return this.authors;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQty() {
    return this.qty;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }

  public String toString() {
    String temp;
    temp = "Book[name = " + this.name + " ,author = {";
    for (Author author : authors) {
      temp += author.toString() + ", ";
    }
    return temp + "}, price" + this.price + " ,qty = " + this.qty + "]";
  }

  public String getAuthorsName() {
    String temp = "";
    for (Author author : authors) {
      temp += author.name + ", ";
    }
    return temp;
  }

}
