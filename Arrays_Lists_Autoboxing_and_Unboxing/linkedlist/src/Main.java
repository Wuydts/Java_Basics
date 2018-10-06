import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    LinkedList<String> placesToVist = new LinkedList<String>();
	    addInOrder(placesToVist, "Des Moines");
	    addInOrder(placesToVist, "San Fran");
	    addInOrder(placesToVist, "San Jose");
	    addInOrder(placesToVist, "Sioux Falls");
	    addInOrder(placesToVist, "Redwood City");
	    printList(placesToVist);

	    addInOrder(placesToVist, "Redwood City");
	    visit(placesToVist);

    }
    private static void printList(LinkedList<String> placesToVist)
    {//Iterator - goes through all entries in a particular array, linked list etc.
        Iterator<String> i = placesToVist.iterator();
        int j = 0;
        while(i.hasNext()){ // Confirms there is a next value
            System.out.println(j + " Now Visiting " + i.next()); // Moves to the next value
            j++;
        }
        System.out.println("========================");
    }
    private static boolean addInOrder(LinkedList<String> placesToVisit, String newCity){
        ListIterator<String> stringListIterator = placesToVisit.listIterator();
        while(stringListIterator.hasNext()){
            int compare = stringListIterator.next().compareTo(newCity); // This gives us a #. If 0 then duplicate
            if(compare == 0){
                System.out.println(newCity + " is already in our list as a destination");
                return false;
            }
            else if(compare > 0){  //If # then 0 then we want to add it here.
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
            else if(compare < 0){
                // Move onto the next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }
    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true; // when true going forward. going backwards = false.
        ListIterator<String>listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No cities in the itenerary");
        }
        else{
            System.out.println("Now Visiting: " + listIterator.next());
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now Visiting " + listIterator.next());
                    }
                    else {
                        System.out.println("Reached the end of the line");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now Visiting: " + listIterator.previous());
                    }
                    else{
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }
    private static void printMenu(){
        System.out.println("Available options \nPress: ");
        System.out.println("0 - Quit");
        System.out.println("1 - Next City");
        System.out.println("2 - Previous City");
        System.out.println("3 - Print Menu");
    }

}
