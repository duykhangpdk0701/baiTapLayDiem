public class MyCircle {
  private MyPoint center;
  private int radius;

  public MyCircle() {
    center = new MyPoint();
    radius = 1;
  }

  public MyCircle(int x, int y, int radius) {
    this.center = new MyPoint(x, y);
    this.radius = radius;
  }

  public MyCircle(MyPoint center, int radius) {
    this.center = center;
    this.radius = radius;
  }

  public int getRadius() {
    return this.radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public MyPoint getCenter() {
    return this.center;
  }

  public int getCenterX() {
    return this.center.getX();
  }

  public void setCenterX(int x) {
    this.center.setX(x);
  }

  public int getCenterY() {
    return this.center.getY();
  }

  public void setCenterY(int y) {
    this.center.setY(y);
  }

  public int[] getCenterXY() {
    int[] arr = { this.center.getX(), this.center.getY() };
    return arr;
  }

  public void setCenterXY(int x, int y) {
    this.center.setX(x);
    this.center.setY(y);
  }

  public String toString() {
    return "MyCircle[ radius = " + this.radius + " ,center = " + center.toString() + "]";
  }

  public double getArea() {
    return this.radius * this.radius * Math.PI;
  }

  public double getCircumference() {
    return this.radius * 2 * Math.PI;
  }

  public double distance(MyCircle another) {
    return this.center.distance(another.center);
  }
}
