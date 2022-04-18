package Class12.Institute;

public class Student {

    // Properties
    // name, age, state, courseName, studentId
    String name="John", state="NY", courseName;
    int age, studentId;
    static String[] courses = {"QA", "Dev", "Support", "PM"};
    static int totalStudents=0;

    // Actions
    // enroll, changeName, changeAge, changeState, changeCourse, showProfile

    /**
     * enroll
     *
     *  1. what is the purpose of the method?   -   toEnroll
     *  2. do I need any input from user?   -   Yes(name, age, state, courseName)
     *      age < 18 and check courseName   ->  No eligible for the enrollment
     *      age >= 18 and check wrong-courseName   ->  Provide valid course name
     *      age >= 18 and check courseName  -> complete enrollment
     *  3. should we return any value in the end of method?
     *      If yes, then what is the datatype of returned value? (return studentId)
     */
    public void toEnroll(String sName, int sAge, String sState, String sCourseName) {
        if (sAge < 18) {
            System.out.println("No eligible for the enrollment\n");
        } else {
            // check if sCourseName is present in {"QA", "Dev", "Support", "PM"}
            if (checkStringInArray(sCourseName, courses)) {
                name = sName;
                age = sAge;
                state = sState;
                courseName = sCourseName;
                totalStudents++;
                studentId = totalStudents;
                System.out.println("\nThank you for the enrollment.\nYour student id :" + studentId);
            } else {
                System.out.println("Provide valid course name\n");
            }
        }
    }

    /**
     * Enrollment without State
     */
    public void toEnroll(String sName, int sAge, String sCourseName) {
        if (sAge < 18) {
            System.out.println("No eligible for the enrollment\n");
        } else {
            // check if sCourseName is present in {"QA", "Dev", "Support", "PM"}
            if (checkStringInArray(sCourseName, courses)) {
                name = sName;
                age = sAge;
                courseName = sCourseName;
                totalStudents++;
                studentId = totalStudents;
                System.out.println("\nThank you for the enrollment.\nYour student id :" + studentId);
            } else {
                System.out.println("Provide valid course name\n");
            }
        }
    }

    public void toEnroll(String sName, double sAge, String sCourseName) {
        if (sAge < 18) {
            System.out.println("No eligible for the enrollment\n");
        } else {
            // check if sCourseName is present in {"QA", "Dev", "Support", "PM"}
            if (checkStringInArray(sCourseName, courses)) {
                name = sName;
                // age = sAge;
                courseName = sCourseName;
                totalStudents++;
                studentId = totalStudents;
                System.out.println("\nThank you for the enrollment.\nYour student id :" + studentId);
            } else {
                System.out.println("Provide valid course name\n");
            }
        }
    }

    public void toEnroll(String sName, String sCourseName, int sAge) {
        if (sAge < 18) {
            System.out.println("No eligible for the enrollment\n");
        } else {
            // check if sCourseName is present in {"QA", "Dev", "Support", "PM"}
            if (checkStringInArray(sCourseName, courses)) {
                name = sName;
                age = sAge;
                courseName = sCourseName;
                totalStudents++;
                studentId = totalStudents;
                System.out.println("\nThank you for the enrollment.\nYour student id :" + studentId);
            } else {
                System.out.println("Provide valid course name\n");
            }
        }
    }

    /*
            public void toEnroll(String sName, int sAge, String sCourseName)

            public int toEnroll(String sName, int sAge, String sCourseName)

     */

    public boolean checkStringInArray(String strToCheck, String[] strArray) {
        boolean isPresent = false;
        for (String str : strArray) {
            if (str.equalsIgnoreCase(strToCheck)) {
                isPresent = true;
                break;
            }
        }
        return isPresent;
    }

    /**
     * Name
     * Age
     * State
     * Course Name
     *
     */
    public void showProfile() {
        System.out.println("\nProfile:\nName : " + name
            + "\nStudent id : " + studentId
            + "\nAge : " + age
            + "\nState : " + state
            + "\nCourse Name : " + courseName);
    }

    /**
     * changeName
     *  1. what is the purpose of the method?   -   changeName
     *  2. do I need any input from user?   -   Yes(newName)
     *  3. should we return any value in the end of method?
     *      If yes, then what is the datatype of returned value?
     */
    public void changeName(String newName) {
        if(!name.equals(newName)) {
            name = newName;
            System.out.println("Name changed successfully");
        } else {
            System.out.println("Your are already enrolled with same name (" + name + ")");
        }
    }

    /**
     * changeAge
     *  1. what is the purpose of the method?   -   changeName
     *  2. do I need any input from user?   -   Yes(newName)
     *  3. should we return any value in the end of method?
     *      If yes, then what is the datatype of returned value?
     */
    // Practice
    public void changeAge(int newAge) {
        /**
         * Change age if satisfy below conditions:
         *  1. newAge is different than already stored age
         *  1. newAge >= 18
         */
    }

    public void changeState(String newState) {
        if(!state.equals(newState)) {
            state = newState;
            System.out.println("State changed successfully");
        } else {
            System.out.println("Your are already enrolled with same state (" + state + ")");
        }
    }

    // Practice
    public void changeCourseName(String newCourseName) {
        /**
         * Change course name if satisfy below conditions:
         *  1. newCourseName is different than already enrolled course
         *  2. newCourseName is one the of provided courses
         */
    }

    /**
     * Method to sayGoodBye
     */
    public void bye() {
        System.out.println("Good bye Technosoft");
    }

    /**
     * Method to wishesFromStudents
     */
    public void wishes() {
        System.out.println("Happy holidays");
    }


}
