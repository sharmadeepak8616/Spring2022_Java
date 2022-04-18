package Class1;

import Class13.Restaurant_Pkg.Restaurant;

public class Basics {


    /**
     * Entire project has to be error free in order to execute any file of the project.
     *
     * Compile Time error:
     *      Any error indicated by java without execution.
     */

    public static void main(String[] args) {

        System.out.println("Hello World");      // sout statement
        /**
         * sout statement --> is used to print in the console.
         *
         * sout -> shortcut to generate System.out.println()
         */

        System.out.println("Have a good day to you sir ** ^^");


        // call open() from Restaurant.
        Restaurant.open();

        // Restaurant r = new Restaurant();
        // r.registration("", "", 100, 20);


    }

    /**
     * main method: starting point of the execution of any java-file/class
     *
     * shortcut to create main method : psvm (intelliJ)
     *
     * In a class, there will ALWAYS be only ONE main method.
     *
     * when we run main-method of a class,
     *      code written inside the main-method will execute.
     *      Any code written outside the main-method in the class will not execute.
     */

    /**
     * Console window: part of intelliJ to view the results.
     *
     * print it or sout it or add sout statement
     */

}