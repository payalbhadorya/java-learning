// Day 05

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        int i = 1 ;
        int multiply = 0;
        while (i <= 10) {
            multiply = number * i;
            System.out.println(number + "x" + i + "=" + multiply);
            i++;
        }
        
    }
    
}
