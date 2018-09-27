

class Movie{
    private String name;
    public Movie(String name) {
        this.name = name;
    }
    public String plot(){
    return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }
    public String plot(){
        return "A shark eats lots of people";
    }
}

class IndependenceDay  extends Movie{
    public IndependenceDay () {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Alients attempt to take over planet earth.";
    }
}

class MazeRunner extends Movie{
    public MazeRunner(){
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze.";
    }
}

class StarWars extends Movie{
    public StarWars(){
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe.";
    }
}

class Forgettable extends Movie{
    public Forgettable(){
        super("Forgettable");
    }
    //no plot method for this one.
}


public class Main {
/*Polymorphism: The method or mechanism that allows actions to act different differently based on the actual
 object that the action is being performed on.

We are assigning different kinds of functionality based on the type of object that we created.
Also notice in Forgettable - it inherits from another class but doesn't have a plot so it uses
                             the movie class.
 */

    public static void main(String[] args) {
        for(int i = 1; i < 11; i++)
        {
            Movie movie = randomMovie();
            System.out.println("Movie #: " + i + " : " + movie.getName() + "\n" +
                    "Plot: " +movie.plot() + "\n");
        }

    }
    public static Movie randomMovie(){ //Its purpose is to return a random movie.
        int randomNumber = (int) (Math.random() * 5) + 1; // * 5 returns a # between 1 and 4. + 1 makes it between 1 and 5.
        System.out.println("Random number generated was: " + randomNumber);
        switch(randomNumber) {
            case 1:
                return new Jaws();

            case 2:
                return new IndependenceDay();

            case 3:
                return new MazeRunner();

            case 4:
                return new StarWars();

            case 5:
                return new Forgettable();
        }
        return null;

    }
}



