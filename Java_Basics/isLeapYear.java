/*
    in the isYearLeap Param. Year needs to be > 1 and <= 9999. If not in range return false
    If in range calculate if the year is a leap year, and return true if it is.
    Otherwise return false. 
 */

public class Main {
    public static void main(String[] args)
    {
        boolean test1 = isLeapYear(-1600); // should return false since not in range
        boolean test2 = isLeapYear(1600);  // should return true since 1600 is a leap year
        boolean test3 = isLeapYear(2017);  // should return false since not a leap year
        boolean test4 = isLeapYear(2000);  // should return true since 2000 is a leap year
        
      
        
        System.out.println("test 1: -1600 " + test1);
        System.out.println("test 2: 1600 " + test2);
        System.out.println("test 3: 2017 " + test3);
        System.out.println("test 4: 2000 " + test4);
        
        
        
    }
    public static boolean isLeapYear(int year)
    {
        //a leap year is divisible by 4 but not by 100, or it is divisble by 400.
        if(year < 1 || year > 9999)
            return false;
        else if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) )
            return true;
        else
            return false;
    }
}
