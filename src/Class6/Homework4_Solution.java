package Class6;

public class Homework4_Solution {
    public static void main(String[] args) {

        /**
         * Due date: Mar 13 (Sunday)
         */

        /**
         * Task -1
         * using Ternary operator assign value to int-variable
         *
         * Variable -> result1
         * if the length of sentence1-String is greater or equals to 5
         *      value in result1 should be 10
         * else
         *      value in result should be 15
         *
         * print:
         *      value of sentence1
         *      length of sentence1
         *      value of result1
         */
        String sentence1 = "hhhh";

        /**
         * Task - 2
         *
         * Create a String Variable and store your full name in it.
         * Print the following values:
         *  1. length of your full name
         *  2. check if your name ends with "a" (ignore the case)
         *  3. check if your name contains with "a" (ignore the case)
         *
         */


        /**
         *
         */
        String task3 = "View the lATesT neWs and BreAKINg news TodAy for U.S., WorLD, WeATheR";
        String valueToCheck = "kINg";
        /**
         * Print the results for:
         *  1. task3-value contains "king" (ignore cases)
         *  2. index of first occurrence of "EW" (ignore cases)
         */
        /*
            using contains() we can check if task3-value contains "king" or not
            does contains() ignore case?
         */
        task3 = task3.toLowerCase();                    // task3 = view the latest news and breaking news today for u.s., world, weather
        valueToCheck = valueToCheck.toLowerCase();      // valueToCheck = king
        boolean isContain_king = task3.contains(valueToCheck);
        System.out.println("\nisContain_king -> " + isContain_king);


        String task4 = "kINg";
        /**
         * Convert the value in task4 variable into Titlecase
         *      (FirstCharacterUppercase and rest all in lowercase)
         *
         * "kINg" -> "King"
         * "QUEEN" -> "Queen"
         */


    }
}
