package Class7;

public class Homework5 {
    public static void main(String[] args) {

        // Due date: Sunday Mar 20
        /**
         * Q1:
         * Store a country name in a variable.
         * Print the name of country
         * Print the length of country name (NOTE: you CANNOT use length()-method from String class)
         *
         * Hint: you need to use split() method and length-variable (from Array)
         */
        String country = "USA";
        System.out.println("Country = " + country);
        System.out.println("Country name length = " + country.length());    // <-- CANNOT do it.

        /**
         * Q2:
         * Print the number of words in the sentence2-value
         */
        String sentence2 = "Health was Earlier said to Be the ability of the body functioning WElL.";

        /**
         * Q3:
         * Create the abbreviation for 4-word sentence
         *
         * make America great again -> MAGA
         * outfit of the day -> OOTD
         * happy birthday to you -> HBTY
         *
         * hint: split, charAt, toUppercase
         *      split, subString, toUppercase
         *
         */
        String sentence3 = "outFit OF the DAY";

        /**
         * Q4:
         * Create an int-variable and store any value in it
         * if the value is divisible by 5, print "divisible by 5"
         * if the value is divisible by 3, print "divisible by 3"
         * if the value is divisible by 5 and 3, print "divisible by 5 and 3"
         * if the value is NOT divisible by 5 and 3, print "NOT divisible by 5 and 3"
         *
         * int num = 15
         */

        /**
         * Q5:
         * Create two variables to store student-score and max-score (max score a student can get)
         * based on student percentage, print the grade:
         *
         * 91-100%      -> Grade A
         * 81-90.99%    -> Grade B
         * 71-80.99%    -> Grade C
         * 61-70.99%    -> Grade D
         * below 60.99% -> Grade E
         *
         * double studentScore = -5 (studentScore <= maxScore)
         * int maxScore = -1 (maxScore > 0)
         *
         * (studentScore/maxScore)*100 = 92.2
         *
         * Your grade = A, percentage = 92.2
         * if student-score is invalid, print "Invalid student score entered"
         * if max-score is invalid,  print "Invalid max score entered"
         *
         */

        /**
         * Q6:
         * String[] words = {"healthy", "speak", "learning", "king", "Joy", "smile", "learn", "live" , "give", "living standard", "life"}
         * print the values which has length greater than 5 and starts with l
         *
         * expected ans:
         * learning
         * living standard
         *
         */


    }
}
