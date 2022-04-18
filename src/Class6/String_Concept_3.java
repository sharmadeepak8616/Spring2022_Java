package Class6;

import java.util.Arrays;

public class String_Concept_3 {
    public static void main(String[] args) {

        /**
         * String: is a non-primitive datatype.
         *  can store single or multiple characters
         *
         *  Value must be enclosed in double quotes while storing value in String-variable.
         *
         * --> String is a Class
         *
         */

        // String_Concept_1 -> length(), toLowercase(), toUppercase(), equals(), equalsIgnoreCase(), contains()
        // String_Concept_2 -> replace(), charAt(), indexOf(), lastIndexOf(), startsWith(), endsWith(), trim(), subString()
        // Methods discussed here -> split()

        /**
         * To split a String from a specific point into multiple Strings
         *
         * method: split()
         * return type: String[]
         *
         */
        String stmt = "Health was Earlier said to Be the ability of the body functioning WElL.";

        String[] stmt_AfterSplitBy_o = stmt.split("o");

        System.out.println("Array after split by 'o' -> " + Arrays.toString(stmt_AfterSplitBy_o));

        String[] stmt_AfterSplitBy_space = stmt.split(" ");     // when we want to divide String into every word
        System.out.println("Array after split by ' ' -> " + Arrays.toString(stmt_AfterSplitBy_space));

        // "Hello World"    ->      2
        // "I am good programmer"   ->  4
        /*
            Write code to count words in a String

            1. split by space (you will get result in String[])
            2. find the of String[]

            "Hello World"
            String[] -> ["Hello", "World"]  (2)


            "I am good programmer"
            String[] -> ["I", "am", "good", "programmer"] -> 4

            "Hello"
            String[] -> ["Hello"] -> 1

         */

        String[] stmt_AfterSplitBy_Nothing = stmt.split("");
        // "H", "e", "a", "l", "t", "h", " ", "w", "a"
        System.out.println("Array after split by '' -> " + Arrays.toString(stmt_AfterSplitBy_Nothing));





































    }
}
