package JediAcademyAss4;

import javax.swing.JOptionPane;

public class JediAcademyJOptionPane {
    public static void main(String[] args) {

        String heightInput = JOptionPane.showInputDialog("Enter height (in cm):");
        double height = Double.parseDouble(heightInput);

        String ageInput = JOptionPane.showInputDialog("Enter age:");
        int age = Integer.parseInt(ageInput);

        String citizenshipInput = JOptionPane.showInputDialog("Enter citizenship code ('C' for citizen, 'N' for non-citizen):");
        char citizenship = citizenshipInput.toUpperCase().charAt(0);

        String recommendeeInput = JOptionPane.showInputDialog("Enter recommendee code ('R' for recommendee, 'N' for non-recommendee):");
        char recommendee = recommendeeInput.toUpperCase().charAt(0);

        String result;
        if (recommendee == 'R' || (height >= 200 && age >= 21 && age <= 25 && citizenship == 'C')) {
            result = "Accepted";
        } else {
            result = "Rejected";
        }

        JOptionPane.showMessageDialog(
                null,
                "Application Result: " + result,
                "Jedi Knight Military Academy",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
