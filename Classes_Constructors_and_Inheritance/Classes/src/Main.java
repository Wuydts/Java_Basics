

public class Main {
    public static void main(String[] args)
    {
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carrera");
        holden.setModel("cruz");
        System.out.println("Model is " + porsche.getModel());
        System.out.println("Model: " + holden.getModel());
    }

}
