import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count12 = 0;
        int count3 = 0;
        int count2 = 0;
        for (int i = 1; i <= n; i++) {
            
            if(i % 12 ==0){
                count12++;
            }else if(i % 3 == 0){
                count3++;
            }else if(i % 2 == 0){
                count2++;
            }
        }

        System.out.print(count2 + " " + count3 + " " + count12 );
    }
}
