package CollegeScholarshipAss3;

import java.util.Scanner;

public class ScholarshipScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter monthly parents' salary: ");
        double nsatScore = scanner.nextDouble();

        System.out.print("Enter NSAT score: ");
        double parentsSalary = scanner.nextDouble();

        System.out.print("Enter entrance examination score: ");
        double entranceExamScore = scanner.nextDouble();

        double averageScore = (nsatScore + entranceExamScore) / 2.0;

        String status;

        if (parentsSalary > 10000 || nsatScore < 90 || entranceExamScore < 85) {
            status = "Rejected";
        } else if (parentsSalary <= 3500 && averageScore >= 91) {
            status = "Accepted";
        } else {
            status = "For further study";
        }

        System.out.println("Application Status: " + status);

    }
}
