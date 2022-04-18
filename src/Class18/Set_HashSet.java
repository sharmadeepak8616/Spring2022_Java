package Class18;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Set_HashSet {
    public static void main(String[] args) {
        /**
         * Set/HashSet: It is a non-primitive datatype which can store multiple values.
         * --> Set/HashSet DOES NOT maintain the order of insertion
         * because, HashSet uses HASHING technique to store the data/value in memory.
         *
         * "hello"
         * "laugh"
         * "pen"
         * "king kong"
         * "king and queen"
         * "eye"
         * "listen to all"
         *
         * HashSet/Set vs ArrayList/List
         * 1. ArrayList/List maintains the order of insertion
         *  HashSet/Set does NOT maintain the order of insertion.
         *
         * 2. ArrayList/List can store duplicate values,
         *  HashSet/Set does NOT store duplicate values.
         *
         *  Syntax of create HashSet/Set:
         *  HashSet<datatypeClass> myHashSet = new HashSet<>();
         *      OR
         *  Set<datatypeClass> mySet = new HashSet<>();
         *
         * datatypeClass/WrapperClass : class which represent the primitive datatypes.
         *      int ->  Integer
         *      double  -> Double
         *      char -> Character
         *      boolean -> Boolean
         *      String -> String
         *
         */
        // store temp-values of last week -> store in List<Double>
        // store student-ids of this batch -> store in HashSet<Integer>

        HashSet<Double> tempValues = new HashSet<>();

        /**
         * To find the length of HashSet/Set
         * method: size()
         * return type: int
         */
        System.out.println("\ntempValues -> " + tempValues);
        System.out.println("Total tempValues stored -> " + tempValues.size());

        /**
         * To add value/data in HashSet/Set
         * method: add
         *
         * -> HashSet does NOT maintain the order of insertion.
         */
        tempValues.add(10.0);
        tempValues.add(23.2);
        tempValues.add(55.3);
        tempValues.add(10.4);
        tempValues.add(2.2);
        tempValues.add(57.3);
        tempValues.add(10.2);
        tempValues.add(23.4);
        tempValues.add(55.3);
        tempValues.add(11.4);
        tempValues.add(33.4);
        tempValues.add(65.3);

        System.out.println("\ntempValues -> " + tempValues);
        System.out.println("Total tempValues stored -> " + tempValues.size());


        /**
         * To remove a value/data from HashSet/Set
         * method: remove()
         *
         * usage:
         *   by providing the value/data which needs to be removed
         *
         * if the value is exactly found in the HashSet/Set
         *      method will remove the FIRST OCCURRENCE of the value and return true
         * else
         *      method returns false
         */
        boolean is10_0Removed = tempValues.remove(10.0);
        System.out.println("\nis 10.0 removed -> " + is10_0Removed);

        boolean is10_1Removed = tempValues.remove(10.1);
        System.out.println("is 10.1 removed -> " + is10_1Removed);

        System.out.println("\ntempValues -> " + tempValues);
        System.out.println("Total tempValues stored -> " + tempValues.size());

        /**
         * To find if a given value is EXACTLY present in HashSet/Set
         * method: contains()
         * return type: boolean
         *
         * if a given value is EXACTLY present in ArrayList/List
         *      method returns true
         * else
         *      method returns false
         *
         */
        boolean is10_0Contains = tempValues.contains(10.0);
        System.out.println("\n10.0 contains -> " + is10_0Contains);

        boolean is10_2Contains = tempValues.contains(10.2);
        System.out.println("10.2 contains -> " + is10_2Contains);

        boolean is57_3Contains = tempValues.contains(57.3);
        System.out.println("57.3 contains -> " + is57_3Contains);


        System.out.println("\ntempValues -> " + tempValues);
        System.out.println("Total tempValues stored -> " + tempValues.size());

        /**
         * To find if the HashSet/Set is empty
         * method: isEmpty()
         * return type: boolean
         *
         * if the HashSet/Set is empty
         *      method returns true
         * else
         *      method returns false
         */
        boolean isTempValuesEmpty = tempValues.isEmpty();

        System.out.println("\nis tempValues empty? -> " + isTempValuesEmpty);
        System.out.println("tempValues -> " + tempValues);
        System.out.println("Total tempValues stored -> " + tempValues.size());

        /**
         * To empty HashSet/Set
         * method: clear()
         */
        System.out.println("\nClearing all values from the tempValues-HashSet");
        tempValues.clear();

        boolean isTempValuesEmptyAfterClean = tempValues.isEmpty();
        System.out.println("\nis tempValues empty? -> " + isTempValuesEmptyAfterClean);
        System.out.println("tempValues -> " + tempValues);
        System.out.println("Total tempValues stored -> " + tempValues.size());


        // add
        // remove using value
        // contains
        // isEmpty
        // clear



    }


















}
