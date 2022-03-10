package Class4;

public class JavaOperators_Arithmetic_Doubts {
    public static void main(String[] args) {

        /**
         * Increment Operator (++)
         *      increments the current value in variable by 1
         *
         * Pre-increment and Post-increment operator
         *
         * int i = 10;
         * i++;     (i = 11)    --> post-increment
         * ++i;     (i = 12)    --> pre-increment
         *
         * post -> with any other action in the same line.
         *          use the current(before increment) value of variable for the other action
         *          then increment the value in variable
         *          (use current value(before increment) for action , then perform-increment)
         *
         * pre -> with any other action in the same line.
         *          increment the value in variable
         *          then use the latest/updated (after increment) value of variable for the other action
         *          (perform-increment, use latest value(after increment) for action)
         */

        int a = 10;

        a++;        // post increment on variable-a (this will make a=11)

        System.out.println(a);          // 11   [sout prints the value of a]

        System.out.println("Hello");    // [sout prints Hello]

        System.out.println(a++);        // sout then post-inc [sout prints the value of a] [post increment on variable-a (this will make a=12)]

        System.out.println("Hello again");

        System.out.println(a);          // 12



        int num = 5;                // assignment [num = 5]

        int num1 = ++num * 2;               // pre-inc , multiplication and assignment
                                            /*
                                            ++num;                  [pre-inc on variable-num (num=6)]

                                            num * 2                 12

                                            int num1 = 12;         num1=12 , num=6
                                            */

        int num2 = (num1++ + ++num) * 2;   // pre-inc, addition, multiplication, assignment, post-inc
                                            /*
                                                ++num               [pre-inc on variable-num (num=7)]

                                                num1 + num          [12 + 7 = 19]

                                                (result-of-addition) * 2    [19 * 2 = 38]

                                                int num2 = 38

                                                post-inc            [post-inc on variable-num1 (num1=13)]
                                             */

        System.out.println(num);

        System.out.println(num1);

        System.out.println(num2);


        /**
         * Decrement Operator (--)
         *      decrements the current value in variable by 1
         *
         * Pre-decrement and Post-decrement operator
         *
         * int i = 10;
         * i++;     (i = 11)    --> post-decrement
         * ++i;     (i = 12)    --> pre-decrement
         *
         * post -> with any other action in the same line.
         *          use the current(before decrement) value of variable for the other action
         *          then decrement the value in variable
         *          (use current value(before decrement) for action , then perform-decrement)
         *
         * pre -> with any other action in the same line.
         *          decrement the value in variable
         *          then use the latest/updated (after decrement) value of variable for the other action
         *          (perform-decrement, use latest value(after decrement) for action)
         *
         */
        System.out.println("\nDecrements...\n");






    }
}
