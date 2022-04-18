package Class17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_ArrayList_2 {
    public static void main(String[] args) {

        /**
         * Limitations of Array:
         *
         * 1. a) Total number of values that I want to store in Array (bcz may be right now you don't know the value)
         *      OR
         *    b) all the values that I want to store in array.
         *
         * 2. Array length is fixed, we cannot increase or decrease the length of array
         *
         * 3. Array can store only one datatype.
         *      String[] names = new String[5];     // 5 String values
         *      double[] bills = new double[3];     // 3 double values
         *
         */
        /**
         * List(I) / ArrayList(C)
         *
         * ArrayList: is a Non-primitive datatype, which can store multiple values.
         * --> List/ArrayList maintains the order of insertion.
         *
         * Syntax of create ArrayList/List:
         * ArrayList<datatypeClass> arrList = new ArrayList<>();
         *      OR
         * List<datatypeClass> myList = new ArrayList<>();
         *
         * datatypeClass/WrapperClass : class which represent the primitive datatypes.
         *      int ->  Integer
         *      double  -> Double
         *      char -> Character
         *      boolean -> Boolean
         *      String -> String
         */
        ArrayList<String> names = new ArrayList<>();

        // ArrayList to store bills
        // ArrayList<Double> myBills = new ArrayList<>();
        List<Double> myBills = new ArrayList<>();

        /**
         * To find the length of ArrayList/List
         * method: size()
         * return type: int
         */
        int totalNames = names.size();
        System.out.println("names -> " + names);
        System.out.println("total names in names-ArrayList -> " + totalNames);

        /**
         * To add value/data in Array/List
         * method: add()
         *
         * -> add()-method adds the value in next available index.
         * -> using add()-method, we can ONLY add 1-value/data at a time.
         * -> ArrayList will always maintain the order of insertion.
         *
         */
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
        names.add("OLD");      //  [Happy, GroW, LeaRN, PeaCEfUL, Learning, HAPPy, Growing, ListeN, PEACE, King KONG, happiness, greeN, SkiLLS, PRICELeSs, Health, NEW, LAUgh, QUeeN, YouNG, OLD]

        System.out.println("\nnames -> " + names);
        System.out.println("total names in names-ArrayList -> " + names.size());
        /**
         * To remove a data from ArrayList/List
         * method: remove()
         *
         * usage:
         *  1. by providing the index-value from which value to be removed
         *  2. by providing the value/data which needs to be removed
         */
        /**
         * if using the remove method as #1. by providing the index-value from which value to be removed
         *
         * if the given index is within the range (0 to last-Index)
         *      method will remove the value, and return the removed-value
         * else
         *      IndexOutOfBoundsException
         */
        String removedValue_3 = names.remove(3);
        System.out.println("\nRemoved value from index-3 -> " + removedValue_3);

        // String removedValue_33 = names.remove(33);
        // System.out.println("\nRemoved value from index-33 -> " + removedValue_33);

        System.out.println("\nnames -> " + names);
        System.out.println("total names in names-ArrayList -> " + names.size());
        /**
         * if using the remove method as #2. by providing the value/data which needs to be removed
         *
         * if the value is exactly found in the ArrayList/List
         *      method will remove the FIRST OCCURRENCE of the value ans returns true
         * else
         *      method returns false
         *
         */
        boolean isRemoved_Learn = names.remove("Learn");
        System.out.println("\nis 'Learn' removed from names-ArrayList? -> " + isRemoved_Learn);

        boolean isRemoved_King = names.remove("King");
        System.out.println("is 'King' removed from names-ArrayList? -> " + isRemoved_King);

        boolean isRemoved_KingKONG = names.remove("King KONG");
        System.out.println("is 'King KONG' removed from names-ArrayList? -> " + isRemoved_KingKONG);

        System.out.println("\nnames -> " + names);
        System.out.println("total names in names-ArrayList -> " + names.size());

        /**
         * To replace a value from a given index
         * method: set()
         *
         * if the given index is within the range (0 to last-Index)
         *      method will replace the old-value with new-value, and returns the old-value
         * else
         *      IndexOutOfBoundsException
         */
        String replacedValue_Index1 = names.set(1, "KEep GroWINg");
        System.out.println("\nReplaced value at index-1 -> " + replacedValue_Index1);

        System.out.println("\nnames -> " + names);
        System.out.println("total names in names-ArrayList -> " + names.size());

        // double[] bills = {12.12, 43, 54, 12};
        // code to print index-2 value
        // System.out.println(bills[2]);

        /**
         * To get the value from given index
         * method: get()
         *
         * if the given index is within the range (0 to last-Index)
         *      method will return the value at the given index
         * else
         *      IndexOutOfBoundsException
         */
        String valueAt2 = names.get(2);
        System.out.println("\nValue at index-2 -> " + valueAt2);

        String valueAt14 = names.get(14);
        System.out.println("Value at index-14 -> " + valueAt14);

        System.out.println("\nnames -> " + names);
        System.out.println("total names in names-ArrayList -> " + names.size());

        /**
         * Create ArrayList to store multiple values of multiple datatypes
         */
        List<Object> multiData = new ArrayList<>();
        multiData.add("Hello");
        multiData.add(true);
        multiData.add(2.2);
        multiData.add('a');
        multiData.add(100);

        System.out.println("\n\nmultiData -> " + multiData);
        System.out.println("multiData length -> " + multiData.size());

        // add
        // remove using index-value
        // remove using value
        // set (to replace value)
        // get (to get value)

        /**
         * Create an ArrayList/List to store temp-values
         * 90, 100, 67.5, 78, 72.4
         */

        System.out.println("\n\nArray with loops\n\n");

        double[] tempArray = {90, 100, 67.5, 78, 72.4};
        /*
            Print value from tempArray as below:
            90
            100
            67.5
            78
            72.4
         */
        for (int i=0 ; i < tempArray.length ; i++) {
            System.out.println(tempArray[i]);
        }

        for (double val : tempArray) {
            System.out.println(val);
        }
        System.out.println("\nArrayList with loop\n");
        List<Double> tempValues = new ArrayList<>();
        tempValues.add(90.0);
        tempValues.add(100.0);
        tempValues.add(67.5);
        tempValues.add(78.0);
        tempValues.add(72.4);

        for (int i=0 ; i < tempValues.size() ; i++) {
            System.out.println(tempValues.get(i));
        }

        for (double val : tempValues) {
            System.out.println(val);
        }

        // Delete 102.3 from tempValues
        boolean result = tempValues.remove(72.4);
        System.out.println("\nresult -> " + result);

        List<Integer> numOfShoes = new ArrayList<>();
        numOfShoes.add(5);
        numOfShoes.add(10);
        numOfShoes.add(12);
        numOfShoes.add(17);
        numOfShoes.add(72);

        numOfShoes.remove(2);   // remove the index-2 value     (12 should be removed)

        // new Integer
        numOfShoes.remove(new Integer(5));   // remove the value = 5 (Integer)  (5 should be removed)
        // numOfShoes.remove(5);

        System.out.println(numOfShoes);     // [10, 17, 72]

        // add
        // remove using index-value
        // remove using value
        // set (to replace value)
        // get (to get value)

        // [Happy, KEep GroWINg, LeaRN, Learning, HAPPy, Growing, ListeN, PEACE, happiness, greeN, SkiLLS, PRICELeSs, Health, NEW, LAUgh, QUeeN, YouNG, OLD]

        names.add("ListeN");
        names.add("PEACE");
        names.add("King KONG");
        names.add("happiness");

        System.out.println("\nnames -> " + names);
        System.out.println("total names in names-ArrayList -> " + names.size());

        // [Happy, KEep GroWINg, LeaRN, Learning, HAPPy, Growing, ListeN, PEACE, happiness, greeN, SkiLLS, PRICELeSs, Health, NEW, LAUgh, QUeeN, YouNG, OLD, ListeN, PEACE, King KONG, happiness]

        /**
         * To find the index of FIRST OCCURRENCE of a given value in ArrayList/List
         * method: indexOf()
         *
         * if the given value is EXACTLY present in ArrayList/List
         *      method returns the index of the FIRST OCCURRENCE of given value
         * else
         *      method returns -1
         */
        int indexOf_Good_day = names.indexOf("Good day");
        System.out.println("\nIndex of 'Good day' -> " + indexOf_Good_day);     // -1

        int indexOf_HAPPY = names.indexOf("HAPPY");
        System.out.println("Index of 'HAPPY' -> " + indexOf_HAPPY);             // -1

        int indexOf_PEACE = names.indexOf("PEACE");
        System.out.println("Index of 'PEACE' -> " + indexOf_PEACE);             //  7

        int indexOf_PRICE = names.indexOf("PRICE");
        System.out.println("Index of 'PRICE' -> " + indexOf_PRICE);             //  -1

        /**
         * To find the index of LAST OCCURRENCE of a given value in ArrayList/List
         * method: lastIndexOf()
         *
         * if the given value is EXACTLY present in ArrayList/List
         *      method returns the index of the LAST OCCURRENCE of given value
         * else
         *      method returns -1
         */
        int lastIndexOf_PEACE = names.lastIndexOf("PEACE");
        System.out.println("\nLast index of 'PEACE' -> " + lastIndexOf_PEACE);      // 19

        int lastIndexOf_HAPPY = names.lastIndexOf("HAPPY");
        System.out.println("Last index of 'HAPPY' -> " + lastIndexOf_HAPPY);        // -1


        /**
         * Find the last-index of HAPPY (ignoring cases)
         */
        String valueToCheck = "HAPPY".toLowerCase();
        /*
            get lastIndex-value
            if (it is equalsIgnoreTo HAPPY)
                lastIndexOF_HAPPY = lastIndex
                stop checking

            get lastIndex-1-value
            if (it is equalsIgnoreTo HAPPY)
                lastIndexOF_HAPPY = lastIndex-1
                stop checking

            ...
            ...
            ...
            get 0-value
            if (it is equalsIgnoreTo HAPPY)
                lastIndexOF_HAPPY = 0
                stop checking


           get i-value                                      // i = lastIndex, lastIndex-1 , lastIndex-2 ,lastIndex-3 , 0
            if (it is equalsIgnoreTo HAPPY)
                lastIndexOF_HAPPY = i
                stop checking

         */
        int lastIndexOf_HAPPY_IgnoringCases = -1;
        int namesLastIndex = names.size() - 1;
        for (int i = namesLastIndex ; i >= 0 ; i--) {
            String value = names.get(i);
            if (value.equalsIgnoreCase("HAPPY")) {
                lastIndexOf_HAPPY_IgnoringCases = i;
                break;
            }
        }
        System.out.println("Last index of 'HAPPY' (ignoring cases) -> " + lastIndexOf_HAPPY_IgnoringCases);

        // add
        // remove using index-value
        // remove using value
        // set (to replace value)
        // get (to get value)
        // indexOf
        // lastIndexOf


        /**
         * To find if a given value is EXACTLY present in ArrayList/List
         * method: contains()
         *
         * if a given value is EXACTLY present in ArrayList/List
         *      method returns true
         * else
         *      method returns false
         */
        boolean isContains_Peace = names.contains("Peace");
        System.out.println("\nis contain 'Peace'? -> " + isContains_Peace);

        boolean isContains_Happy = names.contains("Happy");
        System.out.println("is contain 'Happy'? -> " + isContains_Happy);


        boolean isContain_10 = numOfShoes.contains(10);
        // boolean isContain_10 = numOfShoes.contains(new Integer(10));
        System.out.println("isContain_10 -> " + isContain_10);

        /*
            remove(int index)
            remove(Object value)
            numOfShoes.remove(new Integer(10));

            contains(Object value)
         */

        /**
         * To find if the ArrayList/List is empty
         * method: isEmpty()
         *
         * if the ArrayList/List is empty
         *      method returns true
         * else
         *      method returns false
         */
        boolean isNamesEmpty = names.isEmpty();
        System.out.println("\nis names empty? -> " + isNamesEmpty);
        System.out.println("names -> " + names);
        System.out.println("total names in names-ArrayList -> " + names.size());

        /**
         * To empty ArrayList/List
         * method: clear()
         */
        System.out.println("\nClearing all values from names-ArrayList");
        names.clear();

        boolean isNamesEmpty_AfterClear = names.isEmpty();
        System.out.println("\nis names empty? -> " + isNamesEmpty_AfterClear);
        System.out.println("names -> " + names);
        System.out.println("total names in names-ArrayList -> " + names.size());

        // add
        // remove using index-value
        // remove using value
        // set (to replace value)
        // get (to get value)
        // indexOf
        // lastIndexOf
        // contains
        // isEmpty
        // clear

        String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
        System.out.println(Arrays.toString(words));


        /*
            Create a List using Array - method 1
         */
        /*
            list.add(index-0 value from Array)
            list.add(index-1 value from Array)
            list.add(index-2 value from Array)
            ...
            ...
            list.add(index-last value from Array)

            list.add(i value from Array)    i=0,1,2,..., lastIndex
         */
        List<String> wordsList = new ArrayList<>();
        for (int i=0 ; i < words.length ; i++) {
            wordsList.add(words[i]);
        }
        System.out.println("wordsList -> " + wordsList);

        /*
            Create a List using Array - method 2
         */
        /*
            list.add(index-0 value from Array)
            list.add(index-1 value from Array)
            list.add(index-2 value from Array)
            ...
            ...
            list.add(index-last value from Array)

            list.add(i value from Array)    i=0,1,2,..., lastIndex
         */
        List<String> wordsList2 = new ArrayList<>();
        for (String val : words) {
            wordsList2.add(val);
        }
        System.out.println("wordsList2 -> " + wordsList2);

        /*
            Create a List using Array - method 3
         */
        List<String> wordsList3 = Arrays.asList(words);
        System.out.println("wordsList3 -> " + wordsList3);







    }
}
