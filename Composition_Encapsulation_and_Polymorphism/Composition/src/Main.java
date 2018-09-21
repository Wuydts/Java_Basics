public class Main {
//Composoition has a relationship. "modeling" parts that makes a whole.
// In this example the PC is built from a case, monitor, and motherboard
// created the PC by passing the 3 other objects to it.

    public static void main(String[] args) {
	Case theCase = new Case("220b", "Dell","240", new Dimensions(20, 20, 20));
        Monitor theMonitor = new Monitor("27 Inch Hyperion", "Acer,", 27, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("MSI B250", "Tomahawk", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.PowerUP();



    }
}
