import java.util.Scanner;
public class fixedDepositeNIB
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueCalculation = 'y';
        while (continueCalculation == 'y' || continueCalculation == 'Y') {
            System.out.print("========");
            System.out.print("Enter principal amount (minimum Rs. 1000): ");
            double P = scanner.nextDouble();
            System.out.print("Enter annual interest rate (8%-12%): ");
            double annualRate = scanner.nextDouble();
            System.out.print("Enter duration in years (maximum 5 years): ");
            int years = scanner.nextInt();
            double monthlyRate = (annualRate / 100) / 12;
            int months = years * 12;
            double A = P * Math.pow(1 + monthlyRate, months);
            double feeRate = 0.005;
            double fee = A * feeRate;
            double finalAmount = A - fee;
            System.out.print("========");
            System.out.println("\n= Fixed Deposit Details =");
            System.out.println("Principal Amount: "+P);
            System.out.println("Annual Interest Rate: "+annualRate);
            System.out.println("Monthly Interest Rate: "+monthlyRate * 100);
            System.out.println("Duration: "+years);
            System.out.println("Maturity Amount: "+A);
            System.out.println("Processing Fee: "+fee);
            System.out.println("Final Amount: "+finalAmount);
            System.out.println();
            System.out.println("Do you wish to calculate another FD? (y/n): ");
            continueCalculation = scanner.next().charAt(0);
            System.out.println();
            System.out.print("========");
        }
       
        System.out.println("we appreciate you for using Nepal Investment Bank FD Calculator!");
        scanner.close();
    }
}