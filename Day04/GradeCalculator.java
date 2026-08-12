package Day04;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your grade:");
        String grade = input.nextLine();

        switch (grade) {
            case "A":
                System.out.println("Excellent!!!");
                break;
            
            case "B":
                System.out.println("Very Good!!");
                break;
            case "C":
                System.out.println("Good!");
                break;

            case "D":
                System.out.println("Pass");
                break;

            case "F":
                System.out.println("Fail :(");
                break;
            default:
                System.out.println("Invalid grade...");
        }
    }
}
