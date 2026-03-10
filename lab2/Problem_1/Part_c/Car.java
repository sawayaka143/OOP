package lab2.Problem_1.Part_c;

import java.util.Objects;

public class Car extends Vehicle {
  private int numberOfDoors;

  public Car(String make, String model, int numberOfDoors) {
    super(make, model);
    this.numberOfDoors = numberOfDoors;
  }

  public int getNumberOfDoors() {
    return numberOfDoors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    if (!super.equals(o))
      return false; 

    Car car = (Car) o;
    return numberOfDoors == car.numberOfDoors;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), numberOfDoors);
  }

  @Override
  public String toString() {
    return "Car{make='" + getMake() + "', model='" + getModel() + "', doors=" + numberOfDoors + "}";
  }
}
