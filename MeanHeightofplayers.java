import java.util.*;

public class MeanHeightofplayers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11]; // Array to store heights of 11 players
        double sum = 0;

        // Taking input for heights
        System.out.println("Enter the heights of 11 players:");
        for (int i = 0; i < 11; i++) {
            heights[i] = sc.nextDouble();
            sum += heights[i]; // Adding each height to sum
        }

        double mean = sum / 11; // Calculating mean height
        System.out.println("Mean height of the football team: " + mean);

        sc.close();
    }
}
