package JediAcademyAss4;

import java.util.Scanner;

public class JediAcademyScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter height (in cm): ");
        double height = scanner.nextDouble();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter citizenship code ('C' for citizen, 'N' for non-citizen): ");
        char citizenship = scanner.next().toUpperCase().charAt(0);

        System.out.print("Enter recommendee code ('R' for recommendee, 'N' for non-recommendee): ");
        char recommendee = scanner.next().toUpperCase().charAt(0);

        if (recommendee == 'R' || (height >= 200 && age >= 21 && age <= 25 && citizenship == 'C')) {
            System.out.println("Result: Accepted");
        } else {
            System.out.println("Result: Rejected");
        }

    }
}
