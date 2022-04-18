package Class15.Exceptions_Pkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception_Concept {

    /**
     * Exceptions : Unhandled situations
     *
     * Exception (Class) is Parent Class of ALL exceptions
     *
     * Types:
     *  1. Compile-Time Exceptions (not same as Compile Time Error)
     *      eg: InterruptedException
     *          FileNotFoundException
     *  2. Run-Time Exceptions ()
     *      eg: ArrayIndexOutOfBoundsException
     *          StringIndexOutOfBoundsException
     *
     * How to handle exceptions:
     *  1. use "throws" keyword (DO NOT USE IT)
     *  2. using try-catch block
     *
     *  Code which can throw exception(s) you put in try block.
     *  and, exception(s) will be caught in respective catch-block.
     *  (1-try-block must have at least 1-catch block
     *
     * Syntax:
     *      try {
     *          // code which
     *          // can throw exception(s)
     *      } catch (Exception-1 e) {
     *          // code to execute if Exception-1 occurs
     *      } catch (Exception-2 e) {
     *          // code to execute if Exception-2 occurs
     *      } catch (Exception-3 | Exception-4 e) {
     *          // code to execute if Exception-3 occurs
     *      }
     *
     * --> As soon as exception occurs inside the try-block
     *  java comes out from the try-block, and
     *  go inside the catch block which can catch/handle the exception
     *  and, does NOT go back in the try-block.
     *
     * finally:
     *  It's an optional block associated with try-catch block.
     *  Code in the finally block will ALWAYS execute whether exception occurs or not
     *  --> with try-catch block, there can be ONLY ONE finally.
     *
     *
     * finally vs final:
     * final:
     *      is a keyword to make a variable constant
     * finally:
     *      is a code-block which is being used with try-catch block.
     *
     *
     */


    public static void main(String[] args) {

//        String name = "Hello";
//        // print the first letter in the name-value
//        System.out.println(name.charAt(2));
//
//        int[] arr = {1, 2, 3, 4, 5};
//        try {
//            System.out.println(arr[5]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("");
//        }
//
//        System.out.println("Hello");
//
//        try {
//            Thread.sleep(200);  // InterruptedException
//        } catch (InterruptedException e) {
//            System.out.println("");
//        }
//
//        try {
//            FileInputStream fio = new FileInputStream("");
//        } catch (FileNotFoundException e) {
//            System.out.println("");
//        }
        try {
            String name = "Hello";
            // print the first letter in the name-value
            System.out.println(name.charAt(2));


            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[3]);

            System.out.println("Hello");

            Thread.sleep(200);  // InterruptedException

            FileInputStream fio = new FileInputStream("");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of range");
        } catch (InterruptedException | FileNotFoundException e) {
            System.out.println("Exception from method");
        }

        System.out.println("After my important code");


    }
}
