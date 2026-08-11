package Day02;

import java.util.Scanner;

public class Mark {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Marks1:");
        int Marks1 = input.nextInt();
        input.nextLine();

        System.out.println("Enter your Marks2:");
        int Marks2 = input.nextInt();
        input.nextLine();

        System.out.println("Enter your Marks3:");
        int Marks3 = input.nextInt();
        input.nextLine();

        int sum = Marks1 + Marks2 + Marks3;
        System.out.println("Sum:" + sum);

        int average = sum / 3;
        System.out.println("Average:" + average);



    }
    
}
