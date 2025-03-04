import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Count digits
        int temp = number, count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Store digits in an array
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Display reversed digits
        System.out.print("Reversed number: ");
        for (int digit : digits) {
            System.out.print(digit);
        }

        scanner.close();
    }
}
