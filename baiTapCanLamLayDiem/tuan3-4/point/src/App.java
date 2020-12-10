public class App {
  public static void main(String[] args) throws Exception {
    MyPoint p = new MyPoint(10, 5);
    MyPoint p2 = new MyPoint(-15, 20);
    MyPoint p3 = new MyPoint(-5, -20);
    int[] arr = p.getXY();

    for (int index : arr) {
      System.out.println(index);
    }
    System.out.println(p.toString());

    MyCircle c = new MyCircle(10, 5, 2);
    MyCircle c2 = new MyCircle(15, 10, 2);
    // System.out.println(c.distance(c2));

    MyTriangle t = new MyTriangle(p, p2, p3);
    // System.out.println(t.getPerimeter());
    // System.out.println(t.getType());
  }
}
