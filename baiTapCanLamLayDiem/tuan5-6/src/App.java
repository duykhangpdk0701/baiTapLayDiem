public class App {
  public static void main(String[] args) throws Exception {
    Point3D p = new Point3D(1, 2, 3);

    for (float index : p.getXZY()) {
      System.out.println(index);
    }

    Staff s = new Staff("Khang", "address", "Sai Gon", 1000);
    System.out.println(s);

    Student s1 = new Student("k", "unknown", "hello ", 2001, 1000);
    System.out.println(s1);

    MovablePoint m = new MovablePoint(1, 2, 5, 5);
    System.out.println(m.move());

    Square smallS = new Square(5, "red", true);
    System.out.println(smallS);

    Point2D p2 = new Point2D(5, 10);
    for (float item : p2.getXY()) {
      System.out.println(item);
    }
  }

}
