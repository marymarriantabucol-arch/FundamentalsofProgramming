package GrossPayAss2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GrossPayBufferedReader {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter hourly pay rate: ");
        double payRate = Double.parseDouble(reader.readLine());

        System.out.print("Enter hours worked: ");
        double hoursWorked = Double.parseDouble(reader.readLine());

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

        // Calculate Withholding Tax and Net Pay[cite: 1]
        double withholdingTax = grossPay * (taxRatePercent / 100);
        double netPay = grossPay - withholdingTax;

        System.out.printf("%n--- PAYROLL DETAILS ---%n");
        System.out.printf("Gross Pay: Php %.2f%n", grossPay);
        System.out.printf("Withholding Tax (%.0f%%): Php %.2f%n", taxRatePercent, withholdingTax);
        System.out.printf("Net Pay: Php %.2f%n", netPay);
    }
}
