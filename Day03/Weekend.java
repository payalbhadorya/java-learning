package Day03;

import java.util.Scanner;

public class Weekend {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("1 = Monday\r\n" + //
                        "2 = Tuesday\r\n" + //
                        "3 = Wednesday\r\n" + //
                        "4 = Thursday\r\n" + //
                        "5 = Friday\r\n" + //
                        "6 = Saturday\r\n" + //
                        "7 = Sunday");

        System.out.println("chose a number from 1 to 7 as it represents your party or 9 to 5 :) ");
        int day = input.nextInt();

        if (day == 6 || day == 7){
            System.out.println("well you luckey beachh its a Weakend partyyyyyyyyyyyyyyyyyyyy");
        }
        else {
            System.out.println("haha!! you suckerrrrrrrrr its a weakdayyy :(");
        }

    }
    
}
