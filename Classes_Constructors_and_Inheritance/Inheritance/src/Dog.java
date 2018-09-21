public class Dog extends Animal
{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat)
    {
        super(name, 1, 1, size, weight); // super calls the constructor for the class that we are extending from.
        this.eyes = eyes;
        this.legs = legs;
        this.coat = coat;
        this.teeth = teeth;
    }
    private void chew(){
        System.out.println("Dog.Chew called");

    }

    @Override // reminder that we are overriding a method in the super class
    public void eat() {
        System.out.println("Dog.Eat called");
        chew();
        super.eat(); // call the supervisor equiv. on this class.
    }

    public void walk(){
        System.out.println("Dog.walk called");
        super.move(5);
    }
    public void run(){
        System.out.println("Dog.run called");
        move(10);
    }
    private void moveLegs(int speed)
    {
        System.out.println("Dog.movelegs() called");
    }
    @Override
    public void move(int speed) {
        System.out.println("dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
