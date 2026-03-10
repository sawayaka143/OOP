package practice_before_midterm.card_3;

public class Vehicle extends Asset implements Taxable {
  public int year;

  public Vehicle (int year, String serialNumber, double value) {
    super(serialNumber, value);
    this.year = year;
  }

  @Override
  public double calculateTax() {
    return (year > 2020) ? (value * 0.10) : (value * 0.05);
  }
}
