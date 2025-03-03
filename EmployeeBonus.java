import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Define arrays to store salary, years of service, bonus, and new salary
        double[] salary = new double[10];
        int[] years = new int[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Taking input for 10 employees
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary for employee " + (i + 1) + ": ");
            salary[i] = sc.nextDouble();
            
            System.out.println("Enter years of service for employee " + (i + 1) + ": ");
            years[i] = sc.nextInt();

            // Calculate bonus based on years of service
            bonus[i] = salary[i] * (years[i] > 5 ? 0.05 : 0.02); // 5% if > 5 years, else 2%
            newSalary[i] = salary[i] + bonus[i]; // New salary = Old salary + Bonus

            // Summing up totals
            totalBonus = totalBonus + bonus[i];
			totalOldSalary = totalOldSalary + salary[i];
			totalNewSalary = totalNewSalary + newSalary[i];
        }

        // Display total salary details
        System.out.println("Total bonus payout: ₹" + totalBonus);
        System.out.println("Total old salary of employees: ₹" + totalOldSalary);
        System.out.println("Total new salary after bonus: ₹" + totalNewSalary);

        sc.close();
    }
}
