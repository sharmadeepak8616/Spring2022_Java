package Class7;

public class ConditionalCode_2 {
    public static void main(String[] args) {

        /**
         * Conditional Code (Conditional Block/Loop)
         *
         * 1. if-else block
         * 2. switch block
         *
         * When we have different actions to do (code to execute) depending upon conditions
         */

        /**
         *
         * if almond milk is not expiring with 2 days
         *      buy 2 boxes
         * other wise look for 2%milk or full cream
         *      buy 2 boxes which ever available
         * otherwise
         *      give me a call
         *
         *
         * if (Almond expiring > 2 days)        [--> almond milk expiring today]
         *      buy 2 boxes of almond boxes
         * else if (is 2% available or full cream available) {
         *      buy 2 boxes of whatever
         * else
         *      call
         *
         */

        /**
         * if the num value is equal to 2
         *      print two
         * if the num value is equal to 5
         *      print five
         * if the num value is equal to 7
         *      print seven
         * if the num value is equal to 10
         *      print ten
         * if the num value is equal to 3
         *      print three
         */
        int num = 11;
//        if (num == 2) {
//            System.out.println("two");
//        }
//        if (num == 5) {
//            System.out.println("five");
//        }
//        if (num == 7) {
//            System.out.println("seven");
//        }
//        if (num == 10) {
//            System.out.println("ten");
//        }
//        if (num == 3) {
//            System.out.println("three");
//        }

        if (num == 2) {
            System.out.println("two");
        } else if (num == 5) {
            System.out.println("five");
        } else if (num == 7) {
            System.out.println("seven");
        } else if (num == 10) {
            System.out.println("ten");
        } else if (num == 3) {
            System.out.println("three");
        }

        /**
         * 1. all conditions are related to only one variable - yes
         * 2. all conditions are checking for equals - yes
         * 3. for every block, there is only one condition and that is checking equals - yes
         */
        /**
         * switch(varName) {
         *      case val1:
         *          // code if varName value is equals to val1
         *          // case block
         *          break;
         *      case val2:
         *          // code if varName value is equals to val2
         *          // case block
         *          break;
         *      case val3:
         *          // code if varName value is equals to val3
         *          // case block
         *          break;
         *      default:
         *          // code if varName value is NOT equals to any case values
         *          // case block
         * }
         */

        switch (num) {
            case 2:
                System.out.println("two");
                break;
            case 5:
                System.out.println("five");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 10:
                System.out.println("ten");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("Not equal to any case values");
        }


        /**
         * if name is Happy, print "good name"
         * if name is John, print name in Titlecase
         * if name is King, print the name in uppercase and print the name length
         * if name is Joy, print the name length and print "short and sweet name"
         * if none of above, print "very unique name"
         */
        /**
         * 1. all conditions are related to only one variable - yes
         * 2. all conditions are checking for equals - yes
         * 3. for every block, there is only one condition and that is checking equals - yes
         */

        String name = "jOy";

        switch (name.toLowerCase()) {
            case "happy":
                System.out.println("good name");
                break;
            case "john":
                // get first character (as String) using subString method
                String firstLetter = name.substring(0,1).toUpperCase();                             // S
                String allLetters = name.substring(1).toLowerCase();                                // am
                System.out.println("name in Titlecase" + firstLetter + allLetters);                 // Sam
                break;
            case "king":
                System.out.println("name in uppercase" + name.toUpperCase());
                System.out.println("name length" + name.length());
                break;
            case "joy":
                System.out.println("name length -> " + name.length());
                System.out.println("short and sweet name");
                break;
            default:
                System.out.println("very unique name");
        }


        /*
            day =

            if day is Mon, Wed or Fri -> Print "Technosoft class"
            if day is Tue, Sat, thu -> Print "Technosoft lab"
            if day is Sun -> Print "Enjoy"

            User can enter day-value as Mon, Monday, MoNDaY, MoN, MON
         */

        /**
         * 1. all conditions are related to only one variable - yes
         * 2. all conditions are checking for equals - yes
         * 3. for every block, there is only one condition and that is checking equals - No
         */
        String day = "mondAy";

//        if(day.equalsIgnoreCase("mon")
//                || day.equalsIgnoreCase("wed")
//                || day.equalsIgnoreCase("fri")
//                || day.equalsIgnoreCase("monday")
//                || day.equalsIgnoreCase("wednesday")
//                || day.equalsIgnoreCase("friday")) {
//
//            System.out.println("Technosoft class");
//
//        } else if (day.equalsIgnoreCase("tue")
//                || day.equalsIgnoreCase("sat")
//                || day.equalsIgnoreCase("thu")
//                || day.equalsIgnoreCase("tuesday")
//                || day.equalsIgnoreCase("saturday")
//                || day.equalsIgnoreCase("thursday")) {
//
//            System.out.println("Technosoft lab");
//
//        } else if (day.equalsIgnoreCase("sun")
//                || day.equalsIgnoreCase("sunday")) {
//
//            System.out.println("Enjoy");
//        } else {
//            System.out.println("Invalid day name -> " + day);
//        }
        switch (day.toLowerCase()) {
            case "mon":
            case "monday":
            case "wed":
            case "wednesday":
            case "fri":
            case "friday":
                System.out.println("Technosoft class");
                break;
            case "tue":
            case "tuesday":
            case "thu":
            case "thursday":
            case "sat":
            case "saturday":
                System.out.println("Technosoft lab");
                break;
            case "sun":
            case "sunday":
                System.out.println("Enjoy");
                break;
            default:
                System.out.println("Invalid data entered");
                break;

        }













    }
}
