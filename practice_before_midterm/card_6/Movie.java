package practice_before_midterm.card_6;

public class Movie extends Media {
  public int duration;

  public Movie (String title, int duration) {
    super(title);
    this.duration = duration;
  }

  @Override
  public void play() {
    System.out.println("Title of the Movie: " + title + ". Duration: " + duration);
  }
}
