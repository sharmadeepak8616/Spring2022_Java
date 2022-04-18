package Class19;

import java.util.*;

public class Map_HashMap_Practice {
    public static void main(String[] args) {
        Map<String, Integer> colorCount = new HashMap<>();
        colorCount.put("Green", 7);
        colorCount.put("Blue", 7);
        colorCount.put("red", 10);
        colorCount.put("grey", 10);

        /**
         *  Print the Map data like below:
         *
         *  GREEN = 7
         *  BLUE = 7
         *  RED = 10
         *  GREY = 10
         *
         *  COLORNAME = COLORCOUNT
         *
         */

        System.out.println(colorCount);

        /*
            get all keys in a variable -> [Green, Blue, red, grey]

            pick colorName
            convert colorName in to Uppercase
            print the (uppercase-colorName + " = " + get(colorName))

            pick colorName
            convert colorName in to Uppercase
            print the (uppercase-colorName + " = " + get(colorName))


         */
        Set<String> colorNames = colorCount.keySet();   // [Green, Blue, red, grey]

        for (String colorName : colorNames) {
            Integer clrCount = colorCount.get(colorName);
            System.out.println(colorName.toUpperCase() + " = " + clrCount);
        }

        Map<Integer, String> ssnData = new HashMap<>();
        ssnData.put(1111, "Happy");
        ssnData.put(2222, "King");
        ssnData.put(3333, "QUEEN");
        ssnData.put(4444, "Joy");
        ssnData.put(5555, "Lilly");
        /**
         * print data like, SSN = XXXX , Name = YYYYY
         *
         * get all keys in a variable
         *
         * pick on the keys (key1)
         * find the value associated with the key
         * sout ("SSN = " + key + " , Name = " + value)
         *
         * pick on the keys (key2)
         * find the value associated with the key
         * sout ("SSN = " + key + " , Name = " + value)
         *
         */
        Set<Integer> allKeys = ssnData.keySet();
        for (Integer key : allKeys) {
            String name = ssnData.get(key);
            System.out.println("SSN = " + key + " , Name = " + name);
        }

        /**
         * Print the name associated with userSsn
         * if userSsn is present in the system,
         *      print their name
         * else
         *      print no information found in the system
         */
        Integer userSsn = 3333;
        /**
         * check if userSsn is present as one of the keys (use: containsKey)
         * if true
         *      get the value for userSsn
         *      print it
         * else
         *      print no information found in the system
         */
        boolean isUserSsnPresent = ssnData.containsKey(userSsn);
        if (isUserSsnPresent) {
            System.out.println("Name for ssn - " + userSsn + " is " + ssnData.get(userSsn));
        } else {
            System.out.println("no information found in the system for ssn - " + userSsn);
        }




        Integer[] score1 = {90, 89, 67, 89, 90};
        Integer[] score2 = {90, 99, 97, 80, 99};
        Integer[] score3 = {90, 99, 77, 81, 90};

        Map<Integer , Integer[]> studentsData = new HashMap<>();

        studentsData.put(1, score1);
        studentsData.put(2, score2);
        studentsData.put(3, score3);

        // System.out.println("\n\nstudentsData -> " + studentsData);
        /*
            StudentId = 1
            Score = {90, 89, 67, 89, 90}
         */
        /**
         *  get all keys in a variable (1, 2, 3)
         *
         *  get the value for key-1 (Integer[])
         *  print Integer[] , Arrays.toString()
         *
         */
        Set<Integer> studentIds = studentsData.keySet();
        for (Integer id : studentIds) {
            Integer[] score = studentsData.get(id);
            System.out.println("StudentId = " + id);
            System.out.println("Score = " + Arrays.toString(score));
        }

        // Find the student-id who scored maximum marks
        /*
            student-id = 1
            score = {90, 89, 67, 89, 90}
            total = X
            {(1 - X) }

            student-id = 2
            score = {90, 99, 97, 88, 99}
            total = Y
            {(1 - X) , (2 - Y)}

            student-id = 3
            score = {90, 99, 77, 81, 90}
            total = Z

            {(1 - X) , (2 - Y) , (3 - Z)} <- totalMap

            get all values from totalMap (use: values) [X, Y, Z]
            find the max out of X, Y, Z
            max = Y

            find the key belongs to value=Y , 2

         */
        Map<Integer, Integer> totalMap = new HashMap<>();

        // get all keys from studentsData in a variable
        Set<Integer> allIds = studentsData.keySet();    // allIds = {1, 2, 3}

        for (Integer id : allIds) {
            Integer[] score = studentsData.get(id);
            int total = 0;
            for (Integer num : score) {
                total += num;
            }
            totalMap.put(id, total);
        }
        System.out.println("\n\ntotalMap -> " + totalMap);

        Collection<Integer> allValues = totalMap.values();
        Integer max = 0;
        for (Integer val : allValues) {
            if (val > max) {
                max = val;
            }
        }
        System.out.println("max -> " + max);
                                            // max -> 465
        Integer maxStudentId = 0;           //  {1=425, 2=465, 3=437}
        for (Integer id : allIds) {         // allIds = 1, 2, 3
            Integer total = totalMap.get(id);
            if (total == max) {
                maxStudentId = id;
                break;
            }
        }
        System.out.println("Student id = " + maxStudentId + " scored max = " + max);








    }
}
