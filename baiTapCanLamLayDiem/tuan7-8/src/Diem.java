import java.util.Random;

public class Diem implements Comparable<Diem> {
  private String name;
  private double diemToan;
  private double diemVan;
  private double diemTa;

  public Diem(String name) {
    Random rand = new Random();
    this.name = name;
    diemToan = rand.nextInt(10);
    diemVan = rand.nextInt(10);
    diemTa = rand.nextInt(10);
  }

  public Diem(String name, double diemToan, double diemVan, double diemTa) {
    this.name = name;
    this.diemToan = diemToan;
    this.diemVan = diemVan;
    this.diemTa = diemTa;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getDiemToan() {
    return diemToan;
  }

  public void setDiemTa(double diemTa) {
    this.diemTa = diemTa;
  }

  public double getDiemVan() {
    return diemVan;
  }

  public void setDiemVan(double diemVan) {
    this.diemVan = diemVan;
  }

  public void setDiemToan(double diemToan) {
    this.diemToan = diemToan;
  }

  public double getDiemTa() {
    return diemTa;
  }

  public double getDiemTB() {
    return (diemTa + diemToan + diemVan) / 3;
  }

  @Override
  public int compareTo(Diem o) {

    double result = getDiemTB() - o.getDiemTB();

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
    return name + "(diem toan = " + diemToan + "diem van = " + diemVan + "diem tieng anh = " + diemTa + "diem TBC = "
        + getDiemTB() + ")";
  }

}