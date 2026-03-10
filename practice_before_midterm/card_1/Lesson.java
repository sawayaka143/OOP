package practice_before_midterm.card_1;

public class Lesson {
  public Days day;
  public Time time;

  public Lesson (Days day, Time time) {
    this.day = day;
    this.time = time;
  }
  public void printLesson() {
    System.out.println(day + " " + time);
  }
}
