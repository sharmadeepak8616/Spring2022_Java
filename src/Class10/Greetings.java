package Class10;

public class Greetings {

    /**
     * Create method to print Good Morning
     *  1. what is the purpose of the method?   ->  say good morning (name: sayGoodMorning)
     *  2. do I need any input from user?       ->  No
     *  3. should we return any value in the end of method?     -> No
     *      If yes, then what is the datatype of returned value?   [return type = void]
     */
    public void sayGoodMorning() {
        System.out.println("Good Morning");
    }

    /**
     * Create method to print Good Morning to user (like, Good Morning Deepak or Good Morning Ivan)
     *  1. what is the purpose of the method?   ->  say good morning to user (name: sayGoodMorningToUser)
     *  2. do I need any input from user?       ->  String(name)
     *  3. should we return any value in the end of method?     -> No
     *      If yes, then what is the datatype of returned value?   [return type = void]
     */
    public static void sayGoodMorningToUser(String name) {
        System.out.println("Good Morning " + name);
    }


}
