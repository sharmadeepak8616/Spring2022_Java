package Class10;

import Class9.Methods_Concept;

public class ArrayManipulators {

    /**
     * Create method to reverse an int-array
     * {1, 2, 3, 4, 5}  ->  {5, 4, 3, 2, 1}
     * {2, 43}          ->  {43, 2}
     *  1. what is the purpose of the method?   ->  reverseIntArray
     *  2. do I need any input from user?       ->  int[]
     *  3. should we return any value in the end of method? -> yes
     *      If yes, then what is the datatype of returned value? -> int[]
     */
    public int[] reverseIntArray(int[] inputArray) {
        int length = inputArray.length;
        int[] reverseArray = new int[length];
//        for (int P=1; P <= length ; P++) {
//            reverseArray[P-1] = inputArray[length-P];
//        }
        for (int P=length-1; P >= 0; P--) {
            reverseArray[length-1-P] = inputArray[P];
        }
        return reverseArray;
    }
    /*
        int length = inputArray.length;
        inputArray -> {1, 2, 3, 4, 5}
        reverseArray -> {}

        reverseArray[P-1] = inputArray[length-P]      // for-loop (P=1,2,3,...,length     int P=1; P <= length    ; P++

        reverseArray[length-1-P] = inputArray[P]      // for-loop (P=length-1, length-2, length-3, ... 0

            reverseArray[0] = inputArray[length-1]      // inputArray -> {1, 2, 3, 4, 5}   reverseArray -> {5}

            reverseArray[1] = inputArray[length-2]     // inputArray -> {1, 2, 3, 4, 5}   reverseArray -> {5, 4}

            reverseArray[2] = inputArray[length-3]     // inputArray -> {1, 2, 3, 4, 5}   reverseArray -> {5, 4, 3}
            ...
            ...
            ...
            reverseArray[length-1] = inputArray[length-length]     // inputArray -> {1, 2, 3, 4, 5}   reverseArray -> {5, 4, 3, 2, 1}
     */


    /**
     * Create method to find average of given int-array
     *  1. what is the purpose of the method?   ->  intArrayAverage
     *  2. do I need any input from user?       ->  int[]
     *  3. should we return any value in the end of method? -> Yes
     *      If yes, then what is the datatype of returned value? -> double
     */
    public static double intArrayAverage(int[] inputArray) {
        // add all numbers from inputArray
        // sumOfArray() from methods_Concept (sumOfArray is static)
        int total = Methods_Concept.sumOfArray(inputArray);
        double len = inputArray.length;
        return total/len;
    }

}
