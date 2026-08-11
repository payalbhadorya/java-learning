package Day01;

import java.util.Scanner;

public class Pratice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your marks1:");
        int marks1 = input.nextInt();
        input.nextLine();

        System.out.println("Enter your marks2:");
        int marks2 = input.nextInt();
        input.nextLine();

        System.out.println("Enter your marks3:");
        int marks3 = input.nextInt();
        input.nextLine();

        int sum = marks1 + marks2 + marks3;

        System.out.println("Your total marks are:" + sum);

    }
}
