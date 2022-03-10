package Class4;

public class JavaOperators_Logical_2 {
    public static void main(String[] args) {

        /**
         * Logical (&&, ||, !)
         *
         * && -> and operator
         * || -> or operator
         * ! -> not operator
         *
         */
        /**
         * We use logical operators to join two or more conditions.
         * Final result will always be boolean
         *
         * && operator (and operator)
         *  all combined conditions must be true to get final result as true
         *  if any one of the conditions is false, final result is false.
         *
         * || operator (or operator)
         *  any one of the combined conditions has to be true to get final result as true
         *  if all combined conditions are false, then final result is false.
         *
         * ! operator (not operator)
         *  not operator will make true as false and vice versa
         *
         */

        double atmWithdrawLimit = 1000;

        double bankBalance = 1000000;

        double amountToWithdraw = 2000;

       // amountToWithdraw <= bankBalance && amountToWithdraw <= atmWithdrawLimit

        int lVar1=10, lVar2=20, lVar3=30, lVar4=40;

        boolean lRes1 = lVar1 <= lVar3 && !(lVar2 == lVar4-lVar3);
        /*
                10 <= 30 && !(lVar2 == lVar4-lVar3)
                true && !(20 == 40-30)
                true && !(20 == 10)
                true && !(false)
                true && true
                true
         */

        /*
                10 <= 30 && !(lVar2 == lVar4-lVar3)
                true && (20 != 40-30)
                true && (20 != 10)
                true && (true)
                true && true
                true
         */


    }
}
