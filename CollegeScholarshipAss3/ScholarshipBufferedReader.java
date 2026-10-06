package CollegeScholarshipAss3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ScholarshipBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter monthly parents' salary: ");
        double nsatScore = Double.parseDouble(reader.readLine());

        System.out.print("Enter NSAT score: ");
        double parentsSalary = Double.parseDouble(reader.readLine());

        System.out.print("Enter entrance examination score: ");
        double entranceExamScore = Double.parseDouble(reader.readLine());

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
