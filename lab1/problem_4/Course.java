package problem_4;

import java.util.List;

public class Course {
    private String name;
    private String description;
    private int credits;
    private List<String> prerequisites;

    public Course(String name, String description, int credits, List<String> prerequisites) {
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisites = prerequisites;
    }

    @Override
    public String toString() {
        return name + " (" + credits + " credits) - " + description +
               (prerequisites.isEmpty() ? "" : " Prerequisites: " + prerequisites);
    }
}
