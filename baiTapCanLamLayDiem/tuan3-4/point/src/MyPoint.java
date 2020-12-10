/**
 * MyPoint
 */
public class MyPoint {
  private int x;
  private int y;

  public MyPoint() {
    this.x = 0;
    this.y = 0;
  }

  public MyPoint(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return this.x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return this.y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int[] getXY() {
    int[] arr = { this.x, this.y };
    return arr;
  }

  public void setXY(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public String toString() {
    return "(" + this.x + ", " + this.y + ")";
  }

  public double distance(int x, int y) {
    int a = this.x - x;
    int b = this.y - y;
    return Math.sqrt(a * a + b * b);
  }

  public double distance(MyPoint p) {
    int a = this.x - p.x;
    int b = this.y - p.y;
    return Math.sqrt(a * a + b * b);
  }

  public double distance() {
    return Math.sqrt(this.x * this.x + this.y * this.y);
  }
}