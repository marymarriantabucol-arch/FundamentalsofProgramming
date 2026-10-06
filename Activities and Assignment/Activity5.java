import java.util.InputMismatchException;
import java.util.Scanner;

public class Activity5 {
    public static void main(String[] args) {
        String name;
        int age;
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter your name: ");
            name = input.nextLine();
            System.out.print("Enter your age: ");
            age = input.nextInt();
            System.out.print("Your name is " + name + " and you are " + age + " years old.");
        }catch (InputMismatchException e){
            System.out.println("Error: age must be a whole number.");
        } finally{
            input.close();
        }
    }

}
