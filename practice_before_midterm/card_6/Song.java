package practice_before_midterm.card_6;

public class Song extends Media {
  public String artist;
  
  public Song(String title, String artist) {
    super(title);
    this.artist = artist;
  }


  @Override
  public void play() {
    System.out.println("Title of the Song: " + title + " by " + artist);
  }
}
