package Class19;

import java.util.*;

public class Homework10_Solution {
    public static void main(String[] args) {
    }

        // Due Date -> Apr 12
        /**
         * Question-1:
         * Create a method that can return if a given-String-Array has duplicate values or not.
         *
         * Input: String-Array
         * Return type: boolean
         *
         *
         *
         * create String-List using given-String-Array
         * create a String-Set using String-List
         * compare size of Set and List
         */

        // String[] words = {"peace", "grow", "joy", "lauGh", "happy", "laugh", "joy", "happy"};
        public static boolean isArrayHasDuplicates(String[] inputArray) {
            // boolean isArrayDup = false;     // assuming inputArray has no duplicate values


            // First convert to String to List
            List<String> names = new ArrayList<>(Arrays.asList(inputArray));
            System.out.println(names.size());
            // Now List convert to Set
            Set<String> setNames = new HashSet<>(names);

            int arrayLength = inputArray.length; // Array Length
            int setNamesSize = setNames.size(); // Set Length
            // Now compare both length
//            if (arrayLength >= setNamesSize) {
//                System.out.println("Duplicate values present in given Array");
//
//            } else {
//                System.out.println("No duplicate values present in given Array");
//
//            }

            // isArrayDup = arrayLength == setNamesSize;
            return arrayLength == setNamesSize;
        }








        /**
         * Question-2:
         * Create a method that would return the duplicate values of given-String-array (ignore the case)
         *
         * Input: String-Array
         * Return type:     (one of these -> Array, List, Set)
         *
         *
         * String[] names = {"abc" , "abc" , "DEF", "ABC", XYZ", "def"}
         *
         * "abc", "def"
         */















}
