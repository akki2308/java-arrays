import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store up to 10 elements
        double[] numbers = new double[10];
        double total = 0.0; // Variable to store the sum
        int index = 0; // Index for storing values in the array

        // Infinite loop to take user input
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = scanner.nextDouble();

            // Break if the user enters 0 or a negative number
            if (num <= 0) {
                break;
            }

            // Store value in array and increment index
            numbers[index] = num;
            index++;

            // Break if the array is full
            if (index == 10) {
                break;
            }
        }

        // Display stored numbers and calculate sum
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }

        // Display total sum
        System.out.println("\nTotal sum: " + total);

        scanner.close();
    }
}
