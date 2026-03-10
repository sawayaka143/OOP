package practice_before_midterm.card_6;

import java.util.Vector;

public class Main {
  public static void main(String[] args) {
    Vector<Media> list = new Vector<>();

    list.add(new Song("Falling Behind", "Laufey"));
    list.add(new Song("Valentine", "Laufey"));
    list.add(new Movie("Zootopia", 110));

    for (Media el : list) {
      el.play();

      if (el instanceof Song) {
        Song s = (Song) el;
        System.out.println("Artist: " + s.artist);
      }
    }
  }
}
