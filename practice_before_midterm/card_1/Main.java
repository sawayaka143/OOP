package practice_before_midterm.card_1;

public class Main {
  public static void main(String[] args) {
    Time t = new Time(14, 30);
    Lesson oop = new Lesson(Days.FRIDAY, t);
    
    oop.printLesson();
  }
}
