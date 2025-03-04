import java.util.Scanner;

public class LargestDigitsFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Define an array to store digits (max 10 digits)
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits and store them in the array
        while (number != 0 && index < maxDigit) {
            digits[index] = number % 10; // Extract last digit
            number /= 10; // Remove last digit from number
            index++; // Move to the next array position
        }

        // Initialize variables for largest and second largest numbers
        int largest = 0, secondLargest = 0;

        // Find the largest and second largest numbers in the array
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; // Update second largest
                largest = digits[i]; // Update largest
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i]; // Update second largest
            }
        }

        // Display results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        scanner.close();
    }
}
