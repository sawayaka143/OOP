package practice_before_midterm.card_21;

import java.util.Vector;

public class Main {
  public static void main(String[] args) {
    Vector<Media> list = new Vector<>();

    list.add(new Song("Falling behind", "Laufey"));
    list.add(new Movie("Interstellar", 180));
    list.add(new Song("Falling behind", "Laufey"));

    for (Media m : list) {
      m.play();

      if (m instanceof Song) {
        Song s = (Song) m;
        System.out.println("Artist: " + s.artist);
      }
    }
  }
}