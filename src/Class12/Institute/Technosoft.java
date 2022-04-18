package Class12.Institute;

public class Technosoft {


    public static void main(String[] args) {

        /**
         * when we create an object of a class
         *
         * obj gets
         *      it's own copy of non-static variables with default values
         *      static variables with their current values (static variables are shared between objects)
         */
        Student s1 = new Student();
        // s1 -> name="John", state="NY", courseName="", age=0, studentId=0, totalStudents=0, courses = {"QA", "Dev", "Support", "PM"}

        s1.toEnroll("Sam", 20, "TX", "QA");
        // s1 -> name="Sam", state="TX", courseName="QA", age=20, studentId=1, totalStudents=1, courses = {"QA", "Dev", "Support", "PM"}


        Student s2 = new Student();
        // s2 -> name="John", state="NY", courseName="", age=0, studentId=0, totalStudents=1, courses = {"QA", "Dev", "Support", "PM"}

        s2.toEnroll("Deepak", 22, "NJ", "Dev");
        // s2 -> name="Deepak", state="NJ", courseName="Dev", age=22, studentId=2, totalStudents=2, courses = {"QA", "Dev", "Support", "PM"}


//        s1.showProfile();
//        /*
//            name = Sam
//            Student id = 0
//            Age = 20
//            State = TX
//            Course Name = QA
//
//         */

        Student s3 = new Student();
        s3.toEnroll("Three", 22, "QA");

        Student s4 = new Student();
        s4.toEnroll("Four", "Dev", 22);



    }


}
