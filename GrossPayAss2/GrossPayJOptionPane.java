package GrossPayAss2;

import javax.swing.JOptionPane;


public class GrossPayJOptionPane {

    public static void main(String[] args) {

        String payRateInput = JOptionPane.showInputDialog("Enter hourly pay rate:");
        double payRate = Double.parseDouble(payRateInput);

        String hoursWorkedInput = JOptionPane.showInputDialog("Enter hours worked:");
        double hoursWorked = Double.parseDouble(hoursWorkedInput);

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

        String message = String.format(
                "Gross Pay: Php %.2f%n" +
                        "Withholding Tax (%.0f%%): Php %.2f%n" +
                        "Net Pay: Php %.2f",
                grossPay, taxRatePercent, withholdingTax, netPay
        );

        JOptionPane.showMessageDialog(null, message, "Payroll Summary", JOptionPane.INFORMATION_MESSAGE);
    }
}

