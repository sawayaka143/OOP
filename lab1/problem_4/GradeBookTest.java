package problem_4;

import java.util.*;

public class GradeBookTest {
    public static void main(String[] args) {
        Course course = new Course(
                "CSCI2106 Object-oriented Programming and Design",
                "Learn OOP and design principles",
                4,
                Arrays.asList("Intro to Programming")
        );

        List<Student> students = Arrays.asList(
                new Student("Arthur Morgan", 1),
                new Student("John Marston", 2),
                new Student("Rip Van Winkle", 3),
                new Student("Dutch Van der Linde", 4),
                new Student("Saddie Adler", 5)
        );

        GradeBook gradeBook = new GradeBook(course, students);
        gradeBook.displayMessage();
        gradeBook.inputGrades();
        gradeBook.displayGradeReport();
    }
}