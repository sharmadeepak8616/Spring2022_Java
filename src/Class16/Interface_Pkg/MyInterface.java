package Class16.Interface_Pkg;

public interface MyInterface {
    /**
     * Abstract Method: is a method that cannot have a body
     */

    /**
     * 1. To create interface, we use 'interface' keyword
     * 2. It looks like a Class
     * 3. By default, all methods in Interface are considered as abstract methods.
     * 4. We can create variable of Interface, but CANNOT create an object of Interface
     *      MyInterface mi;     <--- Allowed
     *      new MyInterface();  <--- NOT allowed
     *      --> Interface variable will store the object of related class (directly/indirectly)
     *
     * 5. A Class can implement an Interface using 'implements' keyword
     * 6. Class implementing the Interface, has to give body to all abstract methods
     * 7. A class can implement one or more Interfaces.
     * 8. We can have normal methods in Interface, it HAS TO BE static
     *      (bcz, we cannot create object of Interface)
     * 9. We can have inheritance in Interfaces as well
     *      (by using 'extends' keyword)
     *
     *  class <---> class   (Inheritance using 'extends' keyword)
     *
     *  Interface <---> Interface   (Inheritance using 'extends' keyword)
     *
     *  class <---> Interface (Implements using 'implements' keyword)
     *
     * Note: In case a class implements a child-Interface
     * Class has to provide body to all abstract methods from child-Interface and parent-Interface
     *
     */
    public void sayHello();

    public void sayHello(String name);

    public void sayHello(String fName, String lName);

    public static void printMsg() {
        System.out.println("print msg...");
    }


}
