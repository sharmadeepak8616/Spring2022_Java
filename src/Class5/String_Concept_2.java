package Class5;

import javax.xml.stream.events.StartDocument;

public class String_Concept_2 {
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

        // Methods discussed here -> replace(), charAt(), indexOf(), lastIndexOf(), startsWith(), endsWith(), trim(), subString()

        /**
         * To replace an EXACT sequence in a given String
         * method: replace()
         * input: seqToReplace(String), seqReplaceWith(String)
         * return type: String
         *
         * This method is not going to change the original value (or value in original variable)
         * It will convert the value in uppercase and return the result.
         *
         * "New YORk TiMes MagazINES"
         * replace "e" with "ABCD"
         * "NABCDw YORk TiMABCDs MagazINES"
         *
         */
        String magazine = "New YORk TiMes MagazINES hello WorlD BeST OF LUCKIEs";

        // replace "e" with "ABCD"

        String magazine_AfterReplace = magazine.replace("e", "ABCD");

        System.out.println("\nmagazine -> " + magazine);
        System.out.println("magazine_AfterReplace -> " + magazine_AfterReplace);

        /*
            Overwriting value in original variable with value after replacement
         */
        // magazine = magazine.replace("e", "ABCD");
        // System.out.println("\nmagazine (replacing old value) -> " + magazine);

        /**
         * Replace all kinds of "e" with "ABCD"
         */
        String dataToReplace = "es";
        String dataToReplaceWith = "XXXXX";
        /*
            Pseudo coding
            1. convert magazine into lowercase (magazine_L)
            2. convert dataToReplace into lowercase (dataToReplace_L)
            3. replace dataToReplace_L with dataToReplaceWith in magazine_L
            4. store result in new variable (afterReplace)
         */
        String magazine_L = magazine.toLowerCase();
        String dataToReplace_L = dataToReplace.toLowerCase();
        String afterReplace = magazine_L.replace(dataToReplace_L, dataToReplaceWith);
        System.out.println("\nReplace task:\nafterReplace -> " + afterReplace);


        String afterReplace1 =  magazine.toLowerCase().replace(dataToReplace.toLowerCase(), dataToReplaceWith);
        System.out.println("afterReplace1 -> " + afterReplace1);

        /**
         * To find a char at a particular index
         * method: charAt()
         * input: indexValue (int)
         * return type: char
         *
         * "neW YorKeR"
         * find the char at index=1 -> e (char)
         * find the char at index=20 -> StringIndexOutOfBoundsException (last index = 9)
         *
         * if the given input is within the index-range, method will return the chat at given index
         * else method will throw StringIndexOutOfBoundsException
         *
         */
        // String magazine = "New YORk TiMes MagazINES hello WorlD BeST OF LUCKIEs";

//        char charAtIndex100 = magazine.charAt(100);
//        System.out.println("magazine -> " + magazine);
//        System.out.println("char at Index-100 -> " + charAtIndex100);

        System.out.println("\nmagazine -> " + magazine);
        char charAtIndex2 = magazine.charAt(2);
        System.out.println("char at Index-2 -> " + charAtIndex2);

        /**
         * Task: write code to print the char at last index of the given string
         */
        String stmt = "View the latest news and breaking news today for U.S., world, weather";
        /*
            1. find the length of string
            2. find last index using length-1
            3. use last-index value with charAt() method
            4. store the result in new variable (char)
         */

        int len = stmt.length();
        int lastIndex = len - 1;
        char charAtLastIndex = stmt.charAt(lastIndex);
        System.out.println("\nChar at last-index task:\ncharAtLastIndex -> " + charAtLastIndex);

        char charAtLastIndex1 = stmt.charAt(stmt.length()-1);
        System.out.println("charAtLastIndex1 -> " + charAtLastIndex1);

        /**
         * To find the index of FIRST OCCURRENCE of an EXACT sequence in a the given String
         * method: indexOf()
         * input: String
         * return type: int
         *
         * "View the latest news and breaking news today for U.S., world, weather"
         *
         * find the index of "t"? -> 5
         * find the index of "V"? -> 0
         * find the index of "e"? -> 2
         * find the index of "news"? -> 16
         * find the index of "US"? -> -1
         * find the index of "NewS"? -> -1
         *
         * if the given sequence is exactly found in the String
         *      method returns the index of FIRST OCCURRENCE of the sequence
         * else
         *      method returns -1
         *
         */
        magazine = "View the latest news and breaking news today for U.S., world, weather";
        System.out.println("\nmagazine -> " + magazine);

        int indexOf_t = magazine.indexOf("t");
        System.out.println("index of 't' -> " + indexOf_t);

        int indexOf_news = magazine.indexOf("news");
        System.out.println("index of 'news' -> " + indexOf_news);

        int indexOf_NEwS = magazine.indexOf("NEwS");
        System.out.println("index of 'NEwS' -> " + indexOf_NEwS);


        /**
         * To find the index of LAST OCCURRENCE of an EXACT sequence in a the given String
         * method: lastIndexOf()
         * input: String
         * return type: int
         *
         * "View the latest news and breaking news today for U.S., world, weather"
         *
         * find the last index of "t"? -> index of t in weather-word
         * find the last index of "V"? -> 0
         * find the last index of "e"? -> index of t in weather-word
         * find the last index of "news"? -> 34
         * find the last index of "US"? -> -1
         * find the last index of "NewS"? -> -1
         *
         * if the given sequence is exactly found in the String
         *      method returns the index of LAST OCCURRENCE of the sequence
         * else
         *      method returns -1
         *
         */
        magazine = "View the latest news and breaking news today for U.S., world, weather";
        System.out.println("\nmagazine -> " + magazine);

        int lastIndexOf_t = magazine.lastIndexOf("t");
        System.out.println("last index of 't' -> " + lastIndexOf_t);

        int lastIndexOf_news = magazine.lastIndexOf("news");
        System.out.println("last index of 'news' -> " + lastIndexOf_news);

        int lastIndexOf_NEwS = magazine.lastIndexOf("NEwS");
        System.out.println("last index of 'NEwS' -> " + lastIndexOf_NEwS);

        /**
         * To find if the given String starts with an EXACT sequence
         * method: startsWith()
         * input: seq(String)
         * return type: boolean
         */

        magazine = "View the latest news and breaking news today for U.S., world, weather";
        System.out.println("\nmagazine -> " + magazine);

        boolean isStartsWith_View_t = magazine.startsWith("View t");
        System.out.println("is starts with 'View t' ? -> " + isStartsWith_View_t);

        boolean isStartsWith_vi = magazine.startsWith("vi");
        System.out.println("is starts with 'vi' ? -> " + isStartsWith_vi);

        /**
         *  Find if "View the latest news and breaking news today for U.S., world, weather"
         *  starts with "vi" (ignoring cases)
         *
         *  magazine into lowercase (magazine_L1)
         *  seq into lowercase (seq_L)
         *
         *  (magazine_L1) -> "view the latest news and breaking news today for u.s, world, weather"
         *  (seq_L) -> "vi"
         *
         *  magazine_L1 startsWith (seq_L) -> true
         *
         *
         */
        String magazine_L1 = magazine.toUpperCase();
        String seq = "vi";
        String seq_L = seq.toUpperCase();
        boolean startsWith_IgnoringCase = magazine_L1.startsWith(seq_L);
        System.out.println("\nStarts with (ignoring case) task:\nstartsWith_IgnoringCase -> " + startsWith_IgnoringCase);

        boolean startsWith_IgnoringCase1 = magazine.toLowerCase().startsWith(seq.toLowerCase());
        System.out.println("startsWith_IgnoringCase1 -> " + startsWith_IgnoringCase1);

        /**
         * To find if the given String ends with an EXACT sequence
         * method: endsWith()
         * input: seq(String)
         * return type: boolean
         */
        magazine = "View the latest news and breaking news today for U.S., world, weather";
        System.out.println("\nmagazine -> " + magazine);

        boolean isEnds_her = magazine.endsWith("her");
        System.out.println("is ends with 'her' -> " + isEnds_her);

        boolean isEndsWith_weath = magazine.endsWith(", weath");
        System.out.println("is ends with ', weath' -> " + isEndsWith_weath);

        boolean isEndsWith_weaTher = magazine.endsWith("weaTher");
        System.out.println("is ends with 'weaTher' -> " + isEndsWith_weaTher);


        /**
         * "      a bb    ddd   kjdldjlk  kljdlkjd       "
         *
         * To remove extra spaces from String value
         *      (spaces before the first character in String and after the last character in String)
         * method: trim()
         * return type: String
         *
         * This method is not going to change the original value (or value in original variable)
         * It will trim the value and return the result.
         *
         */
        magazine = "      a bb    ddd   kjdldjlk  kljdlkjd       ";

        String magazineAfterTrim = magazine.trim();

        System.out.println("\nmagazine -> ^" + magazine + "^");                         // magazine -> ^      a bb    ddd   kjdldjlk  kljdlkjd       ^
        System.out.println("magazineAfterTrim -> ^" + magazineAfterTrim + "^");         // magazineAfterTrim -> ^a bb    ddd   kjdldjlk  kljdlkjd^

        /**
         *
         *
         * magazine = "View the latest news and breaking news today for U.S., world, weather";
         *
         * from magazine fetch portion from index-1 to index-4 (do not include index-4): iew (String)
         * from magazine fetch portion from index-1 to index-2 (do not include index-2): i (String)
         * from magazine fetch portion from index-0 to index-1 (do not include index-1): V (String)
         *
         * from magazine fetch portion from index-1: iew the latest news and breaking news today for U.S., world, weather (String)
         * from magazine fetch portion from index-200: StringIndexOutOfBoundsException
         *
         *
         *
         * To fetch a portion of a String using index-values
         * method: subString
         * return type: String
         *
         * Input is ONLY beginIndex:
         *      if the beginIndex is valid
         *          method will return String from beginIndex to end of the String
         *      else
         *          StringIndexOutOfBoundsException
         *
         * Input is beginIndex and endIndex:
         *      if the beginIndex and endIndex are valid
         *          method will return String from beginIndex to endIndex-1
         *      else
         *          StringIndexOutOfBoundsException
         *
         */
        magazine = "View the latest news and breaking news today for U.S., world, weather";
        System.out.println("\nmagazine -> " + magazine);

        String magazine_fromIndex1 = magazine.substring(1);
        System.out.println("magazine_fromIndex1 -> " + magazine_fromIndex1);

        String magazine_fromIndex1To4 = magazine.substring(1,4);
        System.out.println("magazine_fromIndex1To4 -> " + magazine_fromIndex1To4);  // iew

        /**
         * Get value at last-index task:
         * Expected ans: h
         */
        magazine = "abcd efgh";
        System.out.println("\nGet value at last-index task:\nmagazine -> " + magazine);

        /*
            // Methods discussed here -> length(), toLowercase(), toUppercase(), equals(), equalsIgnoreCase(), contains()
            // Methods discussed here -> replace(), charAt(), indexOf(), lastIndexOf(), startsWith(), endsWith(), trim(), subString()

            find length (9)
            find last index (8)
            how to find the value at any index (charAt() or subString())
                magazine.charAt(lastIndex) -> h (char)
                magazine.subString(lastIndex) -> h (String)

            how to find the value at index-0 (charAt() or subString())
                magazine.charAt(0) -> a (char)
                magazine.subString(0,1) -> a (String)

         */










    }
}
