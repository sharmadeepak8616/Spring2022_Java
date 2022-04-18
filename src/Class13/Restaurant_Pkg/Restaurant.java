package Class13.Restaurant_Pkg;

public class Restaurant {
    /**
     * Class is representing Restaurant
     * Each object of this class will represent -> restaurant
     */
    /*
        number of tables
        location
        name
        phone
        maxCapacity (10)
        menu
        employees
        numOfGuestsAtPresent (4)
        totalGuestsServedToday
        totalGuestsServedTodayOverAll
     */
    private int numTables;
    private static String name = "Our Restaurants";
    private String location;
    private String phone = "222-333-4444, 444-555-6666";
    private int maxCapacity;
    private static String menu = "Vegan, Chinese, Italian, Thai, Deserts";
    private int employees;
    private int numOfGuestsAtPresent;
    private int totalGuestsServedToday;  // to find total number of guests served today per restaurants
    private static int totalGuestsServedTodayOverAll;  // to find total number of guests served today in all restaurants


    /*
        Register
        Open
        Close
        checkAvailability
        addGuests
            showMenu
        removeGuests
        addEmployees
        removeEmployees
        showRestaurantStat
            Location:
            Num of employees:
            Max Capacity:
            Number of guests at present:
            Total guests served as of now:
     */
    public Restaurant(String rLocation, String rPhone, int rMaxCapacity, int rEmployees) {
        location = rLocation;
        phone = rPhone;
        maxCapacity = rMaxCapacity;
        employees = rEmployees;
    }

    public Restaurant(String rLocation, int rMaxCapacity, int rEmployees) {
        location = rLocation;
        maxCapacity = rMaxCapacity;
        employees = rEmployees;
    }



//    /**
//     *  Location, phone, maxCapacity, employees
//     */
//    public void registration(String rLocation, String rPhone, int rMaxCapacity, int rEmployees) {
//        location = rLocation;
//        phone = rPhone;
//        maxCapacity = rMaxCapacity;
//        employees = rEmployees;
//    }
//
//    /**
//     *  Location, maxCapacity, employees
//     */
//    public void registration(String rLocation, int rMaxCapacity, int rEmployees) {
//        location = rLocation;
//        maxCapacity = rMaxCapacity;
//        employees = rEmployees;
//    }

    public static void open() {
        System.out.println("Welcome to our restaurant.");
    }

    private static void close() {
        // numOfGuestsAtPresent = 0;
        totalGuestsServedTodayOverAll=0;
        // totalGuestsServedToday = 0;
        System.out.println("Thank you for eating here.");
    }

    public void showStats() {
        System.out.println("\n\nRestaurant stats:\nLocation: " + location);
        System.out.println("Phone: " + phone);
        System.out.println("Max Capacity: " + maxCapacity);
        System.out.println("Guests at present: " + numOfGuestsAtPresent);
        System.out.println("Guests served today: " + totalGuestsServedToday);
        System.out.println("Guests served overall: " + totalGuestsServedTodayOverAll);
    }

    public boolean checkAvailability(int tableFor) {
        return (maxCapacity-numOfGuestsAtPresent) >= tableFor;
    }

    public void addGuests(int numGuests) {
        if (numGuests > 0 && numGuests <= maxCapacity) {
            if (checkAvailability(numGuests)) {
                numOfGuestsAtPresent += numGuests;
                totalGuestsServedToday += numGuests;
                totalGuestsServedTodayOverAll += numGuests;
            } else {
                System.out.println("Please wait for 15 mins");
            }
        } else {
            System.out.println("Invalid number of guests entered -> " + numGuests);
        }
    }

    protected void removeGuests(int numGuests) {
        if (numGuests > 0 && numGuests <= maxCapacity) {
            numOfGuestsAtPresent -= numGuests;
        } else {
            System.out.println("Invalid number of guests entered -> " + numGuests);
        }
    }

    protected static void changeRestaurantName(String newName) {
        name = newName;
    }


}
