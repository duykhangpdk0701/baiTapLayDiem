public class App {
  public static void main(String[] args) throws Exception {
    Author person1 = new Author("khang", "duykhangpdk0701@gmail.com", 'm');
    Author person2 = new Author("phong", "hello@gmail.com", 'm');
    Author[] arr = { person1, person2 };
    Book b = new Book("abc", person1, 1000);
    Book2 b2 = new Book2("name", arr, 1000);
    System.out.println(person2.email);
    System.out.println(b.toString());
    System.out.println(b2.toString());
  }
}
