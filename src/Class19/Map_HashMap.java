package Class19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_HashMap {
    public static void main(String[] args) {
        /**
         *  Array, List, Set
         *  How many values can be store at a given index? -> 1
         *
         *  Map
         *  How many values can be store at a given index? -> 1-pair
         *
         *  List<Integer> ssnNumbers = [1111, 2222, 3333, 4444, 5555]
         *  List<String> names = ["Happy", "King", "Queen", "Joy", "Lilly"]
         *
         *  [(1111 - Happy) , (2222 - King) , (3333 - Queen) , (4444 - Joy) , (5555 - Lilly) , (6666 - Happy)]
         *  [(Happy - 1111) , (2222 - King) , (3333 - Queen) , (4444 - Joy) , (5555 - Lilly) , (Happy - 6666)]
         *
         *  StudentIds - 1, 2, 3, 4
         *  [(1 - [90, 89, 67, 89, 90]) , (2 - [90, 89, 67, 88, 99]) , (3 - [88, 87, 77, 89, 98]) , (4 - [90, 66, 67, 89, 92])]
         *
         *  [([90, 89, 67, 89, 90] - 1) , (2 - [90, 89, 67, 88, 99]) , ([88, 87, 77, 89, 98] - 3) , ([90, 66, 67, 89, 92] - 4)]
         *
         *  String[] colorNames = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
         *             "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
         *             "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
         *             "green", "green"};
         *
         * green - 7
         * blue - 5
         * red - 10
         * yellow - 8
         * grey - 6
         *
         * { (green - 7) , (blue - 5) , }
         *
         * List<String> colorNames = [blue, green, ]
         * List<Integer> colorCount = [7, 5, ]
         */
        /**
         * HashMap/Map: It is a non-primitive datatype which can store multiple pairs of values.
         * --> HashMap does NOT maintain the order of insertion
         * because, HashMap uses HASHING technique to store the data in memory.
         *
         * Map can store a (key-value) pair in every index
         *
         * { (key1 -> val1) , (key2 -> val2) , (key3 -> val3) , (key4 -> val4) }
         *
         * --> Key is ALWAYS UNIQUE in a Map
         * --> using the key, we can get the corresponding value
         *
         * Syntax of HashMap/Map:
         * HashMap<keyDatatypeClass, valueDatatypeClass> myHashMap = new HashMap<>();
         *      OR
         * Map<keyDatatypeClass, valueDatatypeClass> myMap = new HashMap<>();
         *
         * datatypeClass/WrapperClass : class which represent the primitive datatypes.
         *      int ->  Integer
         *      double  -> Double
         *      char -> Character
         *      boolean -> Boolean
         *      String -> String
         */
        /**
         * green - 7
         * blue - 5
         * red - 10
         * yellow - 8
         * grey - 6
         *
         * { (green - 7) , (blue - 5) , }
         *
         * Map<String, Integer> colorCount = new HashMap<>();
         *
         *  List<Integer> ssnNumbers = [1111, 2222, 3333, 4444, 5555]
         *  List<String> names = ["Happy", "King", "Queen", "Joy", "Lilly"]
         *
         *  [(1111 - Happy) , (2222 - King) , (3333 - Queen) , (4444 - Joy) , (5555 - Lilly) , (6666 - Happy)]
         *  [(Happy - 1111) , (2222 - King) , (3333 - Queen) , (4444 - Joy) , (5555 - Lilly) , (Happy - 6666)]
         *
         * --> Store ssnNumbers and Names as String
         *
         * HashMap<String, String> ssnData = new HashMap<>();
         *
         *
         *
         *  StudentIds - 1, 2, 3, 4
         *  [(1 - [90, 89, 67, 89, 90]) , (2 - [90, 89, 67, 88, 99]) , (3 - [88, 87, 77, 89, 98]) , (4 - [90, 66, 67, 89, 92])]
         *
         *  [([90, 89, 67, 89, 90] - 1) , (2 - [90, 89, 67, 88, 99]) , ([88, 87, 77, 89, 98] - 3) , ([90, 66, 67, 89, 92] - 4)]
         *
         *  Key Datatype -> Integer
         *  Value Datatype -> Integer[] / List<Integer>
         *
         *  Map<Integer , Integer[]> studentsData = new HashMap<>();
         *
         *  Map<Integer , List<Integer>> studentsData = new HashMap<>();
         *
         */
        /**
         * Store data of ssn and corresponding names
         * key = Integer (ssn)
         * value = String (name)
         */
        Map<Integer, String> ssnData = new HashMap<>();     // {}


        /**
         * To find the length/size of HashMap/Map
         * method: size()
         * return type: int
         */
        int ssnDataSize = ssnData.size();

        System.out.println("ssnData -> " + ssnData);
        System.out.println("ssnData size -> " + ssnDataSize);

        /**
         * To add a pair in HashMap/Map
         * Method: put
         */
        ssnData.put(1111, "Happy");
        ssnData.put(2222, "King");
        ssnData.put(3333, "QUEEN");
        ssnData.put(4444, "Joy");
        ssnData.put(5555, "Lilly");
        ssnData.put(2222, "Kingdom of dreams");
        ssnData.put(6666, "QUEEN");
        ssnData.put(7777, "joyful");
        ssnData.put(8888, "Lilly");
        ssnData.put(9999, "Kingdom of dreams");
        ssnData.put(1000, "Queenful");
        ssnData.put(1110, "Joy");
        ssnData.put(2220, "lili");
        ssnData.put(3330, "Kingdom of dreams");
        ssnData.put(4440, "King and Queen");
        ssnData.put(5550, "Joy");
        ssnData.put(6660, "Lilly");
        ssnData.put(7770, "Kingdom of dreams");

        System.out.println("\nssnData -> " + ssnData);
        System.out.println("ssnData size -> " + ssnData.size());

        Map<String, Integer> colorCount = new HashMap<>();
        colorCount.put("Green", 7);
        colorCount.put("Blue", 7);
        colorCount.put("red", 10);
        colorCount.put("grey", 10);

        /**
         * To remove a pair from HashMap/Map
         * method: remove()
         *
         * usage:
         * 1. by providing the key-value pair that we want to remove
         * 2. by providing the key that we want remove
         */

        /**
         * remove() by providing the key-value pair that we want to remove (#1)
         *
         * if the exact pair is found in the HashMap/Map
         *      method will remove the pair and return true
         * else
         *      method will return false
         *
         */
        boolean is_7770KOD = ssnData.remove(7770, "Kingdom of DReams");
        System.out.println("\nis (7770, Kingdom of DReams) removed -> " + is_7770KOD);

        boolean is_7770Lilly = ssnData.remove(7770, "Lilly");
        System.out.println("is (7770, Lilly) removed -> " + is_7770Lilly);

        boolean is_6660Lilly = ssnData.remove(6660, "Lilly");
        System.out.println("is (6660, Lilly) removed -> " + is_6660Lilly);

        System.out.println("\nssnData -> " + ssnData);
        System.out.println("ssnData size -> " + ssnData.size());

        /**
         * remove() by providing the key that we want to remove (#2)
         *
         * if the exact key is found in the HashMap/Map
         *      method will remove the pair and return the corresponding value
         * else
         *      method will return null
         *
         */
        String valueWith_6060 = ssnData.remove(6060);
        System.out.println("\nRemoved '6060, value associated with '6060' -> " + valueWith_6060);

        String valueWith_7770 = ssnData.remove(7770);
        System.out.println("Removed '7770', value associated with '7770' -> " + valueWith_7770);

        System.out.println("\nssnData -> " + ssnData);
        System.out.println("ssnData size -> " + ssnData.size());


        /**
         * To get the value corresponding to an input-key
         * method: get()
         *
         * if the input-key is exact found in the Map/HashMap
         *      method returns the corresponding value
         * else
         *      method returns null
         */
        String valueWith5555 = ssnData.get(5555);
        System.out.println("\nValue associated with '5555' -> " + valueWith5555);

        String valueWith909 = ssnData.get(909);
        System.out.println("Value associated with '909' -> " + valueWith909);

        System.out.println("\nssnData -> " + ssnData);
        System.out.println("ssnData size -> " + ssnData.size());

        /**
         * To find if a given-data is present as one of the keys in Map/HashMap
         * Method: containsKey()
         * return type: boolean
         *
         * if the given-data is exactly present as one of the keys
         *      method returns true
         * else
         *      method returns false
         *
         */
        boolean is1010AsKey = ssnData.containsKey(1010);
        System.out.println("\nis '1010' present as one of the keys -> " + is1010AsKey);

        boolean is1110AsKey = ssnData.containsKey(1110);
        System.out.println("is '1110' present as one of the keys -> " + is1110AsKey);


        /**
         * To find if a given-data is present as one of the values in Map/HashMap
         * Method: containsValue()
         * return type: boolean
         *
         * if the given-data is exactly present as one of the values
         *      method returns true
         * else
         *      method returns false
         *
         */
        boolean is7777AsValues = ssnData.containsValue("7777");
        System.out.println("\nis '7777' present as one of the values -> " + is7777AsValues);

        boolean isQuEENAsValues = ssnData.containsValue("QuEEN");
        System.out.println("is 'QuEEN' present as one of the values -> " + isQuEENAsValues);

        boolean isHappyAsValues = ssnData.containsValue("Happy");
        System.out.println("is 'Happy' present as one of the values -> " + isHappyAsValues);

        boolean isKingAsValues = ssnData.containsValue("King");
        System.out.println("is 'King' present as one of the values -> " + isKingAsValues);

        /*
            size
            put
            remove using the pair
            remove using the key
            get
            containsKey
            containsValue
         */

        // {7777=joyful, 3330=Kingdom of dreams, 3333=QUEEN, 1000=Queenful, 6666=QUEEN, 2220=lili, 2222=Kingdom of dreams}
        /**
         * To get all the keys of Map/HashMap in a variable
         * method: keySet()
         * return type: Set
         */
        Set<Integer> allKeys = ssnData.keySet();
        System.out.println("\nAll keys -> " + allKeys);

        /**
         * To get all the values of Map/HashMap in a variable
         * method: values()
         * return type: Collection
         */
        Collection<String> allValues = ssnData.values();
        System.out.println("\nallValues -> " + allValues);

        /**
         * To find if HashMap/Map is empty
         * method: isEmpty()
         * return type: boolean
         *
         * if the HashMap/Map is empty
         *      method will return true
         * else
         *      method will return false
         */
        boolean isSsnDataEmpty = ssnData.isEmpty();
        System.out.println("\nis ssnData empty? -> " + isSsnDataEmpty);

        /**
         * To clear all data form the HashMap/Map
         * method: clear
         */
        System.out.println("\nClearing the data from ssnData-Map...");
        ssnData.clear();

        boolean isSsnDataEmptyAfterClear = ssnData.isEmpty();
        System.out.println("\nis ssnData empty (after clear)? -> " + isSsnDataEmptyAfterClear);


       /*
            size
            put
            remove using the pair
            remove using the key
            get
            containsKey
            containsValue
            keySet
            values
            isEmpty
            clear
         */







    }
}
