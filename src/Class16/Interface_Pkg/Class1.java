package Class16.Interface_Pkg;

public class Class1 implements MyInterface, MyInterface2 {

    public void goodMorning() {
        System.out.println("GOod morning");
    }

    public void sayHello() {
        System.out.println("Hello User");
    }

    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public void sayHello(String fName, String lName) {
        System.out.println("Hello " + fName + " " + lName);
    }

    public void sortArray() {
        System.out.println("Sort Array...");
    }

    public void findMax() {
        System.out.println("Find Max...");
    }

    public void findMin() {
        System.out.println("Find Min...");
    }
}
