package Class15.Date_Calendar_Pkg;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendar_Concept {
    public static void main(String[] args) {

        Calendar c1 = Calendar.getInstance();
        System.out.println(c1);

        /**
         * To create Date-object using Calendar-instance
         * method: getTime()    [from Calendar class]
         * return type: Date
         */
        Date fromC1 = c1.getTime();
        System.out.println("\nDate using Calendar-instance -> " + fromC1);


        String dateString = "04/07/2050 09-50-50";      // date/month/year hour-min-seconds
        Date newDate = null;

        SimpleDateFormat makeDate = new SimpleDateFormat("dd/MM/yyyy hh-mm-ss");

        try {
            newDate = makeDate.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("newDate -> " + newDate);


        /**
         *  To create Calendar instance using Date-object
         *  method: setTime()   [from Calendar class]
         */
        c1.setTime(newDate);

        System.out.println("\n\n" + c1);









    }
}
