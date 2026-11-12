package Looping;

import java.util.Scanner;

public class Prob1_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num = scanner.nextInt();

        int highest = num;
        int lowest = num;

        for (int i = 2; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            num = scanner.nextInt();

            if (num > highest) highest = num;
            if (num < lowest) lowest = num;
        }

        System.out.println("\nHighest number: " + highest);
        System.out.println("Lowest number: " + lowest);

        scanner.close();
    }
}
