package Class15.Exceptions_Pkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Example {

    public static void main(String[] args) {
        /**
         * Read file (abc.txt) from Desktop
         * if file is NOT present, then read file (xyz.txt) from Desktop
         */
        try {
            File file = new File("/users/deepaksharma/Desktop/abcd.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            // code to read xyz.txt file
            try {
                File file = new File("/users/deepaksharma/Desktop/xyz.txt");
                Scanner sc = new Scanner(file);

                while (sc.hasNextLine()) {
                    System.out.println(sc.nextLine());
                }
            } catch (FileNotFoundException e1) {
                System.out.println("File abc.txt and xyz.txt both are not present");
            }
            System.out.println("Outside the inner try-catch block");
        } finally {
            System.out.println("Inside the finally section");
        }

        System.out.println("OUTSIDE THE TRY-CATCH BLOCK");


//        Scanner scanner = new Scanner(System.in);
//        int[] numbers = {11, 22, 33, 44, 55, 6, 7, 23};   // length = 5 [lastIndex = 4 ]
//        /**
//         * ask user to input the index-value.
//         * print the value at the given index
//         */
//        try {
//            System.out.println("Please enter the index-value: ");
//            int inputIndex = scanner.nextInt();
//            System.out.println(numbers[inputIndex]);    // print index-0 value from numbers-array
//        } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
//            System.out.println("pls provide index between 0-" + (numbers.length-1));
//        }
//
//        /*
//            if input is not int -> pls provide index between 0-4
//            if input is greater than lastIndex -> pls provide index between 0-4
//
//         */

        /*
            try {
                connect with db
                read the data from db
                print the data
            } catch () {
                handle any exception
            } finally {
                close db connection if any
            }
         */







    }
}
