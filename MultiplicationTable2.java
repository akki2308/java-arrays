import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] multiplicationResult = new int[4]; // Array to store results from 6 to 9
        int index = 0; // Separate index for storing in the array

        // Multiplication loop (directly from 6 to 9)
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[index] = num * i;
            index++;
        }

        // Printing the results
        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + multiplicationResult[index]);
            index++;
        }

        sc.close();
    }
}
