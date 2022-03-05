package Class2;

public class Datatypes_NonPrimitive {
    public static void main(String[] args) {

        /**
         * String: is a non-Primitive datatype
         *         can store single or multiple characters
         *
         * value must be enclosed in double-quotes
         *
         * String is a Class
         *
         */

        String myName = "Deepak Sharma";
        // datatype of myName variable is String
        // datatype of "Deepak Sharma" value is String

        System.out.println("My name is " + myName);

        String randoms = ".    jkdhkjdsh ldsjlsdj l     iouiweu          .";
        String randomValues = "Random values -> ";

        System.out.println(randomValues + randoms);
        // Random values -> .    jkdhkjdsh ldsjlsdj l     iouiweu          .

        // School system has grades A,B,C,D,E
        // write code to store grade of a student
        // char studentGrade = 'A';
        // String studentGrade = "A";

        // School system has grades A,A-,A+,B-,B,B+,C,D,E
        // write code to store grade of a student
        String studentGrade = "A+";


        // String myName = "Deepak Sharma";

        System.out.println(myName);     // Deepak Sharma

        myName = "Happy";

        System.out.println(myName);     // Happy

        myName = myName + " world";
        //     = "Happy" + " world"
        //     = "Happy world"

        System.out.println(myName);
        // Happy world      <----- correct ans
        // Happyworld
        // myNameworld
        // DeepakSharmaworld
        // myName world


















    }
}
