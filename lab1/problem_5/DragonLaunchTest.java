package problem_5;

public class DragonLaunchTest {
    public static void main(String[] args) {
        DragonLaunch launch = new DragonLaunch();

        launch.kidnap(new Person(Gender.BOY, "B1"));
        launch.kidnap(new Person(Gender.BOY, "B2"));
        launch.kidnap(new Person(Gender.GIRL, "G1"));
        launch.kidnap(new Person(Gender.GIRL, "G2"));

        System.out.println("Initial line:");
        launch.printLine();

        boolean result = launch.willDragonEatOrNot();
        System.out.println("Will dragon eat? " + result);
        System.out.println("Remaining line:");
        launch.printLine();

        DragonLaunch launch2 = new DragonLaunch();
        launch2.kidnap(new Person(Gender.GIRL, "G1"));
        launch2.kidnap(new Person(Gender.BOY, "B1"));
        launch2.kidnap(new Person(Gender.GIRL, "G2"));
        launch2.kidnap(new Person(Gender.BOY, "B2"));

        System.out.println("\nInitial line:");
        launch2.printLine();

        boolean result2 = launch2.willDragonEatOrNot();
        System.out.println("Will dragon eat? " + result2);
        System.out.println("Remaining line:");
        launch2.printLine();
    }
}
