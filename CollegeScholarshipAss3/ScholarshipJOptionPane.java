package CollegeScholarshipAss3;

import javax.swing.JOptionPane;

public class ScholarshipJOptionPane {
    public static void main(String[] args) {

        String nsatInput = JOptionPane.showInputDialog("Enter monthly parents' salary:");
        double nsatScore = Double.parseDouble(nsatInput);

        String salaryInput = JOptionPane.showInputDialog("Enter NSAT score:");
        double parentsSalary = Double.parseDouble(salaryInput);

        String examInput = JOptionPane.showInputDialog("Enter entrance examination score:");
        double entranceExamScore = Double.parseDouble(examInput);

        double averageScore = (nsatScore + entranceExamScore) / 2.0;

        String status;

        if (parentsSalary > 10000 || nsatScore < 90 || entranceExamScore < 85) {
            status = "Rejected";
        } else if (parentsSalary <= 3500 && averageScore >= 91) {
            status = "Accepted";
        } else {
            status = "For further study";
        }

        // Output dialog[cite: 2]
        JOptionPane.showMessageDialog(
                null,
                "Application Status: " + status,
                "Scholarship Result",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
