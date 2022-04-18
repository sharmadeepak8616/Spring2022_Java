package Class10;

import Class9.Methods_Concept;

public class Methods_Concept_2 {

    /**
     * Methods: Lines of code to perform a specific task
     *
     * Benefit: No code repetition
     *
     * Good Practice: Method name should reflect the purpose of the method
     *
     * Important:
     *      All methods MUST be inside the class
     *      A method MUST NOT be created inside another method
     *
     * Questions to answer before creating a method:
     *  1. what is the purpose of the method?
     *  2. do I need any input from user?
     *  3. should we return any value in the end of method?
     *      If yes, then what is the datatype of returned value?
     *
     */
    static int abc = 20;

    /**
     * Syntax to create method:
     *
     * <accessModifier> [static] <returnType> <methodName>(<parameters>) {
     *     // code to perform
     *     // the task/purpose of the method
     *     return statement // if you are planning to return any value from the method
     * }
     *
     * <accessModifier>
     *     defines from where you can access the method (default: public)
     *
     * static
     *     defines how you can access the method, using className (if static present) or classObject
     *
     * <returnType>
     *     If you are planning to return a value, returnType should be the datatype of that value
     *     If you are NOT planning to return a value, returnType should be void
     *
     * <parameter>
     *     If you need input(s) from user, create variable(s) of required datatype
     *     If you DON'T need input(s) from user, no parameter in the parenthesis
     *
     *
     */

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        int arrayTotal = Methods_Concept.sumOfArray(numbers);
        double len = numbers.length;
        double avg = arrayTotal/len;     // int/double -> double
        System.out.println("Average -> " + avg);

        // add 3-int values
        // use add3Ints from MathMethods (add3Ints is static)
        // bcz add3Ints is a astatic method
        // we have to use ClassName (of Class in which method is created) in order to access it.
        int ans = MathMethods.add3Ints(2, 4, abc);
        System.out.println("ans -> " + ans);

        // add 2-int values
        // use add2Ints from MathMethods (add2Ints is non-static)
        // bcz, add2Ints is a non-static method,
        // we have to use Class-object (of Class in which method is created) in order to access it.
        /**
         * Syntax to create Class object
         * ClassName varName = new ClassName();
         */
        MathMethods mmObj = new MathMethods();
        int ans2 = mmObj.add2Ints(4, 5);
        System.out.println("ans2 -> " + ans2);

        // add 6,5
        // add 2-int values
        // use add2Ints from MathMethods (add2Ints is non-static)
        // bcz, add2Ints is a non-static method,
        // we have to use Class-object (of Class in which method is created) in order to access it.
        System.out.println("6 + 5 = " + mmObj.add2Ints(6,5));


        /**
         * Check if "Syntax to create Class object" contains "Tax"
         * ignore cases
         */
        // containsIgnoreCase from StringManipulators
        // use containsIgnoreCase from StringManipulators (containsIgnoreCase is static)
        // bcz, containsIgnoreCase is a static method,
        // we have to use ClassName (of Class in which method is created) in order to access it.
        boolean isContains = StringManipulators.containsIgnoreCase("Syntax to create Class object", "Tax");
        System.out.println("isContains -> " + isContains);

        int[] arr = {90, 87, 34, 23};
        double average = ArrayManipulators.intArrayAverage(arr);
        System.out.println("average -> " + average);

        /**
         * If you want to use STATIC method:
         *      if you are using it in the same class, then className (of Class in which method is created) is not required.
         *      if you are using it in the another class, then className (of Class in which method is created) is required.
         *
         * If you want to use NON-STATIC method:
         *      then classObject (of Class in which method is created) is required.
         *      [ if classObject is not created within the scope (so, create classObject) ]
         */

        randomMethod();
        randomMethod();

        Methods_Concept_2 mc2 = new Methods_Concept_2();
        mc2.randomMethod2();

    }

    public static void randomMethod() {
        System.out.println("Random method");
    }

    public void randomMethod2() {
        System.out.println("Random method");
    }

}
