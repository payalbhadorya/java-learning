package Day05;

public class ForLoop {
    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++){ //1 to 10
            System.out.println(i);
        }

        for(int i1 = 10; i1 >= 1; i1--){ // 10 to 1
            System.out.println(i1);
        }

        for(int i2 =2; i2 <= 20; i2 += 2){ //2 4 6..20
            System.out.println(i2);
        }

        int sum = 0; //addition
        for(int i3 = 1; i3 <= 10; i3++){
            sum = sum +i3;
        }
        System.out.println(sum);

    }
    
}
