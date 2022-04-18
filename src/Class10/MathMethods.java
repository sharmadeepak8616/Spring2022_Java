package Class10;

public class MathMethods {

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
     * Create method to add 2-int values
     *  1. what is the purpose of the method?   ->  add2Ints
     *  2. do I need any input from user?       ->  int num1, int num2
     *  3. should we return any value in the end of method? -> Yes
     *      If yes, then what is the datatype of returned value? -> int(total)
     */
    public int add2Ints(int num1, int num2) {
        int total = num1 + num2;
        return total;
    }

}
