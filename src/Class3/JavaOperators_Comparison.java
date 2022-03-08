package Class3;

public class JavaOperators_Comparison {
    public static void main(String[] args) {

        /**
         * Comparison (>, <, >=, <=, ==, !=)
         *
         * Result of every comparison operation is boolean
         *
         */

        int com1 = 5, com2 = 7;

        boolean com1GrCom2 = com1 > com2;       // > : greater than
        System.out.println(com1 + " > " + com2 + " = " + com1GrCom2);

        boolean com1LeCom2 = com1 < com2;       // < : less than
        System.out.println(com1 + " < " + com2 + " = " + com1LeCom2);

        boolean com1GrEqCom2 = com1 >= com2;    // >= : greater than or equals to
        System.out.println(com1 + " >= " + com2 + " = " + com1GrEqCom2);

        boolean com1LeEqCom2 = com1 <= com2;    // <= : less than or equals to
        System.out.println(com1 + " <= " + com2 + " = " + com1LeEqCom2);

        boolean com1EqCom2 = com1 == com2;   // == : is equals to
        System.out.println(com1 + " == " + com2 + " = " + com1EqCom2);

        boolean com1NtEqCom2 = com1 != com2;   // == : is NOT equals to
        System.out.println(com1 + " != " + com2 + " = " + com1NtEqCom2);

        boolean res = --com2 == com1++;
        /*
            com1=5, com2=7
            pre-dec (com2)      [com1=5, com2=6]
            isEquals-comparison [false]
            assignment          [res = false]
            post-inc (com1)     [com1=6, com2=6]

         */
        System.out.println("res = " + res);     // false
        System.out.println("com1 = " + com1);   // com1 = 6
        System.out.println("com2 = " + com2);   // com2 = 6


    }
}
