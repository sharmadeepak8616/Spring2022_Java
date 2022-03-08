package Class3;

public class JavaOperators_Logical {
    public static void main(String[] args) {

        /**
         * Logical (&&, ||, !)
         *
         * && -> and operator
         * || -> or operator
         * ! -> not operator
         *
         * are you 18 or above and live in NY  --> less colg fee
         * age >= 18 and state == NY
         * true and false
         * false
         *
         *
         * are you 18 or above OR live in NY  --> less colg fee
         * age >= 18 or state == NY
         * true or false
         * true
         *
         * is it not raining -> false
         * !(is it raining)
         * !(true)
         * false
         *
         * are you above 65 -> false
         * !(age < 65)
         * !(true)
         * false
         *
         *
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
         *
         */

        int lVar1=10, lVar2=20, lVar3=30, lVar4=40;

        boolean lRes1 = (lVar2 == lVar4+lVar3) && lVar1 <= lVar3;
        /*
            (lVar2 == lVar4+lVar3) && lVar1 <= lVar3
            (20 == 40+30) && 10 <= 30
            (20 == 70) && 10 <= 30
            false && true
            false
         */
        System.out.println("lRes1 = " + lRes1);


        boolean lRes2 = lVar3 < lVar4 || (lVar2+lVar3-lVar1 == lVar4 && lVar4+lVar1 <= lVar3%lVar2);
        /*
                lVar3 < lVar4 || (lVar2+lVar3-lVar1 == lVar4 && lVar4+lVar1 <= lVar3%lVar2);
                30 < 40 || (20+30-10 == 40 && 40+10 <= 30%20)
                true || (40 == 40 && 40+10 <= 30%20)
                true || (true && 40+10 <= 30%20)
                true || (true && 50 <= 10)
                true || (true && false)
                true || false
                true
         */
        System.out.println("lRes2 = " + lRes2);



    }
}
