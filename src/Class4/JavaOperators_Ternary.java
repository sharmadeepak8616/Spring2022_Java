package Class4;

public class JavaOperators_Ternary {
    public static void main(String[] args) {

        /**
         * Ternary (?:)
         *
         *  used in situation where you want to assign value to a variable depending on condition(s)
         *
         * mortgageRate = 1.5/2.5 [creditScore>700 / otherwise]
         *
         * mortgageRate = 1.5/2.5 [creditScore>700 or first-time-buyer / otherwise]
         *
         * mortgageRate = 1.0/2.5 [creditScore>700 and first-time-buyer and veteran / otherwise]
         *
         * Not Valid scenario:
         * mortgageRate = 1.0/1.5/2.5 [creditScore>700 and first-time-buyer and veteran / creditScore>700 and first-time-buyer / otherwise]
         *
         * Syntax:
         *
         * variable = condition(s) ? valueIfTrue : valueIfFalse
         *
         *
         * eg:  mortgageRate = 1.5/2.5 [creditScore>700 / otherwise]
         *
         * int creditScore = 770;
         * mortgageRate = creditScore > 700 ? 1.5 : 2.5;
         * sout(mortgageRate)
         *
         *
         * eg: mortgageRate = 1.5/2.5 [creditScore>700 or first-time-buyer / otherwise]
         *
         * boolean isFirstTimeBuyer = true
         *
         * mortgageRate = creditScore > 700 || isFirstTimeBuyer == true ? 1.5 : 2.5
         *
         *
         */

        // mortgageRate = 1.5/2.5 [creditScore>700 or first-time-buyer / otherwise]
        int creditScore = 0;
        boolean isFirstTimeBuyer = true;
        double mortgageRate = creditScore > 700 || isFirstTimeBuyer == true ? 1.5 : 2.5;    // false || true -> true
        System.out.println("Mortgage rate = " + mortgageRate);

        /*
            isFirstTimeBuyer == true
            false == true
            false


            isFirstTimeBuyer
            false


            booleanVariable == true     <->   booleanVariable

            booleanVariable == false    <->   !booleanVariable
         */


        // mortgageRate = 1.5/2.5 [creditScore>700 and first-time-buyer / otherwise]
        mortgageRate = creditScore > 700 && isFirstTimeBuyer ? 1.5 : 2.5;    // false && true -> false
        System.out.println("\nMortgage rate = " + mortgageRate);


        /*

            booleanVariable == true     <->   booleanVariable

            booleanVariable == false    <->   !booleanVariable



            Assume: isFirstTimeBuyer = true


            isFirstTimeBuyer == true     <->   isFirstTimeBuyer
            true == true                        true
            true

            isFirstTimeBuyer == false    <->   !isFirstTimeBuyer
            true == false                      !true
            false                              false


            Assume: isFirstTimeBuyer = false


            isFirstTimeBuyer == true     <->   isFirstTimeBuyer
            false == true                      false
            false

            isFirstTimeBuyer == false    <->   !isFirstTimeBuyer
            false == false                     !false
            true                                true

         */










    }
}
