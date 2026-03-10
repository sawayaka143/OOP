package practice_before_midterm.card_21;

public class Movie extends Media {
  public int duration;

  public Movie (String title, int duration) {
    super(title);
    this.duration = duration;
  }

  @Override 
  public void play() {
    System.out.println("Playing movie: " + title + ". Duration: " + duration);
  }
}
