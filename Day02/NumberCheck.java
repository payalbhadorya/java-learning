package Day02;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number a :");
        int a = input.nextInt();
        
        int modulus =  a % 2;
        System.out.println("modulus=" + modulus);

        if (a % 2 == 0){
            System.out.println("Odd number");
        }
        else {
            System.out.println("Even number");
        }

    }


}
