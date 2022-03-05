package Class2;

public class Datatypes {

    public static void main(String[] args) {

        /**
         * numbers
         *      whole                   ->      byte, short, int, long
         *      decimal                 ->      float, double
         *
         * text
         *      single-character        ->      char
         *      multi-character         ->      String
         *
         * yes/no
         *      true/false              ->      boolean
         */

        /**
         * We store the value so that we can use/call it anytime.
         *      Permanent place to store a value is database
         *      Temporary place to store a value is Variables
         */

        /**
         * How many datatypes we have in Java?
         * We have 2 types of datatypes in Java
         * 1. Primitive
         *      Datatypes which comes with Core Java
         *      --> byte, short, int, long, float, double, char, boolean
         *
         * 2. Non-Primitive (All Java Class and Interface are Non Primitive datatypes)
         *      Datatypes which got added in java by Java users
         *      --> String, Array etc
         *
         */

        /**
         * We need variables to store the value.
         * IMP: Type of data must be same as the datatype of variable
         *
         * Syntax to create a variable:
         *
         *      datatype varName;       // create a variable (name = varName), and datatype is datatype.
         *      varName = val;          // storing value (val) inside variable (named varName)
         *
         *      -- OR --
         *
         *      datatype varName = val;
         *
         */

        // Write code to create a variable of double type of any name
        double abcd;        // abcd is a variable of double-datatype

        // Write code to store number of family member in your family (4)
        byte familyMember = 4;

        familyMember = 5;       // change the value in familyMember from 4 to 5

        // byte familyMember = 5;       // cannot have two variable with same name in a scope

        /**
         * Good practices to provide names:
         * 1. Variables:
         *      -> name cannot have spaces
         *      -> name should relate with the stored value
         *      -> name should always start with lowercase
         *      -> never start with digit or special character
         *      -> if name having more than 1 word, follow camelCaseFormat
         *      eg:
         *      family member -> familymember -> familyMember
         *      number of my cars -> numberofmycars -> numberOfMyCars
         *
         * 2. Class:
         *      -> name cannot have spaces
         *      -> name should relate to the code inside Java class
         *      -> name should always start with Uppercase
         *      -> never start with digit or special character
         *      -> if name having more than 1 word, follow CamelCaseFormat
         *
         * 3. Package:
         *      -> name cannot have spaces
         *      -> name should relate to the Java files inside the package
         *      -> name should always start with Uppercase
         *      -> never start with digit or special character
         *      -> if name having more than 1 word, follow CamelCaseFormat
         */


    }

}
