package Day03;

import java.util.Scanner;

public class NumberCategory {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter your number:");
        int number = input.nextInt();

        if(number > 0){
            System.out.println("Positive");
        }
        else if(number < 0){
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }

    }
    
}
