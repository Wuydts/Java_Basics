public class Main {
     public static void main(String[] args)
    {
        boolean test1 = bark(true, 1);   // should return true as its before 8am
        boolean test2 = bark(false, 2);  // should return false since the dog is not barking
        boolean test3 = bark(true, 8);   // should return false since its not before 8am (its equal)
        boolean test4 = bark(true, -1);  // should return false because the hourOfDay param needs to be in range of 0 - 23
        
        System.out.println("Test 1: " + test1);
        System.out.println("Test 2: " + test2);
        System.out.println("Test 3: " + test3);
        System.out.println("Test 4: " + test4);
        
    }
    public static boolean bark(boolean barking, int hourOfDay)
    {
         // hourOfDay valid only between 0 - 23
         // Barking indicates if we are currently barking
        
        /* -----CONCEPT-----
        Have to wake up in dog is barking BEFORE 8 or AFTER 22. 
            
        IN all other cases we return false. 
        
        */
        if(!barking) // If dog is not barking it does not matter what time of day it is. 
        {
            return false;
        }  
        if(hourOfDay < 0 || hourOfDay > 23) // If the hour of day is not correct we automatically return false. 
            return false;
        
        // If we get here then we know the dog has to be barking, and the hour of day is a valid input.
        if(hourOfDay < 8 || hourOfDay > 22)
            return true;
        else
            return false;
         
     
     
 
    }
}
