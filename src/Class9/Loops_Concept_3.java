package Class9;

public class Loops_Concept_3 {
    public static void main(String[] args) {

        /**
         * Q2:
         * Reverse the given String
         *
         * make america great again -> again great america make
         * good Morning -> Morning good
         * learn -> learn
         * happy birthday to you -> you to birthday happy
         *
         */
        /*
            String ans = "";

            make america great again
                split()
            String[] abc = "make" "america" "great" "again"

            abc.length = 4

            ans = ans + " " + abc[abc.length-1]             // ans = "" + again =  again
            ans = ans + " " + abc[abc.length-2]             // ans = again + " " + great = again great
            ans = ans + " " + abc[abc.length-3]             // ans = again great + " " + america = again great america
            ans = ans + " " + abc[abc.length-abc.length]    // ans = again great america + " " + make = again great america make

            ans = ans + " " + abc[abc.length-P]             // P=1,2,3...arrayLength int P=1 ; P <= arrayLength ; P++

            trim()

            sout ans (again great america make)

         */

        String sentence2 = "make america great again";
        System.out.println(sentence2);
        System.out.println(sentence2.length());
        String ans = "";

        String[] words = sentence2.split(" ");      //  words = "make" "america" "great" "again"
        // int numberOfWords = words.length;

        for (int P=1 ; P <= words.length ; P++) {
            // ans = ans + " " + words[words.length-P];
            ans = ans + words[words.length-P] + " ";
        }
        /*
            P=1
            ans = ans + words[words.length-1] + " "
            ans = "" + again + " "
            ans = again

            P=2
            ans = ans + words[words.length-2] + " "
            ans = "again " + great + " "
            ans = again great




            P=2
            ans = ans + words[0] + " "
            ans = "again great america " + make + " "
            ans = again great america make


            ans = again great america make

         */

        ans = ans.trim();

        System.out.println(ans);
        System.out.println(ans.length());




    }
}
