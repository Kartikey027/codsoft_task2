import java.util.*;

public class Student_Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the number of subjects
        System.out.print("Enter the number of subjects: ");
        int Tsubjects = sc.nextInt();

        // Array to store marks for each subject
        int[] marks = new int[Tsubjects];

        // Input marks for each subject
        for (int i = 0; i < Tsubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        
        int Tmarks = 0;
        for (int i : marks) {
            Tmarks += i;
        }

        // Calculate average percentage
        double per = (double) Tmarks / Tsubjects;

        // Calculate grade based on average percentage
        char grade;
        if (per >= 90) {
            grade = 'A';
        } else if (per >= 80) {
            grade = 'B';
        } else if (per >= 70) {
            grade = 'C';
        } else if (per >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display results
        System.out.println("Total Marks: " + Tmarks);
        System.out.println("Average Percentage: " + per + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}