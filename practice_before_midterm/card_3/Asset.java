package practice_before_midterm.card_3;

public abstract class Asset {
  public String serialNumber;
  public double value;

  public Asset (String serialNumber, double value) {
    this.serialNumber = serialNumber;
    this.value = value;
  }
}