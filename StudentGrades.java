import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Arrays to store marks, percentages, grades, and remarks
        int[][] marks = new int[numStudents][3]; // 3 subjects: Physics, Chemistry, Maths
        double[] percentage = new double[numStudents];
        String[] grade = new String[numStudents];
        String[] remarks = new String[numStudents];

        // Taking input for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            System.out.print("Physics marks: ");
            marks[i][0] = scanner.nextInt();

            System.out.print("Chemistry marks: ");
            marks[i][1] = scanner.nextInt();

            System.out.print("Maths marks: ");
            marks[i][2] = scanner.nextInt();

            // Calculating percentage
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = totalMarks / 3.0;

            // Assigning grade and remarks
            if (percentage[i] >= 80) {
                grade[i] = "A";
                remarks[i] = "Level 4, above agency-normalized standards";
            } else if (percentage[i] >= 70) {
                grade[i] = "B";
                remarks[i] = "Level 3, at agency-normalized standards";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
                remarks[i] = "Level 2, below, but approaching agency-normalized standards";
            } else if (percentage[i] >= 50) {
                grade[i] = "D";
                remarks[i] = "Level 1, well below agency-normalized standards";
            } else if (percentage[i] >= 40) {
                grade[i] = "E";
                remarks[i] = "Level 1-, too below agency-normalized standards";
            } else {
                grade[i] = "R";
                remarks[i] = "Remedial standards";
            }
        }

        // Displaying results
        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tPercentage\tGrade\tRemarks");
        for (int i = 0; i < numStudents; i++) {
            System.out.println((i + 1) + "\t" + marks[i][0] + "\t" + marks[i][1] + "\t\t" + marks[i][2] + "\t" + percentage[i] + "%\t\t" + grade[i] + "\t" + remarks[i]);
        }

        scanner.close();
    }
}
