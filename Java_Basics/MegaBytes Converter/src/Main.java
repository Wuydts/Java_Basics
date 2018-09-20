public class Main {
    public static void main(String[] args)
    {
        printMegaBytesAndKiloBytes(2050); 
        printMegaBytesAndKiloBytes(-5); 
        printMegaBytesAndKiloBytes(5981); 
        printMegaBytesAndKiloBytes(30); 
        
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) 
    {
        if(kiloBytes < 0)
        {
            System.out.println("Invalid Value");
        }
        else
        {
        final int kilo = 1024;
        int megabytes, remainder;
        
        megabytes = kiloBytes / kilo;
        remainder = kiloBytes % kilo;
                
        System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainder + " KB");
        }
        //1024 kilobytes = 1 megabyte
        // "XX KB = YY MB and ZZ KB".
        // XX represents the orginal value kilobytes.
        // YY represented the calculated megabyes. 
        // ZZ represents the remaining kilobytes. 
     
    }
     
}
