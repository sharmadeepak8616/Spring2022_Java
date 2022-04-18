package Class8;

public class Homework5_Solution {
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
        String sentence3 = "make America great again";

        /*
            MAGA
            1C1W 1C2W 1C3W 1C4W

            sentence3 -> split(" ") -> String[] words = ["make", "America", "great", "again"]

            sout(words[0].toUppercase() -> subString(0,1)); -> M
            words[0].toUppercase() -> charAt(0) -> M

            sout(words[1].toUppercase() -> subString(0,1)) -> A

            sout(words[2].toUppercase() -> subString(0,1)) -> G

            sout(words[3].toUppercase() -> subString(0,1)) -> A


         */



    }
}
