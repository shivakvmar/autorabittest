package vaultARtest;

public class AverageCalculator {

    public static void main(String[] args) {
        // Example array of numbers
        double[] numbers = {10, 20, 30, 40, 50};

        // Calculate the average
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        
        double average = sum / numbers.length;

        // Output the result
        System.out.println("The average is: " + average);
    }
}


// New method added
public void newMethod() {
  System.out.println("New method added!");
   
}


// New method added
public void shivaMethod() {
  System.out.println("New method added!");
}