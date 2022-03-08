package Class3;

public class JavaOperators_Arithmetic {
    public static void main(String[] args) {

        /**
         * Arithmetic (+, -, *, /, %, ++, --)
         * +
         * -
         * *
         * /
         * %    Modulus Operator
         * ++   increment Operator (pre-increment/post-increment operator)
         * --   decrement Operator (pre-decrement/post-decrement operator)
         */

         int num1 = 9;
         double num2 = 5;

        // int num1=9, num2=5;
        double num3 = num1 + num2;     // num3 = 14
        System.out.println(num1 + " + " + num2 + " = " + num3);
        //  9 + 5 = 14

        double num4 = num2 - num1;
        System.out.println(num2 + " - " + num1 + " = " + num4);

        double num5 = num2 * num1;
        System.out.println(num2 + " * " + num1 + " = " + num5);

        double num6 = num1 / num2;     // 1.8
        System.out.println(num1 + " / " + num2 + " = " + num6);
        /**
         * int / int = int
         * double / int = double
         * int / double = double
         *
         * If all numbers/variables in a calculation are int, final answer will be int
         * If any one of numbers/variables in a calculation is double, final answer will be double
         */
        double num7 = num2 / num1;     // 5/9 -> 0.556
        System.out.println(num2 + " / " + num1 + " = " + num7);

        // num1=9, num2=5.0, num3=14.0, num4=-4.0
        double result = (num1 + num2) - (num3 - num4) * num2;
        System.out.println("\nresult = " + result);
        /*
            (num1 + num2) - (num3 - num4) * num2;   BODMAS
            (9 + 5.0) - (14.0 - -4.0) * 5.0
            14.0 - 18.0 * 5.0
            14.0 - 90.0
            -76.0
         */

        /**
         * Convert degree-Celsius into deg-Fahrenheit
         *
         * fT = cT × 9/5 + 32
         *
         */
        double cTemp = 19;
        double fTemp = cTemp * 9/5 + 32;
        System.out.println("\n" + cTemp + "˚C is equal to " + fTemp + "˚F");

        /**
         *  % -> Modulus Operator
         *
         *  7/3 -> 2 (remaining -> 1)
         *  9/3 -> 3 (remaining -> 0) 9 is completely divisible by 3
         *  15/4 -> 3 (remaining -> 3)
         *  0/5 -> 0 (remaining -> 0)
         *  8/5 -> 1 (remaining -> 3)
         *
         *  7%3 -> 1
         *  9%3 -> 0
         *  15%4 -> 3
         *  8%5 -> 3
         *
         *  n%2 if result is 0 means n is even, otherwise n is odd
         */

        int res1 = 7%3;
        System.out.println("\n7 % 3 = " + res1);
        System.out.println("9 % 3 = " + 9%3);
        System.out.println("15 % 4 = " + 15%4);
        System.out.println("8 % 5 = " + 8%5);

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
        int i = 10;
        System.out.println("i = " + i);     // i = 10
        i++;
        System.out.println("i = " + i);     // i = 11
        ++i;
        System.out.println("i = " + i);     // i = 12

        System.out.println("i = " + i++);   // sout and post-increment [print -> i = 12 ; i=13]
        /*
            sout
                use the current(before increment) value of variable; print i = 12
            post-increment
                i = 13
         */

        System.out.println("i = " + i);       // i = 13

        System.out.println("i = " + ++i);     // pre-increment and sout [i=14 , print -> i = 14]

        System.out.println("i = " + i++);     // sout and post-increment [print -> i = 14 ; i=15]

        System.out.println("i = " + ++i);     // pre-increment and sout [i=16 ; print -> i = 16]

        int a = 5;          // a = 5
        int b = a++;        // assignment and post-inc
        /*
            assignment
                b = 5  (bcz, use the current(before increment) value of variable; so 5 will be assigned to b)
            post-inc on variable-a
                a = 6
         */
        int c = ++a;        // assignment and pre-inc
        /*
            pre-inc on variable-a
                a = 7
            assignment
                c = 7
         */

        System.out.println("\na = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);


        int n1 = 10;
        /*
            n1 = 10
         */
        int n2 = ++n1;
        /*
            pre-inc on variable-n1
                n1 = 11
            assignment
                n2 = 11
         */
        int res = ++n2 + n1++;
        /*
            pre-inc on variable-n2  (n2 = 12 ; n1 = 11)
            addition ( n2 + n1 , 12 + 11 = 23 )
            assignment (res = 23)
            post-inc on variable-n1 (n1 = 12 , n2 = 12 )

         */

        System.out.println("\nn1 = " + n1);       // 12
        System.out.println("n2 = " + n2);         // 12
        System.out.println("res = " + res);       // 23

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

        int dec = 2;

        System.out.println(dec--);      // print -> 2 (dec=1)
        /*
            sout   (2)
            post-dec (dec = 1)
         */

        System.out.println(--dec);      // print -> 0 (dec=0)
        /*
            pre-dec (dec=0)
            sout (0)
         */





    }
}
