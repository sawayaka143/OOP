package practice_before_midterm.ticket_21;

public class Course {
  public String code;
  public String credits; 

  public Course(String code, String credits) {
    this.code = code;
    this.credits = credits;
  }

  @Override
  public String toString() {
    return ("Code: " + code + ". Credits: " + credits);
  }
}
