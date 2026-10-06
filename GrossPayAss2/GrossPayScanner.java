package GrossPayAss2;
import java.util.Scanner;

public class GrossPayScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hourly pay rate: ");
        double payRate = scanner.nextDouble();

        System.out.print("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();

        double grossPay = payRate * hoursWorked;

        double taxRatePercent;
        if (grossPay <= 2000.00) {
            taxRatePercent = 10;
        } else if (grossPay <= 4000) {
            taxRatePercent = 12;
        } else if (grossPay <= 10000) {
            taxRatePercent = 15;
        } else {
            taxRatePercent = 20;
        }

        double withholdingTax = grossPay * (taxRatePercent / 100);
        double netPay = grossPay - withholdingTax;

        System.out.printf("%n--- PAYROLL DETAILS ---%n");
        System.out.printf("Gross Pay: Php %.2f%n", grossPay);
        System.out.printf("Withholding Tax (%.0f%%): Php %.2f%n", taxRatePercent, withholdingTax);
        System.out.printf("Net Pay: Php %.2f%n", netPay);

    }
}