import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxSize = 3; // Initial size
        int[] ages = new int[maxSize];
        int[] heights = new int[maxSize];

        String[] names = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < maxSize; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height (in cm) of " + names[i] + ": ");
            heights[i] = scanner.nextInt();
        }

        int youngestIndex = 0, tallestIndex = 0;

        for (int i = 1; i < maxSize; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("Youngest friend: " + names[youngestIndex]);
        System.out.println("Tallest friend: " + names[tallestIndex]);

        scanner.close();
    }
}
