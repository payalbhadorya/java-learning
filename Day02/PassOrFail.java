package Day02;

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your marks:");
        int marks = input.nextInt();

        if (marks >= 40 ) {
            System.out.println("you passed :)");
        }
        else{
            System.out.println("you failed :(");
        }


    }
    
    
}
