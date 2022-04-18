package Class16.Date_Calendar_Pkg;

import sun.java2d.pipe.SpanShapeRenderer;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Calendar_Concept_2 {

    public static void main(String[] args) {

        // Empty Date variable
        Date date = null;

        Calendar c1 = Calendar.getInstance();
        // System.out.println(c1);

        // assign value to Date-variable (date)
        date = c1.getTime();
        System.out.println("date -> " + date);

        // add 2 hours in current time
        // subtract 5 days in current time
        // add 4 months in current time
        c1.add(Calendar.HOUR, 1);
        // c1.add(Calendar.DATE, -5);
        // c1.add(Calendar.MONTH, 4);


        // System.out.println("\n\n"+c1);
        date = c1.getTime();
        System.out.println("date -> " + date);

        /**
         * 1. get Current Calender
         * 2. Add 2 hours in it
         * 3. use getTime to get Date-value
         * 4. using SimpleDateFormat(ha) print hour am/pm    // Now 11pm 1am 3am 5am
         * 5. using format method on Date-value of step-3
         * 6. print the result
         */
        printTimeLine(4);

        /**
         * Select current Date as Check Date
         * Select Checkout Date as 7 days from Checkout Date
         *
         * Check-in : Apr 6
         * Check-out : Apr 13
         */

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");

            Date d1 = sdf.parse("04/06/2022 09:00:00");
            Date d2 = sdf.parse("04/06/2022 18:00:00");

            long diff = d2.getTime() - d1.getTime();

            TimeUnit timeunit = TimeUnit.HOURS;
            long timeGap = timeunit.convert(diff, TimeUnit.MILLISECONDS);

            System.out.println("\n\ntimeGap -> " + (timeGap));
        } catch (ParseException e) {
            e.printStackTrace();
        }








    }

    public static void printTimeLine(int dataPoints) {
        SimpleDateFormat myFormat = new SimpleDateFormat("ha");
        Calendar cal = Calendar.getInstance();
        System.out.print("Now");
        for (int i=1 ; i < dataPoints ; i++) {
            cal.add(Calendar.HOUR, 2);
            Date dateFromCal = cal.getTime();
            System.out.print(" " + myFormat.format(dateFromCal).toLowerCase());   // 8pm
        }
    }

}
