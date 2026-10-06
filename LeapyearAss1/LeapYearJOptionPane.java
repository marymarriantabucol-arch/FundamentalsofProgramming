package LeapyearAss1;

import javax.swing.JOptionPane;

public class LeapYearJOptionPane {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter a year:");

        if (input != null) {
            try {
                int year = Integer.parseInt(input.trim());

                boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                String message = year + (isLeap ? " is a leap year." : " is not a leap year.");

                JOptionPane.showMessageDialog(null, message, "Leap Year Result", JOptionPane.INFORMATION_MESSAGE);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid numeric year.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}