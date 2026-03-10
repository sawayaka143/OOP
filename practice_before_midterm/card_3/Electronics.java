package practice_before_midterm.card_3;

public class Electronics extends Asset{
  public String brand;

  public Electronics (String brand, String serialNumber, double value) {
    super(serialNumber, value);
    this.brand = brand;
  }
}
