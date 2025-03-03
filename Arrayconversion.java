import java.util.Scanner;

public class Arrayconversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define a 2D array (Example: 3x3 matrix)
        int[][] twoDArray = new int[3][3];

        // Taking user input for 2D array
        System.out.println("Enter 9 elements for the 2D array (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                twoDArray[i][j] = scanner.nextInt();
            }
        }

        // Convert 2D array into 1D array
        int[] oneDArray = new int[9];
        int index = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                oneDArray[index] = twoDArray[i][j];
                index++;
            }
        }

        // Display the 1D array
        System.out.println("1D Array after copying:");
        for (int num : oneDArray) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
