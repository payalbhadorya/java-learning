package Day05;

public class WhileLoop {
    public static void main(String[] args) {
        
                
        int i = 1; // 1 to 10
        while (i<=10) {
            System.out.println(i);
            i++;
        }

        int i1 = 10; // 10 to 1
        while (i1>=1) {
            System.out.println(i1);
            i1--;
        }

        int i2 = 2; // even no. till 20
        while (i2 <= 20) {
            System.out.println(i2);
            i2 += 2;
        }

        int i3 = 20; // even no. backwards
        while (i3 >= 2){
            System.out.println(i3);
            i3 -= 2;
        }

        int i4 = 1; //addition 1 to 5 = 15
        int sum = 0;
        while (i4 <= 5) {
            sum= sum + i4;
            i4++;
        }
         System.out.println(sum);
    }
}
