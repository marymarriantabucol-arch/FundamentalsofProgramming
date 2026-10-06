package JediAcademyAss4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class JediAcademyBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter height (in cm): ");
        double height = Double.parseDouble(reader.readLine());

        System.out.print("Enter age: ");
        int age = Integer.parseInt(reader.readLine());

        System.out.print("Enter citizenship code ('C' for citizen, 'N' for non-citizen): ");
        char citizenship = reader.readLine().trim().toUpperCase().charAt(0);

        System.out.print("Enter recommendee code ('R' for recommendee, 'N' for non-recommendee): ");
        char recommendee = reader.readLine().trim().toUpperCase().charAt(0);

        if (recommendee == 'R' || (height >= 200 && age >= 21 && age <= 25 && citizenship == 'C')) {
            System.out.println("Result: Accepted");
        } else {
            System.out.println("Result: Rejected");
        }
    }
}
