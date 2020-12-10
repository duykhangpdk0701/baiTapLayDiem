public class MovablePoint extends Point {
  private float xSpeed;
  private float ySpeed;

  public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
    super(x, y);
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  public MovablePoint(float xSpeed, float ySpeed) {
    super();
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  public MovablePoint() {
    super();
    this.xSpeed = 0;
    this.ySpeed = 0;
  }

  public float getXSpeed() {
    return xSpeed;
  }

  public void setXSpeed(float xSpeed) {
    this.xSpeed = xSpeed;
  }

  public float getYSpeed() {
    return ySpeed;
  }

  public void setYSpeed(float ySpeed) {
    this.ySpeed = ySpeed;
  }

  public void setSpeed(float xSpeed, float ySpeed) {
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  public float[] getSpeed() {
    float[] arr = { this.xSpeed, this.ySpeed };
    return arr;
  }

  public String toString() {
    return super.toString() + " ,speed = (" + this.xSpeed + " ," + this.ySpeed + ")";
  }

  public MovablePoint move() {
    this.x += this.xSpeed;
    this.y += this.ySpeed;
    return this;
  }
}
