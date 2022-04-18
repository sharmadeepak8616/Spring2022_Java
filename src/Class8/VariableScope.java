package Class8;

public class VariableScope {

    /**
     *
     * 1. Field Variables (Global variables / Class variables)
     *  Variable which we create inside the Class but outside ALL methods
     *  Scope: within the class
     *  --> when we need to use a variable in multiple methods
     *
     *
     * 2. Local Variables:
     *  Variables which we create inside a method
     *  Scope: within the method
     *
     *  when a variable created in a method -> scope is within the method
     *  when a variable created in a loop -> scope is within the loop
     *  when a variable created in a if/else -> scope is within the if/else
     *
     *
     *
     *
     *
     */

    static String var = "String field variable value";      // Field variable
    static double balance = 10.90;                          // Field variable

    public static void main(String[] args) {
        String name = "Hello";                              // Local variable of main method
        int num = 10;                                       // Local variable of main method

        System.out.println(var);

        System.out.println(name);

        num = 100;

        char letter = 'a';                                  // Local variable of main-method
        for (int i=0 ; i < 5 ; i++) {                       // Local variable of for-loop
            System.out.println(i);
            System.out.println(letter);
        }
        System.out.println(letter);
        if (num > 10) {
            int b = 11;                                     // Local variable of if-block
            System.out.println(b);
        }

    }



}
