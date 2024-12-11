package vaultARtest;
import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {
        // Create a Scanner object for reading user input
        Scanner scanner = new Scanner(System.in);
        
        // Define the number of inputs
        int numberOfInputs = 5;
        
        // Create an array to store the numbers
        int[] numbers = new int[numberOfInputs];
        int sum = 0;

        // Ask the user for 5 numbers and store them in the array
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numberOfInputs; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];  // Add the number to the sum
        }

        // Calculate the average
        double average = (double) sum / numberOfInputs;

        // Display the average
        System.out.println("The average of the numbers is: " + average);
        
        // Close the scanner object to avoid resource leaks
        scanner.close();
    }
}




// New method added
public void newMethod() {
  System.out.println("New method added!");
}