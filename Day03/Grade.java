package Day03;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your marks:");
        int marks = input.nextInt();

        if(marks >= 90){
            System.out.println("Excellent");
        }

        else if (marks >= 75){
            System.out.println("Very Good");
        }

        else if (marks >= 60){
            System.out.println("Good");
        }

        else if (marks >= 40){
            System.out.println("Pass");
        }

        else{
            System.out.println("Fail");
        }

        }
        
    }
    
