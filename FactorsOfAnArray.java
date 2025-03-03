import java.util.Scanner;

public class FactorsOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Array to store factors (max size = number itself)
        int[] factors = new int[number];
        int index = 0;

        // Find factors and store in array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        // Display factors
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        sc.close();
    }
}
