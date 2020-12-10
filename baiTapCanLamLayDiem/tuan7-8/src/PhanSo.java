import java.util.Random;

public class PhanSo implements Comparable<PhanSo> {

  private double tu;
  private double mau;

  public PhanSo() {
    Random rand = new Random();
    tu = rand.nextInt(10);
    mau = rand.nextInt(10);
  }

  public PhanSo(double tu, double mau) {
    this.tu = tu;
    this.mau = mau;
  }

  public double getTu() {
    return tu;
  }

  public double getMau() {
    return mau;
  }

  public void setMau(double mau) {
    this.mau = mau;
  }

  public void setTu(double tu) {
    this.tu = tu;
  }

  @Override
  public int compareTo(PhanSo other) {
    double result = (tu / mau) - (other.tu / other.mau);

    if (result > 0) {
      return 1;
    } else if (result == 0) {
      return 0;
    } else {
      return -1;
    }

  }

  @Override
  public String toString() {
    return tu + "/" + mau;
  }

}
