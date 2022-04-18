package Class6;

import java.util.Arrays;

public class Array_Concept {
    public static void main(String[] args) {

        /**
         * Array: It is a non-primitive datatype.
         *
         * Array is a dataype which store multiple values of SAME datatype
         *
         */

        String var1 = "first";
        int num = 10;
        num = 11;

        String fullName = "Deepak Sharma";

        /*
            // store all student names in different variable
            String student1 = "";
            String student2 = "";
            String student3 = "";
            String student4 = "";
            String student5 = "";

            // store all student names in one variable
            String myStudents = "" "" "" "" ""


            String item1 = "";
            String item2 = "";
            String item3 = "";

            String items = "" "" ""

            String myFriends = "" , "", ""


         */

        /**
         * Things to know before creating an Array:
         * 1. what will be datatype of values that I want to store in array.
         * 2. a) Total number of values that I want to store in Array (bcz may be right now you don't know the value)
         *      OR
         *    b) all the values that I want to store in array.
         *
         * Syntax to create an array:
         * if 1 and 2a:
         *      datatype[] arrName = new datatype[totalNumber]      // will create an empty array which can store totalNumber values
         *
         * if 1 and 2b:
         *      datatype[] arrName = {value1, value2, value3, value4, value5};
         *
         */

        // String grocery-items
        // 1. String
        // 2. total number of values (10)
        // you need to create String-array which can store 10-Strings values

        // Store the name of top-5 profit making companies for 2022 (String[] which can store 5 values)
        /*
               1. String
               2a. 5
         */

        String[] top5Companies2022 = new String[5];
        // Array -> [   ,   ,   ,   ,   ]
        // Index ->   0   1   2   3   4


        top5Companies2022[0] = "BMW";
        // Array -> [ "BMW",   ,   ,   ,   ]
        // Index ->     0    1   2   3   4

        top5Companies2022[1] = "Tesla";
        // Array -> [ "BMW", "Tesla"  ,   ,   ,   ]
        // Index ->     0       1       2   3   4

        top5Companies2022[4] = "FOrd";
        // Array -> [ "BMW", "Tesla"  ,   ,   , "FOrd"]
        // Index ->     0       1       2   3     4


        top5Companies2022[2] = "Google";
        // Array -> [ "BMW", "Tesla"  , "Google"  ,   , "FOrd"]
        // Index ->     0       1           2       3     4

        top5Companies2022[3] = "Apple";
        // Array -> [ "BMW", "Tesla"  , "Google"  , "Apple"  , "FOrd"]
        // Index ->     0       1           2           3        4


        System.out.println(top5Companies2022);      // ["BMW", "Tesla"  , "Google"  , "Apple"  , "FOrd"]

        // Print the entire array
        System.out.println(Arrays.toString(top5Companies2022));

        // print the value stored at index-3 from top5Companies2022-array
        System.out.println(top5Companies2022[3]);       // top5Companies2022[3] <--> represents the value at index-3 in top5Companies2022-array


        /**
         * is Tesla the most profitable company of 2022?
         * assuming: most profitable company should be the first name in array
         *
         * is index-0-value Tesla?
         *
         */

        // what code you should write which represent index-0 value from array
        boolean isTeslaTop = top5Companies2022[0].equalsIgnoreCase("Tesla");
        System.out.println("isTeslaTop -> " + isTeslaTop);


        /**
         * Create a variable which can store score for 5 subjects
         *
         * assumption: you are aware of score and score can be in decimals as well
         *
         * 90
         * 90.4
         * 98
         * 99.9
         * 100
         */
        // 1 -> double
        // 2 -> 2b

        double[] myScore = {98, 89.4, 98, 99.9, 100};

        // find your average score
        /*
            total/number-of-values
         */
        // myScore = [x, z, s, w,r]
        /*
            myScore[0] + myScore[1]
         */

        double myTotal = myScore[0] + myScore[1] + myScore[2] + myScore[3] + myScore[4];

        int totalNum = myScore.length;

        double myAvg = myTotal/totalNum;

        System.out.println(myAvg);

        /**
         * To find the length of array (or the total number of values array can store)
         *
         * length <-- length is a VARIABLE nor method )In array)
         *
         */
        int len = myScore.length;

        System.out.println("len -> " + len);

        System.out.println(myScore[4]);     // 100 - double[] myScore = {98, 89.4, 98, 99.9, 100};

        System.out.println(myScore[5]);     // ArrayIndexOutOfBoundsException - double[] myScore = {98, 89.4, 98, 99.9, 100};

































































    }
}
