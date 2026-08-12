package Day03;
import java.util.Scanner;

public class Admission {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your marks:");
        int marks = input.nextInt();
        input.nextLine();
        
        
        if( marks >= 90){
            System.out.println("Excellent marks!! you are in mr :)");
        }
        
        System.out.println("Enter your age!!");
        int age = input.nextInt();


            if (marks >= 60 && age >= 18){
                System.out.println("eligible, com on in beachhhhhhhhhhhh in my clggggggggggggg");
        }
        else {
            System.out.println("Not eligible get out hellll nahhhhhhhhhhhh");
        }

    }
}
