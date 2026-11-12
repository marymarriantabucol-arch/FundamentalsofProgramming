package Looping;

public class Prob2_Scanner {
    public static void main(String[] args) {
        System.out.println("Even numbers from 2 to 100:");

        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");

            // Start a new line after 20, 40, 60, and 80
            if (i % 20 == 0) {
                System.out.println();
            }
        }
    }
}
