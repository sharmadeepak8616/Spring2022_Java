package Class7;

public class Loops_Concept {
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

        String[] words = {"hello", "give"};

        /*
            Print the array values like below:

            hello
            give
            learn
            smile
            health
         */

//        System.out.println(words[0]);
//        System.out.println(words[1]);
//        System.out.println(words[2]);
//        System.out.println(words[3]);
//        System.out.println(words[4]);


//        System.out.println(words[i]);     i=0,1,2,3,4     [   i=0 , increment(1) , i <= (length - 1) ]
        /**
         * Syntax for-loop:
         *
         * for (initialization ; condition ; increment/decrement) {
         *      // code inside
         *      // for loop
         * }
         */
        for (int i=0 ; i <= words.length - 1 ; i++) {
            System.out.println(words[i]);
        }
        /*
            1. initialization (int i=0)
            2. evaluates the condition with present value of i ( i <= words.length-1 )
            3. if the condition result into true
                    java enters the for-loop, and executes the code inside for-loop
                    while going back to for-loop, java performs the increment operation
               else
                    java won't enters inside the for-loop and moves to the code after for-loop
            4. evaluates the condition with present value of i ( i <= words.length-1 )
            5. if the condition result into true
                    java enters the for-loop, and executes the code inside for-loop
                    while going back to for-loop, java performs the increment operation
               else
                    java won't enters inside the for-loop and moves to the code after for-loop
            .....
            .....
         */


        String[] newWords = {"hello", "give", "learn", "king", "guide", "smile"};

        /**
         * print the array-words in reverse order
         *
         * smile        sout(newWords[newWords.length-1])
         * guide        sout(newWords[newWords.length-2])
         * king         sout(newWords[newWords.length-3])
         * learn
         * give
         * hello        sout(newWords[newWords.length-newWords.length])
         *
         *
         * sout(newWords[newWords.length-X])    X=1,2,3,....newWords.length [int X=1 , X<=newWords.length , X++ ]
         *
         */
        System.out.println("\nreverse order");
        for (int X=1 ; X<=newWords.length ; X++) {
            System.out.println(newWords[newWords.length-X]);
        }

        /**
         * print the array-words in reverse order
         *
         * smile        sout(newWords[newWords.length-1])
         * guide        sout(newWords[newWords.length-2])
         * king         sout(newWords[newWords.length-3])
         * learn
         * give
         * hello        sout(newWords[0])
         *
         *
         * sout(newWords[X])    X = newWords.length-1, newWords.length-2, newWords.length-3, newWords.length-4,....0
         * int X=newWords.length-1 ; X >= 0  ; X--
         */
        System.out.println("\nreverse again");
        for (int X=newWords.length-1 ; X>=0 ; X--) {
            System.out.println(newWords[X]);
        }


        String[] myWords = {"hello", "give", "learn", "king", "guide", "smile", "listen", "good", "play"};

        /*
            print the words from even-index

            hello       sout(myWords[0])
            learn       sout(myWords[2])
            guide       sout(myWords[4])

            sout(myWords[i])    // i=0,2,4      i < myWords.length    +=

         */
        System.out.println("\nEven index values - 1");
        for (int i=0 ; i < myWords.length ; i+=2) {
            System.out.println(myWords[i]);
        }

        /*
            i=0
            check if i-value is even
                print value at index-i
            i=1
            check if i-value is even
                print value at index-i
            i=2
            check if i-value is even
                print value at index-i
            i=3
            check if i-value is even
                print value at index-i
            ...
            ...
            i=lastIndex
            check if i-value is even
                print value at index-i

            int i=0 ; i < lengthArray ; i++
         */
        System.out.println("\nEven index values - 2");
        for (int i=0 ; i < myWords.length ; i++) {
            if(i%2 == 0) {
                System.out.println(myWords[i]);
            }
        }






































    }
}
