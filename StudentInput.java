import java.util.Scanner;
public class StudentInput{

    public static void main(String[] arct) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = input.nextLine();

        System.out.println("Enter your age:");
        int age = input.nextInt();
        input.nextLine();

        System.out.println("Enter your branch:");
        String branch = input.nextLine();

        System.out.println(name);
        System.out.println(age);
        System.out.println(branch);

    }
}