package practice_before_midterm.card_6;

public class Media {
  public String title;
  
  public Media(String title) {
    this.title = title;
  }

  public void play() {
    System.out.printf("Playing media: %s title", title);
  }
}
