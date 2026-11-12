
import java.util.Scanner;

public class phpprogram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Passenger name: ");
        String name = input.nextLine();

        System.out.print("Passenger age: ");
        int age = input.nextInt();

        System.out.print("class type: ");
        String classType = input.nextLine();

        System.out.print("enter distance: ");
        double distance = input.nextDouble();

        System.out.println("enter km: ");
        double km = input.nextDouble();

        double grossPay = distance * km;

        double agePercent;
        if (age <= 6) {
            agePercent = 0;
        } else if (age >= 6 && age <= 18) {
            agePercent = 25;
        } else if (age >60) {
            agePercent = 30;
        } else {
            agePercent = 20;
        }

        double withholdingTax = age * (agePercent / 100);
        double netPay = agePercent - km;

        System.out.printf("%n--- fare details ---%n");
        System.out.printf("age: Php %.2f%n", agePercent);
        System.out.printf("distance (%.0f%%): Php %.2f%n", agePercent, withholdingTax);
        System.out.printf("km: Php %.2f%n", km);


    }}

