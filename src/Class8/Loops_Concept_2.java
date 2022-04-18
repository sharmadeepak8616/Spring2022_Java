package Class8;

public class Loops_Concept_2 {
    public static void main(String[] args) {
        /**
         * Loops:
         *      when we need to execute set of code multiple times.
         *
         * 1. for loop
         * 2. Enhanced for loop
         * 3. while loop
         * 4. do-while loop
         */

        /**
         * Print the total of the numbers in array
         *
         * eg:
         * Total = XXXX
         */
        int[] numbers = {23, 12, 54, 65, 23};
        int total = 0;
        /*
            total = total + numbers[0];     // total = 0 + 90 = 90
            total = total + numbers[1];     // total = 90 + 87 = 177
            total = total + numbers[2];
            total = total + numbers[3];
            ...
            ...
            ...
            total = total + numbers[lastIndex];



            total = total + numbers[X];     // X=0,1,2,3.....lastIndex  X < lengthArray     X++
        */

        for (int X=0 ; X < numbers.length ; X++) {
            // total = total + numbers[X];
            total += numbers[X];
        }

        System.out.println("Total = " + total);

        /**
         * Enhanced for-loop (with Array or Collections)
         *
         * Conditions in which you have option to use Enhanced for-loop
         *  1. you need to traverse an array (or Collection)
         *  2. you are picking values from array (or Collection) one-by-one from index-0
         *
         * Syntax Enhanced for-loop:
         * for (datatype varName : arrName) {
         *      // code inside the for-loop
         * }
         *
         * when loop will run 1st time -> index-0 value from arrName will be stored in varName (varName = arrName[0])
         * when loop will run 2nd time -> index-1 value from arrName will be stored in varName (varName = arrName[1])
         *
         *
         */

        /*
            Print array values
         */
        String[] myWords = {"hello", "give", "learn", "king", "guide", "smile", "listen", "good", "play"};

        System.out.println("\nNormal for-loop");
        for (int i=0 ; i <= myWords.length-1 ; i++) {
            System.out.println(myWords[i]);
        }

        System.out.println("\nEnhanced for-loop");
        for (String word : myWords) {
            System.out.println(word);
        }

        /*
            for (int X=0 ; X < numbers.length ; X++) {
                // total = total + numbers[X];
                total += numbers[X];
            }
         */
        int[] numbers2 = {1, 1};
        int total2 = 0;
        for (int num : numbers2) {
            total2 += num;      // total2 = 0
        }
        System.out.println("\nEnhanced for-loop\nTotal2 = " + total2);

        /**
         * Reverse a String
         *
         * "learn"
         * "nrael"
         *
         * "hello world"
         * "dlrow olleh"
         *
         */
        System.out.println("\n\nReverse a String\n");
        String givenString = "hello world";
        String revString = "";
        /*
            dlrow olleh
         */
        int lastIndex = givenString.length()-1;
        // System.out.println(givenString.charAt(lastIndex-0));
        // System.out.println(givenString.charAt(lastIndex-1));
        // System.out.println(givenString.charAt(lastIndex-2));


        // System.out.println(givenString.charAt(lastIndex-lastIndex));


        // System.out.println(givenString.charAt(lastIndex-Y));     // Y=0,1,2,3,....,lastIndex  Y <= lastIndex   Y++

        /*
            revString = revString + givenString.charAt(lastIndex)       revString = "" + d = d
            revString = revString + givenString.charAt(lastIndex-1)     revString = d + l = dl
            revString = revString + givenString.charAt(lastIndex-2)     revString = dl + r = dlr
         */

        for (int Y=0 ; Y <= lastIndex ; Y++) {
            // System.out.print(givenString.charAt(lastIndex-Y));
            // revString = revString + givenString.charAt(lastIndex-Y);
            revString += givenString.charAt(lastIndex-Y);
        }

        System.out.println("givenString -> " + givenString);
        System.out.println("revString -> " + revString);


        /**
         * while loop
         *
         * initialization
         * while (condition) {
         *      // code inside
         *      // while loop
         *      increment/decrement <-- Always be the last line of while-loop
         * }
         *
         */
        System.out.println("\nWhile loop");
        String revString2 = "";
        int z=0;
        while (z <= lastIndex) {
            revString2 += givenString.charAt(lastIndex-z);
            z++;
        }
        System.out.println("revString2 -> " + revString2);


        /**
         * do-while loop
         *
         * initialization
         * do {
         *      // code inside
         *      // do-while loop
         *      increment/decrement <-- Always be the last line of do-while-loop
         * } while (condition);
         */
        System.out.println("\ndo-while loop");
        String revString3 = "";
        int d=0;
        do {
            revString3 += givenString.charAt(lastIndex-d);
            d++;
        } while (d <= lastIndex);
        System.out.println("revString3 -> " + revString3);


        char[] letters = {'l', 'k', 'j', 'h', 'm', 'o', 'p', 'i'};
        /*
            Print like:
            Letter at index-0 : l
            Letter at index-1 : k
            Letter at index-2 : j
            ...
            ...


            Letter at index-0 : letters[0]
            Letter at index-1 : letters[1]


            Letter at index-i : letters[i]      // i=0,1,2,...lastIndex  i < lengthArray   i++


         */

        for (int i=0 ; i < letters.length ; i++) {
            System.out.println("Letter at index-" + i + " : " + letters[i]);
        }

        /**
         * break - keyword
         *
         * is used to stop for-loop in between
         */

        String[] names = {"happy", "joy", "king", "quEeN", "beauty", "CHEENA"};
        /*
            find the first word with "ee" (pls ignore the case)
         */
        /*
            index-0
            if (index-0-value contains "ee")
                sout(index-0-value)
            index-1
            if (index-1-value contains "ee")
                sout(index-1-value)



            index-i     // i=0,1,2,3...lastIndex
            if (index-i-value contains "ee")
                sout(index-i-value)

         */

        for (int i=0 ; i < names.length ; i++) {
            if (names[i].toLowerCase().contains("ee")) {
                System.out.println(names[i]);
                break;
            }
        }
        /*
            i=0 (names[0] = "happy")
            if (names[0].toLowerCase().contains("ee") {
                sout(names[0])
            }
            i=1 (names[1] = "joy")
            if (names[1].toLowerCase().contains("ee") {
                sout(names[1])
            }
            i=2 (names[2] = "king")
            if (names[2].toLowerCase().contains("ee") {
                sout(names[2])
            }
            i=3 (names[3] = "quEeN")
            if (names[3].toLowerCase().contains("ee") {
                sout(names[3])
                break;
            }
         */



    }
}
