package practice_before_midterm.card_21;

public class Song extends Media{
  public String artist;
  
  public Song (String title, String artist) {
    super(title);
    this.artist = artist;
  }

  @Override
  public void play() {
    System.out.println("Playing song by " + artist);
  }
}
