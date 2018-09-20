/*
    prevent use of < 0 numbers.
    use method overloading to write the area for a circle and rectangle. 
 */


public class Main {
      public static void main(String[] args)
    {
        double test1 = area(5.0); // should return 78.53975
        double test2 = area (-1); // should return -1
        double test3 = area (5.0, 4.0); //should return 20.0
        double test4 = area (-1.0, 4.0); // should return -1

        System.out.println("area 5.0: " + test1);
        System.out.println("area -1: " + test2);
        System.out.println("area 5.0, 4.0 : " + test3);
        System.out.println("area -1.0, 4.0 : " + test4);
                    
   
    }
    public static double area(double radius)
    {
        // r * r * pi
        final double pi = 3.14159;
        double area = 0;
          
        if(radius < 0)
            return -1.0;
        else
        {
            area = radius * radius * pi;
            return area;
        }
    }
    public static double area(double x, double y)
    {
        // area = x * y
        double area = 0;
        if (x < 0 || y < 0)
            return -1.0;
        else
        {
            area = x * y;
            return area;
        }     
      }
}
