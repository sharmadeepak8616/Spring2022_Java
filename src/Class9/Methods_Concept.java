package Class9;

public class Methods_Concept {

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

    /**
     * Create a method to make deposit in account?
     *  1. what is the purpose of the method?   ->  to deposit  (name: toDeposit)
     *  2. do I need any input from user?       ->  double(amount) , int(accNum)
     *  3. should we return any value in the end of method? -> Yes
     *      If yes, then what is the datatype of returned value? -> double(balance) [return type = double]
     *
     */

    /**
     * Create method to print Good Morning
     *  1. what is the purpose of the method?   ->  say good morning (name: sayGoodMorning)
     *  2. do I need any input from user?       ->  No
     *  3. should we return any value in the end of method?     -> No
     *      If yes, then what is the datatype of returned value?   [return type = void]
     */
    public static void sayGoodMorning() {
        System.out.println("Good Morning");
    }

    /**
     * Create method to print Good Morning to user (like, Good Morning Deepak or Good Morning Ivan)
     *  1. what is the purpose of the method?   ->  say good morning to user (name: sayGoodMorningToUser)
     *  2. do I need any input from user?       ->  String(name)
     *  3. should we return any value in the end of method?     -> No
     *      If yes, then what is the datatype of returned value?   [return type = void]
     */
    public static void sayGoodMorningToUser(String name) {
        System.out.println("Good Morning " + name);
    }

    /**
     * Create a method to add 3-int values
     *  1. what is the purpose of the method?   ->  add3Ints
     *  2. do I need any input from user?       ->  int num1, int num2, int num3
     *  3. should we return any value in the end of method? -> Yes
     *      If yes, then what is the datatype of returned value? -> int(total)
     */
    public static int add3Ints(int num1, int num2, int num3) {
        int total = num1 + num2 + num3;
        return total;
    }

    /**
     * Create a method to total of values of an int-array
     *  1. what is the purpose of the method?   ->  get total values (name: sumOfArray)
     *  2. do I need any input from user?       ->  int[]
     *  3. should we return any value in the end of method? ->  Yes
     *      If yes, then what is the datatype of returned value?  -> int
     *
     * <accessModifier> [static] <returnType> <methodName>(<parameters>) {
     *     // code to perform
     *     // the task/purpose of the method
     *     return statement // if you are planning to return any value from the method
     * }
     */
    public static int sumOfArray(int[] inputArray) {
        int result = 0;
        for (int X=0 ; X < inputArray.length ; X++) {
            result += inputArray[X];
        }
        return result;
    }
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

        System.out.println("Before method");

        sayGoodMorning();

        sayGoodMorningToUser("Deepak");

        int a = 10;
        System.out.println(add3Ints(2, 3, a));

        int num = add3Ints(2, 3, 4);
        System.out.println("num -> " + num);

        int numm = add3Ints(2, 3, 4) + 87 - 12;
        System.out.println("numm -> " + numm);

        System.out.println("Last show");
        int[] numbers = {23, 12, 54, 65, 23};
        System.out.println("Total of array -> " + sumOfArray(numbers));

        int[] newData = {34, 21, 56, 76, 23};
        System.out.println("total -> " + sumOfArray(newData));

    }



}
