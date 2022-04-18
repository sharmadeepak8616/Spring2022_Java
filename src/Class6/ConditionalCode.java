package Class6;

public class ConditionalCode {
    public static void main(String[] args) {


        /**
         *
         * if it's going to rain today
         *      taking umbrella
         *
         *
         * if day is weekday AND it's my day to go office
         *      get ready to go to office
         *      get coffee
         * else if day is weekday
         *      get ready with casuals
         *      get coffee
         * else
         *      get ready to go to beach
         */

        /**
         * Conditional Code (Conditional Block/Loop)
         *
         * 1. if-else block
         * 2. switch block
         *
         * When we have different actions to do (code to execute) depending upon conditions
         */

        /**
         * Syntax:
         *
         * if (condition(s)) {
         *      // if block
         *      // code inside if-block will execute only if-condition(s) are true
         * }
         */

        String country = "United states of AMERICa";
        // print the country name if name has length greater than 10
        /*
            if the country-length is greater than 10
                print the country name
         */
        System.out.println(" --- if block ---");
        if (country.length() > 10) {
            System.out.println(country);
        }


        // print the country name if name has length greater than 10 otherwise print "Country name is not eligible to print"
        /*
            if the country-length is greater than 10
                print the country name
            else
                "Country name is not eligible to print"
         */
        System.out.println("\n --- if-else block ---");

        /**
         * Syntax:
         *
         * if (condition(s)) {
         *      // if block
         *      // code inside if-block will execute only if-block-condition(s) are true
         * } else {
         *      // else block
         *      // code inside will execute only when all if-block-condition(s) are false
         * }
         */

        if (country.length() > 10) {
            System.out.println(country);
        } else {
            System.out.println("Country name is not eligible to print");
        }



        // print the country name if name has length greater than 10,
        // if the name contains 'states' print country name is All uppercase
        // otherwise print "Country name is not eligible to print"


        System.out.println("\n -- if elseif else else block");
        /**
         * Syntax:
         *
         * if (condition(s)) {
         *      // if block
         *      // code inside if-block will execute only if-block-condition(s) are true
         * } else if (condition(s)) {
         *      // else if block
         *      // code inside else-if-block will execute only else-if-block-condition(s) are true
         * } else if (condition(s)) {
         *      // else if block
         *      // code inside else-if-block will execute only else-if-block-condition(s) are true
         * } else if (condition(s)) {
         *      // else if block
         *      // code inside else-if-block will execute only else-if-block-condition(s) are true
         * } else {
         *      // else block
         *      // code inside will execute only when all if-block-condition(s) are false
         * }
         */


        /*
            if the country-length is greater than 10
                print the country name
            else if country contains 'states'
                print country name is All uppercase
            else
                "Country name is not eligible to print"
         */

        if (country.length() > 10) {
            System.out.println(country);
        } else if (country.toLowerCase().contains("states")) {
            System.out.println(country.toUpperCase());
        } else {
            System.out.println("Country name is not eligible to print");
        }


        /**
         * number is divisible by 2 and number <= 10
         *      print result of num x 10
         *      print 'num is divisible by 2
         * number is divisible by 5 or number is divisible by 7
         *      print number is divisible by 5 or 7
         *      print result of num * 20
         * number < 20
         *      print num is less than 20
         */
        int number = 15;

        if (number%2 == 0 && number <= 10) {
            System.out.println(number * 10);
            System.out.println(number + " is divisible by 2");      // X is divisible by 2
        } else if (number%5 == 0 || number%7 == 0) {
            System.out.println(number + " is divisible by 5 or 7");
            System.out.println(number * 20);
        } else if (number < 20) {
            System.out.println(number + " is less than 20");
        }

        System.out.println("Just a sout statement");

    }
}
