public class Point3D extends Point2D {
  private float z;

  public Point3D(float x, float y, float z) {
    super(x, y);
    this.z = z;
  }

  public Point3D() {
    super();
    this.z = 0;
  }

  public float getZ() {
    return z;
  }

  public void setZ(float z) {
    this.z = z;
  }

  public void setXZY(float x, float y, float z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public float[] getXZY() {
    float[] arr = { this.x, this.y, this.z };
    return arr;
  }

  public String toString() {
    return "(" + getX() + " ," + getY() + " ," + getZ() + ")";
  }

}
