package practice_before_midterm.ticket_21;

public class OnlineCourse extends Course {
  public String platform;

  public OnlineCourse(String code, String credits, String platform) {
    super(code, platform);
    this.platform = platform;
  }

  @Override
  public String toString() {
    return toString() + platform;
  }
}
