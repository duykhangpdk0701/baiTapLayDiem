public class Square extends Rectangle {
  public Square() {
    super();
  }

  public Square(double site) {
    super(site, site);
  }

  public Square(double site, String color, boolean filled) {
    super(site, site, color, filled);
  }

  public double getSite() {
    return getWidth();
  }

  public void setSite(double site) {
    setWidth(site);
    setLength(site);
  }

  // !not complete yet
  @Override
  public void setWidth(double width) {
    super.setWidth(width);
  }

  // !not complete yet
  @Override
  public void setLength(double length) {
    super.setLength(length);
  }

  @Override
  public String toString() {
    return "Square[" + super.toString() + "]";
  }
}
