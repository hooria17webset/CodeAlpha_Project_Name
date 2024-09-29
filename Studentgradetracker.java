//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Scanner;

public class Studentgradetracker {
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store student grades
        ArrayList<Double> grades = new ArrayList<>();

        // Loop to input grades
        System.out.println("Enter student grades (enter -1 to stop): ");
        while (true) {
            System.out.print("Enter grade: ");
            double grade = scanner.nextDouble();
            if (grade == -1) {
                break;  // Stop input if user enters -1
            }
            grades.add(grade);
        }

        // Ensure grades are entered
        if (grades.isEmpty()) {
            System.out.println("No grades entered.");
        } else {
            // Calculate and display average, highest, and lowest grade
            double average = calculateAverage(grades);
            double highest = findHighestGrade(grades);
            double lowest = findLowestGrade(grades);

            System.out.printf("Average Grade: %.2f%n", average);
            System.out.printf("Highest Grade: %.2f%n", highest);
            System.out.printf("Lowest Grade: %.2f%n", lowest);
        }

        // Close scanner
        scanner.close();
    }

    // Method to calculate average grade
    public static double calculateAverage(ArrayList<Double> grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    // Method to find the highest grade
    public static double findHighestGrade(ArrayList<Double> grades) {
        double highest = grades.get(0);
        for (double grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    // Method to find the lowest grade
    public static double findLowestGrade(ArrayList<Double> grades) {
        double lowest = grades.get(0);
        for (double grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}
