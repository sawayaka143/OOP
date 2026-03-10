package practice_before_midterm.card_7;

import java.util.Objects;

public class Employee {
  public String id;
  public String name;
  public double salary;

  public Employee(String id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Employee employee = (Employee) obj;
    return Objects.equals(id, employee.id);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(id);
  }

  @Override
  public String toString() {
    return String.format("ID: %s, Name: %s, Salary: $%.2f", id, name, salary);
  }
}