package lab2.Problem_1.Part_a;

public class Cube extends Shape3D {
  public double height;

  public Cube(double h) {
    this.height = h;
  }

  @Override
  public double volume() {
    return height * height * height;
  }

  @Override
  public double surfaceArea() {
    return 6 * height * height;
  }
}
