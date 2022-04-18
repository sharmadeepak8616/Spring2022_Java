package Class11;

import java.util.Arrays;

public class FoysalQuestion {

    /**
     * Create a method that will return names ends with a or b from the given array
     * String[] friendsOfMyDaughter = {"Michelle", "Juliana", "Jacob", "Landon"};
     *
     * String[] friendsOfMyDaughter = {"Michelle", "Juliana", "Jacob", "Landon"};
     *
     */

    public static String[] names(String[] inputArrray, String checkingEnd1, String checkingEnd2){
        int count = 0;

        for (int i=0 ; i < inputArrray.length ; i++) {
            if (inputArrray[i].toLowerCase().endsWith(checkingEnd1.toLowerCase()) ||
                    inputArrray[i].toLowerCase().endsWith(checkingEnd2)) {
                count++;
            }
        }
        // count = 2
        String[] newNames = new String[count];
        int j=-1;
        for (int i=0; i<inputArrray.length; i++){
            if (inputArrray[i].toLowerCase().endsWith(checkingEnd1.toLowerCase()) ||
                    inputArrray[i].toLowerCase().endsWith(checkingEnd2)){
                j++;
                newNames[j] = inputArrray[i];
            }
        }
        return newNames;
    }
    /**
     * String[] friendsOfMyDaughter = {"Michelle", "Juliana", "Landon", "Jacob" };
     * i=0 (inputArray)
     *      if (inputArray[0] satisfies condition)  ["Michelle"]
     *          j++
     *          newNames[j] = inputArray[0]         <-- didn't happen
     * i=1 (inputArray)                             ["Juliana"]
     *      if (inputArray[1] satisfies condition)
     *          j++
     *          newNames[j] = inputArray[1]
     * i=2 (inputArray)                             ["Landon"]
     *      if (inputArray[2] satisfies condition)
     *          j++
     *          newNames[0] = inputArray[2]         <-- didn't happen
     * i=3 (inputArray)                             ["Jacob"]
     *      if (inputArray[3] satisfies condition)
     *          j++
     *          newNames[1] = inputArray[3]
     *
     *
     *
     */
    /**
     * Need to create an Array that will store outcome strings [Challenge is to define index]
     * Find a way to traverse the given array from begining to length one by one
     * Search for the names in all indexes in the given Array one by one that ends with "a" and "b"
     * Store the names that satisfies the condition in the new Array
     * Return the new Array
     *
     */


    public static void main(String[] args) {
        String[] friendsOfMyDaughter = {"Michelle", "Julian", "Jacob", "Landon"};
        String str1 = "a";
        String str2 = "b";
        System.out.println(Arrays.toString(names(friendsOfMyDaughter,str1,str2)));
    }
}
