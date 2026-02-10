package practice2;

public class problem_1 {
    private String name;
    private String id;
    private int year;

    public problem_1(String name, String id) {
        this.name = name;
        this.id = id;
        this.year = 1;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public void incrementYear() {
        this.year++;
    }

    public static void main(String[] args) {
        problem_1 student = new problem_1("Aldiyar", "24B031763");
        
        System.out.println("Student: " + student.getName());
        System.out.println("ID: " + student.getId());
        System.out.println("Year: " + student.getYear());
        
        student.incrementYear();
        System.out.println("Next Year: " + student.getYear());
    }
}