package practice_before_midterm.card_8;

import java.util.HashSet;

public class Student {
  public String name;
  public HashSet<Course> enrolledCourse = new HashSet<>();

  public Student (String name) {
    this.name = name;
  }

  public void addCourse(Course c) {
    enrolledCourse.add(c);
  }

  @Override
  public String toString() {
    return "Student: " + name + " | Courses: " + enrolledCourse;
  }
}
