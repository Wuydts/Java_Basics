import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) 
   {
       /*
            Wanted to find the age of person dynamically rather than statically having the date assigned. 
            To do that I had to insert a format that I wanted (in this case just the year), pass it into the SimpleDateFormat, and
            generate today's date utilizing that format... That way I only get the year back rather than the whole date.
       
            Then, I have to parse the year as an integer, and do the math.
       */
       Scanner scanner = new Scanner(System.in);
       String format = "yyyy";
       SimpleDateFormat dateFormat = new SimpleDateFormat(format);
       String date = dateFormat.format(new Date());
       
       System.out.println(date);
       
       System.out.println("What year were you born in?");
       int yearOfBirth = scanner.nextInt();
       scanner.nextLine(); // handle next line character (enter key)
       
       System.out.println("What is your first name?");
       String name = scanner.nextLine();
       
       int thisYear = Integer.parseInt(date);
       int age = thisYear - yearOfBirth; 
       
       System.out.println("Your name is: " + name + " and you are " + age + " years old.");
       
       scanner.close();  
   }
}
