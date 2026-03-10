package practice2;

public class problem_1 {
    private String name;
    private String id;
    private static int year;

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
        problem_1 student1 = new problem_1("Aldiyar", "24B031763");
        problem_1 student2 = new problem_1("Aldiyar", "24B031763");
        problem_1 student3 = new problem_1("Aldiyar", "24B031763");
        
        student1.incrementYear();
        student2.incrementYear();
        student3.incrementYear();

        System.out.println(student1.year);
        System.out.println(student2.year);
        System.out.println(student3.year);

        System.out.println("Student: " + student1.getName());
        System.out.println("ID: " + student1.getId());
        System.out.println("Year: " + student1.getYear());
        
        student1.incrementYear();
        System.out.println("Next Year: " + student1.getYear());
    }
}