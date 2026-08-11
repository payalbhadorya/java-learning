package Day01;

import java.util.Scanner;

public class pratice1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = input.nextLine();

        System.out.println("Enter your age:");
        int age = input.nextInt();

        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
}

    
