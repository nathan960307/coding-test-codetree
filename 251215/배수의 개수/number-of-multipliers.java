import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count3 = 0;
        int count5 = 0;
        for (int i = 1; i <= 10; i++) {
            int n = sc.nextInt();

            if(n % 3 ==0){
                count3++;
            }
            if(n % 5 ==0){
                count5++;
            }
            
        }

        System.out.print(count3 + " " +count5 );
    }
}
