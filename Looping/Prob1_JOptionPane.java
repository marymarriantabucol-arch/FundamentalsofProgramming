package Looping;

import javax.swing.JOptionPane;

public class Prob1_JOptionPane {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter number 1 of 10:");
        if (input == null) return;
        int num = Integer.parseInt(input.trim());

        int highest = num;
        int lowest = num;

        for (int i = 2; i <= 10; i++) {
            input = JOptionPane.showInputDialog("Enter number " + i + " of 10:");
            if (input == null) return;
            num = Integer.parseInt(input.trim());

            if (num > highest) highest = num;
            if (num < lowest) lowest = num;
        }

        JOptionPane.showMessageDialog(null,
                "Highest number: " + highest + "\nLowest number: " + lowest,
                "Results", JOptionPane.INFORMATION_MESSAGE);
    }
}