package Class4;

public class Homework3_Solution {
    public static void main(String[] args) {

        /**
         *
         * Due date: Mar 8 2022
         *
         * Refer for formula: https://www.rapidtables.com/convert/temperature/celsius-to-fahrenheit.html
         *
         * C -> F
         * C -> K
         *
         * F -> C
         * F -> K
         *
         * K -> C
         * K -> F
         *
         */

        /**
         * Convert degree-Celsius into deg-Fahrenheit
         *
         * fT = cT × 9/5 + 32
         *
         */
        double cTemp = 25.3;
        double fTemp = cTemp * 9/5 + 32;
        System.out.println("\n" + cTemp + "˚C is equal to " + fTemp + "˚F");
        /**
         * C -> K
         * T(K) = T(°C) + 273.15
         */
        double kTempUsingCTemp = cTemp + 273.15;
        System.out.println(cTemp + "°C is equal to " + kTempUsingCTemp + "°K");

        /**
         * Convert deg-Fahrenheit into Deg-Celsius (F -> C)
         *
         * cT = (fT - 32) × 5/9
         * fT = 55
         * cT = 12.7778
         *
         */
        double cTempUsingFTemp = (fTemp - 32) * 5/9;
        System.out.println(fTemp + "°F is equal to " + cTempUsingFTemp + "°C");

        /**
         * F -> K
         * T(K) = (T(°F) + 459.67)× 5/9
         */
        double kTempUsingFTemp = (fTemp + 459.67) * 5/9;
        System.out.println(fTemp + "°F is equal to " + kTempUsingFTemp + "°K");

        double kTemp = 55;
        /**
         * K -> C
         * T(C) = T(K) - 273.15
         */
        double cTempUsingKTemp = kTemp - 273.15;
        System.out.println(kTemp + "°K is equal to " + cTempUsingKTemp + "°C");
        /**
         * K -> F
         * T(°F) = T(K) × 9/5 - 459.67
         */
        double fTempUsingKTemp = (kTemp * 9/5) - 459.67;
        System.out.println(kTemp + "°K is equal to " + fTempUsingKTemp + "°F");



    }
}
