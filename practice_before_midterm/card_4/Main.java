package practice_before_midterm.card_4;

public class Main {
  public static void main(String[] args) {
    Car car1 = new Car("Sedan", new Engine(150));
    Car car2 = new Car(car1);

    car1.getEngine().horsepower = 300;

    System.out.println("Car 1: " + car1);
    System.out.println("Car 2: " + car2);
  }
}
