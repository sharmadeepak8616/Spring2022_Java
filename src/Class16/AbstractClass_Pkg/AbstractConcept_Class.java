package Class16.AbstractClass_Pkg;

public abstract class AbstractConcept_Class {

    /**
     * Abstract Method: is a method that cannot have a body
     */

    /**
     * 1. To create Abstract class, we use 'abstract' keyword
     * 2. Like any normal class, it can have field variables and normal methods
     *      and, it can ALSO have abstract methods.
     * 3. By default, all methods in AbstractClass are considered as normal methods.
     *      If we want to create an abstract method, we HAVE TO use 'abstract' keyword
     *      after the access-modifier of the method.
     * 4. We can create variable of Abstract class, BUT
     *      we CANNOT create object of Abstract class.
     *      --> AbstractClass variable will store the object of related class (directly/indirectly)
     *      AbstractConcept_Class acc;      <--- Allowed
     *      new AbstractConcept_Class();      <--- NOT Allowed
     *
     * 5. Child of AbstractClass has to give body to all abstract-methods of ParentClass(or AbstractClass)
     */

    String name = "happy";

    public void hello() {
        System.out.println("Hello");
    }

    public abstract void bye();

    public abstract int addNumbers(int n1, int n2);


}
