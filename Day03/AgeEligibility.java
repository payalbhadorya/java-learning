package Day03;

import java.util.Scanner;

public class AgeEligibility {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();

        if(age >= 18 && age <= 25){
            System.out.println("beach you are young and eligible :3");
        }
        else{
            System.out.println("get the hell out of her not eligible you sucker :*");
        }

    }

}
