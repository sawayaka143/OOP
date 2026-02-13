package problem_4;

import java.util.*;

public class GradeBook {
    private Course course;
    private List<Student> students;
    private Map<Student, Integer> grades;

    public GradeBook(Course course, List<Student> students) {
        this.course = course;
        this.students = students;
        this.grades = new HashMap<>();
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course);
    }

    public void inputGrades() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input grades for students:");
        for (Student student : students) {
            System.out.print(student.getName() + ": ");
            int grade = scanner.nextInt();
            grades.put(student, grade);
        }
        scanner.close();
    }

    public double determineClassAverage() {
        if (grades.isEmpty()) return 0;
        int sum = 0;
        for (int grade : grades.values()) sum += grade;
        return (double) sum / grades.size();
    }

    public Student getHighestGradeStudent() {
        return Collections.max(grades.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public Student getLowestGradeStudent() {
        return Collections.min(grades.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public int getGrade(Student student) {
        return grades.getOrDefault(student, 0);
    }

    public void outputBarChart() {
        int[] ranges = new int[11]; 
        for (int grade : grades.values()) {
            int index = grade == 100 ? 10 : grade / 10;
            ranges[index]++;
        }

        System.out.println("Grades distribution:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%02d-%02d: ", i*10, i*10+9);
            for (int j = 0; j < ranges[i]; j++) System.out.print("*");
            System.out.println();
        }
        System.out.print("100: ");
        for (int j = 0; j < ranges[10]; j++) System.out.print("*");
        System.out.println();
    }

    public void outputLetterGrades() {
        Map<Character, Integer> counts = new HashMap<>();
        for (int grade : grades.values()) {
            char letter = getLetterGrade(grade);
            counts.put(letter, counts.getOrDefault(letter, 0) + 1);
        }
        System.out.println("Letter grades distribution:");
        for (char letter : Arrays.asList('A','B','C','D','F')) {
            System.out.println(letter + ": " + counts.getOrDefault(letter,0));
        }
    }

    private char getLetterGrade(int grade) {
        if (grade >= 90) return 'A';
        if (grade >= 80) return 'B';
        if (grade >= 70) return 'C';
        if (grade >= 60) return 'D';
        return 'F';
    }

    // ===== GRADE REPORT =====
    public void displayGradeReport() {
        System.out.printf("Class average is %.2f%n", determineClassAverage());
        Student high = getHighestGradeStudent();
        Student low = getLowestGradeStudent();
        System.out.println("Highest grade is " + getGrade(high) + " (" + high + ")");
        System.out.println("Lowest grade is " + getGrade(low) + " (" + low + ")");
        outputBarChart();
        outputLetterGrades();
    }
}
