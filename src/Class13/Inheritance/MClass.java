package Class13.Inheritance;

public class MClass {

    public static void main(String[] args) {

        CClass cc = new CClass();
        // cc is a variable of CClass and storing object of CClass
        cc.pMethod();
        // cc gets access to methods from which classes (CClass, PClass)


        PClass pp = new PClass();
        // pp is a variable of PClass and storing object of PClass
        pp.investments();
        // pp gets access to methods from which classes (PClass)


        PClass pc = new CClass();   // Parent-Class variable CAN store Child-Class object
        // pc is a variable of PClass and storing object of CClass
        pc.investments();
        // pc gets access to methods from which classes (PClass BUT, overridden methods from CClass)


        // CClass cp = new PClass();   // Child-Class variable CANNOT store Parent-Class object
        // Compile Time error

    }
}
