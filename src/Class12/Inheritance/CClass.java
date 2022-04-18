package Class12.Inheritance;

public class CClass extends PClass {

    String cName = "Child Class";

    public void cMethod() {
        System.out.println("Inside cMethod");
    }

    public void investments() {
        // run the childClass-cMethod on this line.
        cMethod();
        // run the parentClass-pMethod on this line.
        pMethod();
        // run the parentClass-investments on this line.
        super.investments();
        // run the parentClass-investments("Currency") on this line.
        super.investments("Currency");
        System.out.println("Buy Crypto");
    }

    public void investments(String item) {
        System.out.println("Sell " + item);
    }



}
