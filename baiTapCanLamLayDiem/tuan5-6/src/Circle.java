public class Circle {
  protected double radius;
  protected String color;

  public Circle() {
    this.radius = 0;
    this.color = "red";
  }

  public Circle(double radius) {
    this.radius = radius;
    this.color = "red";
  }

  public Circle(double radius, String color) {
    this.radius = radius;
    this.color = color;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getArea() {
    return radius * radius * Math.PI;
  }

  public String toString() {
    return "Circle[radius = " + this.radius + " ,color = " + this.color + "]";
  }
}
