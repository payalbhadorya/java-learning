package Day02;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();

        if (age >= 18){
            System.out.println("You can Vote");
        }

        else { 
            System.out.println("You can not vote");

        }
            
    }
    
}
