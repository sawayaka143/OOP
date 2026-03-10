package practice_before_midterm.card_4;

public class Engine {
  public int horsepower;
  public Engine (int horsepower) {
    this.horsepower = horsepower;
  }
  public Engine(Engine other) {
    this.horsepower = other.horsepower;
  }

  @Override
  public String toString() {
    return ("Horsepower: " + horsepower);
  }
}
