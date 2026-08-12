package Day04;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number:");
        int first = input.nextInt();
        input.nextLine();

        System.out.println("Enter your second number:");
        int second = input.nextInt();
        input.nextLine();

        System.out.println("Enter Operator you wanna do ( + , - , * , / ) :");
        char Operator = input.next().charAt(0);

        switch (Operator) {

            case '+':
                int sum = first + second ;
                System.out.println("Result:" + sum);
                break;
            
            case '-':
                int minus = first - second ;
                System.out.println("Result:" + minus);
                break;
         
            case '*':
                int multiply = first * second ;
                System.out.println("Result:" + multiply);
                break;
            
            case '/':
                double divide = (double) first / second ;
                System.out.println("Result:" + divide);
                break;

            default :
                System.out.println("Invalid" +//
                                   "do not mess with us");

        }
         
    }
    
}
