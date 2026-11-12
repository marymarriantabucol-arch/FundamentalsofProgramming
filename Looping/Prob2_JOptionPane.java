package Looping;

import javax.swing.JOptionPane;

public class Prob2_JOptionPane {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Even numbers from 2 to 100:\n\n");

        for (int i = 2; i <= 100; i += 2) {
            sb.append(i).append(" ");

            // Start a new line after every multiple of 20
            if (i % 20 == 0) {
                sb.append("\n");
            }
        }

        JOptionPane.showMessageDialog(null, sb.toString(), "Even Numbers", JOptionPane.INFORMATION_MESSAGE);
    }
}
