package lab2.Problem_1.Part_c;

import java.util.Objects;

public class Vehicle {
  private String make;
  private String model;

  public Vehicle(String make, String model) {
    this.make = make;
    this.model = model;
  }

  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;

    Vehicle vehicle = (Vehicle) o;
    return Objects.equals(make, vehicle.make) &&
        Objects.equals(model, vehicle.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(make, model);
  }

  @Override
  public String toString() {
    return "Vehicle{make='" + make + "', model='" + model + "'}";
  }
}