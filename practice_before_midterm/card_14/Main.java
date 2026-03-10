package practice_before_midterm.card_14;

public class Main {
    public static void main(String[] args) {

        Drive drive = new Drive("Aldiyar");

        drive.addFile(new FileRecord("report.pdf", 1200, AccessLevel.PUBLIC));
        drive.addFile(new FileRecord("notes.txt", 800, AccessLevel.PRIVATE));
        drive.addFile(new FileRecord("report.pdf", 1200, AccessLevel.PUBLIC)); // duplicate

        drive.printFiles();
    }
}