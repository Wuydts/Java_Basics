import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    /*
        Create a program using arrays that sorts a list of integers in descending order
        Your program should read in from the keyboard, and implement the following methods:
        1) getIntegers - returns an array of entered integers from keyboard
        2) printArray - prints out the contents of the array
        3) sortIntegers - sorts the contents.

     */
    public static void main(String[] args) {
        Integer[] myArray = new Integer[10];
        getIntegers(myArray);
        System.out.println("Before : \n");
        printArray(myArray);
        sortIntegers(myArray);
        System.out.println("\nAfter : \n");
        printArray(myArray);
    }

    private static void getIntegers(Integer[] myArray) {
        System.out.println("Please Enter 10 integers into the array");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < myArray.length; i++)
            myArray[i] = scanner.nextInt();
    }

    private static void printArray(Integer[] myArray) {
        for (int i = 0; i < myArray.length; i++)
            System.out.print(myArray[i] + " ");
    }

    private static void sortIntegers(Integer[] myArray) {
        Arrays.sort(myArray, Collections.reverseOrder());


    }
}

