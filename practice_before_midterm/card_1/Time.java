package practice_before_midterm.card_1;

public class Time {
  public int hour;
  public int minute;

  public Time (int hour, int minute) {
    this.hour = hour;
    this.minute = minute;
  }

  @Override
  public String toString() {
    return hour + ":" + minute;
  }
}
