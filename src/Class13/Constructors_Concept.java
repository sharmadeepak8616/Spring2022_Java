package Class13;

public class Constructors_Concept {

    /**
     * Constructor: It's a special method.
     * 1. It has the SAME NAME as of the class.
     * 2. It does NOT have any return type, not even void
     *
     * Technical use of Constructor -> In order to create an object of a class,
     *                                 java runs the Constructor method of the class.
     *
     * To execute normal method -> using object or className.
     * To execute Constructor method -> when we create an object, constructor method will be executed AUTOMATICALLY.
     *
     *
     *
     * Syntax:
     * <accessModifier> <constructorMethodName> (inputParametersIfRequired) {
     *      // code we want to execute
     *      // in order to create an object
     * }
     *
     * 1. Constructor can be public, protected or private
     *      public -> allows to create object of the class anywhere in the project
     *      protected -> allows to create object of the class ONLY within the package
     *      private -> object of the class CANNOT be created.
     *      (when all methods/variables in a class is static, we can have private constructor)
     *      eg: Math.java
     * 2. Constructor can have any number of arguments.
     * 3. We can have one or more Constructors in a class
     *      This is due to Method Overloading or Compile Time Polymorphism or Constructor Overloading.
     * 4. If user defined constructor is present in the class, Java will NEVER create a default constructor.
     *
     *
     */



}
