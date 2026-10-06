package LeapyearAss1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LeapYearBufferedReader {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter a year: ");
            String input = reader.readLine();
            int year = Integer.parseInt(input);

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer for the year.");
        }
    }
}