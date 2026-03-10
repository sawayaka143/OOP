package lab2.Problem_1.Part_c;

import java.util.HashSet;
import java.util.Set;

public class Test {
  public static void main(String[] args) {
    Set<Vehicle> vehicleSet = new HashSet<>();

    Vehicle v1 = new Vehicle("Toyota", "Camry");
    Vehicle v2 = new Vehicle("Toyota", "Camry"); 

    Car c1 = new Car("Honda", "Civic", 4);
    Car c2 = new Car("Honda", "Civic", 4);
    Car c3 = new Car("Honda", "Civic", 2);

    vehicleSet.add(v1);
    vehicleSet.add(v2);
    vehicleSet.add(c1);
    vehicleSet.add(c2);
    vehicleSet.add(c3);

    System.out.println("Expected size: 3 | Actual size: " + vehicleSet.size());

    for (Vehicle v : vehicleSet) {
      System.out.println(v.toString());
    }
  }
}
