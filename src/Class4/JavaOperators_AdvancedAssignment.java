package Class4;

public class JavaOperators_AdvancedAssignment {
    public static void main(String[] args) {

        /**
         * Advanced Assignment (+=, -=, *=, /=, %=)
         *
         */
        int num = 10;
        // use increment operator and make num=15;
//        num++;
//        num++;
//        num++;
//        num++;
//        num++;

        // num = num + 5;
        num += 5;

        System.out.println(num);        // 15

        // num = num - 5;
        num -= 5;

        System.out.println(num);        // 10

        // num = num * 5;
        num *= 5;

        System.out.println(num);        // 50

        // num = num / 5;
        num /= 5;

        System.out.println(num);        // 10

        // num = num % 5;
        num %= 5;

        System.out.println(num);        // 0


        double bankBalance = 100000;
        double withAmt = 8987;


        bankBalance-=withAmt;   // bankBalance = bankBalance - withAmt;
        System.out.println("\nBank balance : " + bankBalance);

        double depAmt = 19877;
        bankBalance += depAmt; // bankBalance = depAmt + bankBalance;

        System.out.println("\nBank balance : " + bankBalance);

























    }
}
