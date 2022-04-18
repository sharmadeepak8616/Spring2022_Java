package Class13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanner_Concept {
    public static void main(String[] args) throws InputMismatchException {

        try {
            System.out.println("Starting...");

            Scanner input = new Scanner(System.in);

            System.out.println("Please enter your name:");
            String name = input.nextLine();     // takes multiple words
            System.out.println("name -> " + name);

            System.out.println("Please enter your age:");
            int age = input.nextInt();
            System.out.println("age -> " + age);

            System.out.println("Please enter your height:");
            double height = input.nextDouble();
            System.out.println("height -> " + height);

            System.out.println("Completed...");
        } catch (InputMismatchException e) {
            System.out.println("Invalid data entered. Start the registration process again.");
            // e.printStackTrace();
        }

    }
}
