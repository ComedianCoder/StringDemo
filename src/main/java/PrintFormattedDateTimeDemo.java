import java.util.Date;

public class PrintFormattedDateTimeDemo {

    public static void main(String[] args) {

        Date date = new Date();

        System.out.printf("%tT %n",date); // Output in HH:MM:SS format

        /*
            T - HH:MM:SS
            H - Hours
            M - Minutes
            S - Seconds
            L - Milli Seconds
            N - Nano Seconds
            p - AM/PM format
            Z - Offset / Time Zone
         */

        System.out.printf("%1$tH:%1$tM:%1$tS %1$tL %1$tN %1$tp %1$tZ  %n", date); // Sample Output 01:15:01 067 067000000 am IST


        /*
            A - Day
            B - Month
            Y - Year in YYYY
            d - date in dd
            m - month in mm
            y - year in yy
         */

        System.out.printf("%1$tA %1$tB %1$tY %n" , date); // Sample Output Monday March 2022

        System.out.printf("%1$td.%1$tm.%1$ty", date); // Sample Output 14.03.22








    }

}
