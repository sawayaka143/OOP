package practice_before_midterm.card_14;

import java.util.Objects;

public class FileRecord {

    public String name;
    public long size;
    public AccessLevel level;

    public FileRecord(String name, long size, AccessLevel level) {
        this.name = name;
        this.size = size;
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FileRecord)) return false;
        FileRecord f = (FileRecord) o;
        return size == f.size &&
               Objects.equals(name, f.name) &&
               level == f.level;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size, level);
    }

    @Override
    public String toString() {
        return name + " | " + size + " bytes | " + level;
    }
}