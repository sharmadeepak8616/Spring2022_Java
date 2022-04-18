package Class10;

public class StringManipulators {

    /**
     * Create method to check if given String contains a given string (ignoring cases)
     *
     * "hello dear how are you?" , "J"    ->  false (boolean)
     * "should we return any value in the end of method" , "R"  -> true (boolean)
     *
     *
     *  1. what is the purpose of the method?   ->  containsIgnoreCase
     *  2. do I need any input from user?       ->  2 (String checkIn , String checkFor)
     *  3. should we return any value in the end of method? ->  Yes
     *      If yes, then what is the datatype of returned value? -> boolean
     */
    public static boolean containsIgnoreCase(String checkInStr , String checkForStr) {
        checkInStr = checkInStr.toLowerCase();
        checkForStr = checkForStr.toLowerCase();
        // boolean result = checkInStr.contains(checkForStr);
        // return result;
        return checkInStr.contains(checkForStr);
    }

}
