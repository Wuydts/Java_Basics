/*
    if minutes < 0 print "Invalid Value"
    Otherwise calculate total days and years, and print it out.
 */

public class Main {
    public static void main(String[] args)
    {
        printYearsAndDays(561600);
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
    }
    public static void printYearsAndDays(long minutes)
    {
        if(minutes < 0)
            System.out.println("Invalid Value");
        else
        {
            final int hour = 60, day = 24, year = 365;
            long totalHours = 0, totalDays = 0, totalYears = 0;
        
            totalHours = minutes / hour; // Take minutes and put into hour format.
            totalDays = totalHours / day; // Take hours and put into day format.
            totalYears = totalDays / year; // Take days and put into year format.
            totalDays = totalDays % year; // Now that we have the total year, we can put in the remainder of days. 
        
            System.out.println(minutes + " min = " + totalYears + " year(s) and " + totalDays + " day(s)");
        }
    }
}
