package Day02;

import java.util.Scanner;

public class Eligibility {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();

        boolean eligible = age >= 18 ;
        boolean senior = age >= 65 ;
        

        System.out.println("Is eligible  to vote =" + eligible );
        System.out.println("Is senior citizen: " + senior );

    }
  
}
