import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter height (in meters) for person " + (i + 1) + ": ");
            double height = scanner.nextDouble();

            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            double weight = scanner.nextDouble();

            double bmi = weight / (height * height);

            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi < 29.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            System.out.println("Person " + (i + 1) + ": Height = " + height + "m, Weight = " + weight + "kg, BMI = " + bmi + ", Status = " + status);
        }

        scanner.close();
    }
}
