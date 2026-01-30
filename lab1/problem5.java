
public class problem5 {
    public static void main(String[] args) {
        int balance = Integer.MAX_VALUE;
        double interestRate = 5.0; 
        
        double interestAmount = balance * (interestRate / 100);
        double newBalance = balance + interestAmount;
        
        System.out.println("New Balance: " + newBalance);
    }
}
