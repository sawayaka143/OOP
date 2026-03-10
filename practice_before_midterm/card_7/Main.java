package practice_before_midterm.card_7;

import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    HashSet<Employee> staff = new HashSet<>();

    staff.add(new Employee("E001", "Grace", 134000));
    staff.add(new Employee("E001", "Grace (Update)", 0));
  
    System.out.println("Set size: " + staff.size());
    for (Employee e : staff) {
      System.out.println(e);
    }
  }
}
