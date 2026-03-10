package practice_before_midterm.card_4;

public class Car {
  public String model;
  public Engine engine;

  public Car (String model, Engine engine) {
    this.model = model;
    this.engine = engine;  
  }
  
  public Car(Car other) {
    this.model = other.model;
    this.engine = new Engine(other.engine);
  }

  public Engine getEngine() {
    return engine;
  }

  @Override
  public String toString() {
    return ("Model: " + model + " | Engine: " + engine);
  }
}
