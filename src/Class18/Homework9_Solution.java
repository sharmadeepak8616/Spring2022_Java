package Class18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework9_Solution {

    // Due date: Sunday (Apr 10)

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Happy");         //  ["Happy"]
        names.add("GroW");          //  ["Happy", "GroW"]
        names.add("LeaRN");         //  ["Happy", "GroW", "LeaRN"]
        names.add("PeaCEfUL");      //  ["Happy", "GroW", "LeaRN", "PeaCEfUL"]
        names.add("Learning");      //  ["Happy", "GroW", "LeaRN", "PeaCEfUL", "Learning"]
        names.add("HAPPy");
        names.add("Growing");
        names.add("ListeN");
        names.add("PEACE");
        names.add("King KONG");
        names.add("happiness");
        names.add("greeN");
        names.add("SkiLLS");
        names.add("PRICELeSs");
        names.add("Health");
        names.add("NEW");
        names.add("LAUgh");
        names.add("QUeeN");
        names.add("YouNG");
        names.add("OLD");
        names.add("HAPPy");
        names.add("Growing");
        names.add("ListeN");
        names.add("PEACE");
        names.add("King KONG");
        names.add("happiness");
        names.add("greeN");
        names.add("SkiLLS");
        names.add("PRICELeSs");
        names.add("Health");
        names.add("NEW");
        names.add("LAUgh");
        names.add("King KONG");
        names.add("happiness");
        names.add("greeN");
        names.add("SkiLLS");
        names.add("PRICELeSs");
        names.add("Health");
        names.add("NEW");
        names.add("LAUgh");


        System.out.println(names);

        // getCount("HAppY", names); should return 3
        // getCount("JAVA", names); should return 0



        // getContainsCount("HAp", names);  should returns 6
        // getContainsCount("A", names);  should returns 17

        int[] numbers = {12, 12, 34, 56, 43, 98, 87, 5, 68, 24, 75, 35, 12};

        String userString = "HaPPInESs";
        int count = getCount(userString, names);
        System.out.println(userString + " appears in names-ArrayList -> " + count + " times.");

        int num = 12;
        int[] arrayAfterRemoval = removeNumFromIntArray(num, numbers);
        System.out.println("Remove " + num + "from Array -> " + Arrays.toString(numbers));
        System.out.println("Array after removal -> " + Arrays.toString(arrayAfterRemoval));



    }

    /**
     * Q1:
     *  Create method that will count (and return) the number of times a given String (ignoring the case) is present in given ArrayList
     *  name : getCount
     *  inputs : 2 (String, ArrayList<String>)
     *  return type : int
     */
     public static int getCount(String valToCheck, ArrayList<String> arrayList) {
         // code
        /*
            int counter = 0

         "HAPPY" ,      [Happy, GroW, LeaRN, PeaCEfUL, Learning, HAPPy, Growing, ListeN]


            pick-index-0-value (Happy)
            if (index-0-value equalsIgnore (userGivenStr))
                counter++;

            pick-index-1-value (Grow)
            if (index-1-value equalsIgnore (userGivenStr))
                counter++;

            pick-index-2-value (Grow)
            if (index-2-value equalsIgnore (userGivenStr))
                counter++;
            ...
            ...
            ...
            pick-index-lastIndex-value (ListeN)
            if (index-lastIndex-value equalsIgnore (userGivenStr))
                counter++;




            pick-index-i-value              (i=0,1,2,...,lastIndex)
            if (index-i-value equalsIgnore (userGivenStr))
                counter++;



            return counter;
        */
        int counter = 0;
//        for (int i=0 ; i <= arrayList.size()-1 ; i++) {
//            String val = arrayList.get(i);
//            if (val.equalsIgnoreCase(valToCheck)){
//                counter++;
//            }
//        }
         for (String strVal : arrayList) {
            if (strVal.equalsIgnoreCase(valToCheck)) {
                counter++;
            }
         }
        return counter;
     }


    /**
     * Q2:
     *  Create method that will return the number of ArrayList-values contains the given String (ignoring the case)
     *  name : getCount
     *  inputs : 2 (String, ArrayList<String>)
     *  return type : int
     */
    // public static int getContainsCount(String valToCheck, ArrayList<String> arrayList) {
    // // code
    // }

    /**
     * Q3:
     * Create a method to return an int-array after removing input-int-value from an input-int-array
     *
     * name: removeNumFromIntArray
     * inputs: 2 (int, int[])
     * return type: int[]
     *
     * -> How to create List using Array and vice-versa
     *
     * create a List using values of input-int-array
     * remove the input-int-value from List
     * create an int-array using List-values
     * return int-array
     *
     */
    public static int[] removeNumFromIntArray(int numToRemove, int[] numbers) {
        /*
            int[] numbers = {12, 12, 34, 56, 43, 12, 98, 87, 5, 12, 68, 24, 75}
            numToRemove = 12

            create new-ArrayList

            pick index-0-from-ARRAY
            if (index-0-from-ARRAY is NOT equals to numToRemove)
                add index-0-from-ARRAY in new-ArrayList

            pick index-1-from-ARRAY
            if (index-1-from-ARRAY is NOT equals to numToRemove)
                add index-1-from-ARRAY in new-ArrayList

            pick index-2-from-ARRAY
            if (index-2-from-ARRAY is NOT equals to numToRemove)
                add index-2-from-ARRAY in new-ArrayList
            ...
            ...
            pick index-lastIndex-from-ARRAY
            if (index-lastIndex-from-ARRAY is NOT equals to numToRemove)
                add index-lastIndex-from-ARRAY in new-ArrayList



            numbers[i]     (i=0,1,2,3,...lastIndex-ARRAY)
            if (numbers[i] is NOT equals to numToRemove)
                new-ArrayList.add(numbers[i])


            [34, 56, 43, 98, 87, 5, 68, 24, 75]

            int arrayListLength = arrayList.size();
            int[] finalArray = new int[arrayListLength];

            pick-index-0-value-from-ArrayList
            index-0-in-Array = index-0-value-from-ArrayList     {34}

            pick-index-1-value-from-ArrayList
            index-1-in-Array = index-1-value-from-ArrayList     {34, 56}
            ...
            ...
            pick-index-last-value-from-ArrayList
            index-last-in-Array = index-last-value-from-ArrayList     {34, 56, 43, 98, 87, 5, 68, 24, 75}


            return finalArray
         */
        List<Integer> myArrayList = new ArrayList<>();
        for (int i=0 ; i < numbers.length ; i++) {
            if (numbers[i] != numToRemove)
            myArrayList.add(numbers[i]);
        }
        // myArrayList = [34, 56, 43, 98, 87, 5, 68, 24, 75]

        int[] finalArray = new int[myArrayList.size()];
        for (int i=0 ; i < myArrayList.size() ; i++) {
            finalArray[i] = myArrayList.get(i);
        }
        return finalArray;

    }


}
