package Class13.Exceptions_Pkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception_Example {

    public static void main(String[] args) {
        /**
         * Read file (abc.txt) from Desktop
         * if file is NOT present, then read file (xyz.txt) from Desktop
         */
        try {
            File file = new File("/users/deepaksharma/Desktop/abc.txt");
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
        }
    }
}
