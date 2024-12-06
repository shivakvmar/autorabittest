package vaultARtest;
import java.util.Scanner;

public class PrimeNumberChecker {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        // Numbers less than 2 are not prime
        if (number <= 1) {
            return false;
        }
        
        // Check divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Not prime if divisible by any number
            }
        }
        return true; // Prime if not divisible by any number
    }

    public static void main(String[] args) {
        // Create a Scanner object for reading user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        
        // Close the scanner object to avoid resource leaks
        scanner.close();
    }
}

