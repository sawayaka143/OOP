package problem_1;

import java.util.Scanner;


public class Analyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Data data = new Data();
        
        System.out.println("Welcome to Data Analyzer!");
        System.out.println("Enter numbers to analyze (enter 'Q' to quit and see results)");
        System.out.println();
        
        while (true) {
            System.out.print("Enter number (Q to quit): ");
            String input = scanner.nextLine().trim();
            
            if (input.equalsIgnoreCase("Q")) {
                break;
            }
            
            if (input.isEmpty()) {
                System.out.println("Error: Please enter a valid number or Q to quit.");
                continue;
            }
            
            try {
                double value = Double.parseDouble(input);
                
                if (Double.isNaN(value)) {
                    System.out.println("Error: NaN is not a valid number.");
                    continue;
                }
                if (Double.isInfinite(value)) {
                    System.out.println("Error: Infinity is not a valid number.");
                    continue;
                }
                
                data.add(value);
                
            } catch (NumberFormatException e) {
                System.out.println("Error: '" + input + "' is not a valid number. Please try again.");
            }
        }
        
        System.out.println();
        if (data.getCount() == 0) {
            System.out.println("No data was entered.");
        } else {
            System.out.println("Average = " + data.getAverage());
            System.out.println("Maximum = " + data.getMaximum());
        }
        
        scanner.close();
    }
}