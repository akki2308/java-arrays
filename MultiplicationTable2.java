import java.util.*;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] multiplicationResult = new int[4]; // Array to store results from 6 to 9

        for (int i = 0; i < 4; i++) {
            multiplicationResult[i] = num * (i + 6);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(num + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }

        sc.close();
    }
}
