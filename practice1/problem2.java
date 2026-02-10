
import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter side a: ");
        double a = scanner.nextDouble();

        scanner.close();

        
        double area = a * a;
        double perimeter = 4 * a;
        double diagonal = a * Math.sqrt(2);
        
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);
    }
}
