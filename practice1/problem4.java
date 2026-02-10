import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // 1. Get Inputs
            System.out.print("Enter a: ");
            double a = scanner.nextDouble();
            System.out.print("Enter b: ");
            double b = scanner.nextDouble();
            System.out.print("Enter c: ");
            double c = scanner.nextDouble();

            double D = b * b - 4 * a * c;

            if (D < 0) {
                System.out.println("Error: Discriminant is negative. No real roots.");
            } else {
                double sqrtD = Math.sqrt(D);
                double twoA = 2 * a;

                double x1 = (-b + sqrtD) / twoA;
                double x2 = (-b - sqrtD) / twoA;

                System.out.printf("Root 1: %.2f%n", x1);
                System.out.printf("Root 2: %.2f%n", x2);
            }
        }
    }
}