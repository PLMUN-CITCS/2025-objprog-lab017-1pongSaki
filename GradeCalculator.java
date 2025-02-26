import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        int studentScore = getStudentScore();
        String grade = calculateGrade(studentScore);
        System.out.println("Your Grade is: " + grade);
    }
    public static int getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        int score;
        while (true) {
            try {
                System.out.print("Enter your score: ");
                score = scanner.nextInt();
                break; // Exit loop if input is valid
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input from the scanner
            }
        }
        scanner.close(); //Close scanner to prevent resource leak.
        return score;
    }
    public static String calculateGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}