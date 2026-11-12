package Looping;

import java.util.Scanner;

public class Prob3_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 20000.00;

        System.out.println("Initial Balance: P" + String.format("%.2f", balance));

        while (true) {
            System.out.print("Enter amount (+ for deposit, - for withdrawal, 0 to exit): ");
            double amount = scanner.nextDouble();

            if (amount == 0) {
                System.out.println("Transaction terminated.");
                break;
            } else if (amount > 0) {
                balance += amount;
                System.out.println("Deposited P" + String.format("%.2f", amount));
            } else {
                double withdrawal = Math.abs(amount);
                if (balance >= withdrawal) {
                    balance -= withdrawal;
                    System.out.println("Withdrew P" + String.format("%.2f", withdrawal));
                } else {
                    System.out.println("INSUFFICIENT FUNDS!");
                }
            }
            System.out.println("Outstanding Balance: P" + String.format("%.2f", balance));
            System.out.println("-----------------------------------");
        }
        System.out.println("Final Balance: P" + String.format("%.2f", balance));
        scanner.close();
    }
}
