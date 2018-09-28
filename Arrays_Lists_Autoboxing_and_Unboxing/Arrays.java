import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    /*
        Your program should read in from the keyboard, assume valid inputs,  and implement the following methods:
        1) getIntegers - returns an array of entered integers from keyboard
        2) printArray - prints out the contents of the array
        3) sortIntegers - sorts the contents.
        4) findMinAndMax - find the min. and Max Value
     */
    public static void main(String[] args) {
        Integer[] myArray = new Integer[10];
        Integer[] minMax = new Integer[2];
        getIntegers(myArray);
        System.out.println("Before : \n");
        printArray(myArray);
        sortIntegers(myArray);
        System.out.println("\nAfter : \n");
        printArray(myArray);
        findMinAndMax(myArray, minMax);
        System.out.println("\nMin: " + minMax[0] + "\n" + "Max: " + minMax[1]);
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

    private static void findMinAndMax(Integer[] myArray, Integer[] minMax){
        int min = Collections.min(Arrays.asList(myArray));
        int max = Collections.max(Arrays.asList(myArray));
        minMax[0] = min;
        minMax[1] = max;
    }
}

