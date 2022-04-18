package Class16;

import java.util.ArrayList;
import java.util.List;

public class List_ArrayList {
    public static void main(String[] args) {

        /**
         * Limitations of Array:
         *
         * 1. a) Total number of values that I want to store in Array (bcz may be right now you don't know the value)
         *      OR
         *    b) all the values that I want to store in array.
         *
         * 2. Array length is fixed, we cannot increase or decrease the length of array
         *
         * 3. Array can store only one datatype.
         *      String[] names = new String[5];     // 5 String values
         *      double[] bills = new double[3];     // 3 double values
         *
         */
        /**
         * List(I) / ArrayList(C)
         *
         * ArrayList: is a Non-primitive datatype, which can store multiple values.
         * --> List/ArrayList maintains the order of insertion.
         *
         * Syntax of create ArrayList/List:
         * ArrayList<datatypeClass> arrList = new ArrayList<>();
         *      OR
         * List<datatypeClass> myList = new ArrayList<>();
         *
         * datatypeClass/WrapperClass : class which represent the primitive datatypes.
         *      int ->  Integer
         *      double  -> Double
         *      char -> Character
         *      boolean -> Boolean
         *      String -> String
         */
        ArrayList<String> names = new ArrayList<>();

        // ArrayList to store bills
        // ArrayList<Double> myBills = new ArrayList<>();
        List<Double> myBills = new ArrayList<>();





    }
}
