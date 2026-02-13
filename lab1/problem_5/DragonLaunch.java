package problem_5;

import java.util.Vector;

public class DragonLaunch {
    private Vector<Person> line;

    public DragonLaunch() {
        line = new Vector<>();
    }

    public void kidnap(Person p) {
        line.add(p);
    }

    public boolean willDragonEatOrNot() {
        int i = 0;
        while (i < line.size() - 1) {
            if (line.get(i).getGender() == Gender.BOY &&
                line.get(i+1).getGender() == Gender.GIRL) {
                line.remove(i);   
                line.remove(i);   
                if (i > 0) i--;
            } else {
                i++;
            }
        }
        return !line.isEmpty();
    }

    public void printLine() {
        for (Person p : line) {
            System.out.print(p + " ");
        }
        System.out.println();
    }
}