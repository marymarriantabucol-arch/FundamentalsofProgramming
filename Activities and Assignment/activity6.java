import javax.swing.*;
public class activity6 {
    public static void main(String[] args) {
        String name = "";
        name = JOptionPane.showInputDialog("Please enter your name");

        String mag = "Hello " + name;
        JOptionPane.showMessageDialog(null, mag);
    }
}
