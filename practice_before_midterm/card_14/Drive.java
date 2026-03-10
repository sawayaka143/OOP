package practice_before_midterm.card_14;

import java.util.HashSet;

public class Drive {

    public String ownerName;
    private HashSet<FileRecord> files;

    public Drive(String ownerName) {
        this.ownerName = ownerName;
        this.files = new HashSet<>();
    }

    public void addFile(FileRecord file) {
        files.add(file);
    }

    public void printFiles() {
        System.out.println("Drive owner: " + ownerName);

        for (FileRecord f : files) {
            System.out.println(f);
        }
    }
}