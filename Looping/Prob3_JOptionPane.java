package Looping;

import javax.swing.JOptionPane;

public class Prob3_JOptionPane {
    public static void main(String[] args) {
        double balance = 20000.00;

        while (true) {
            String input = JOptionPane.showInputDialog(
                    null,
                    "Current Balance: P" + String.format("%.2f", balance) +
                            "\nEnter amount (Positive = Deposit, Negative = Withdrawal, 0 = Exit):",
                    "Mucho Dinero Savings",
                    JOptionPane.QUESTION_MESSAGE
            );

            if (input == null) break;

            double amount = Double.parseDouble(input.trim());

            if (amount == 0) {
                JOptionPane.showMessageDialog(null, "Transaction terminated.\nFinal Balance: P" + String.format("%.2f", balance));
                break;
            } else if (amount > 0) {
                balance += amount;
                JOptionPane.showMessageDialog(null, "Successfully deposited P" + String.format("%.2f", amount) +
                        "\nOutstanding Balance: P" + String.format("%.2f", balance));
            } else {
                double withdrawal = Math.abs(amount);
                if (balance >= withdrawal) {
                    balance -= withdrawal;
                    JOptionPane.showMessageDialog(null, "Successfully withdrew P" + String.format("%.2f", withdrawal) +
                            "\nOutstanding Balance: P" + String.format("%.2f", balance));
                } else {
                    JOptionPane.showMessageDialog(null, "INSUFFICIENT FUNDS!\nOutstanding Balance: P" + String.format("%.2f", balance),
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
}
