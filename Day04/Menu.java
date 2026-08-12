package Day04;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your choice:");
        String choice = input.nextLine();

        switch (choice) {
            case "pizza":
                System.out.println("ohhhhhhh pizzaaaaaa it will cost you a car");
                break;
            
            case "burger":
                System.out.println("ohhh yeahh burgerrrrrrrrrrrrrrrrrrrr not so expencivvvvvvvvveeeeee");
                break;

            case "pasta":
                System.out.println("ohhh helll nahhhh it can cost you a fortuneeeeeeee hehehehehe");
                break;

            default:
               System.out.println("Invalid, we dont surve it here get out !!!");
        }

    }
    
}
