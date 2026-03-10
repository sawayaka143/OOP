package practice_before_midterm.card_8;

import java.util.Objects;

public class Course {
  public String code;
  public int credits;

  public Course(String code, int credits) {
    this.code = code;
    this.credits = credits;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Course)) return false;
    return code.equals(((Course) o).code);   
  }

  @Override
  public int hashCode() {
    return code.hashCode();
  }

  @Override
  public String toString() {
    return code + " (" + credits + "cr)";
  }
}
