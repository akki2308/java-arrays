import java.util.Scanner;

public class FrequencyOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Frequency array to store the count of digits (0-9)
        int[] frequency = new int[10];

        // Extracting digits and counting frequency
        while (num > 0) {
            int digit = num % 10; // Get the last digit
            frequency[digit]++;   // Increase count of the digit
            num /= 10;            // Remove last digit
        }

        // Displaying frequency of each digit
        System.out.println("\nDigit\tFrequency");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) { // Display only if the digit appeared
                System.out.println(i + "\t" + frequency[i]);
            }
        }

        sc.close();
    }
}
