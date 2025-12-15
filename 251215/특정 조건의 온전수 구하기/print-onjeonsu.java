import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int count = 0;
        int prod = 1;
        int ones = 0;

        for (int i = 1; i <= n; i++) {
            ones = i %10;
            if(i % 2==0 || ones == 5 || (i % 3 ==0 && i % 9 !=0)){
                continue;
            }else{
                System.out.print(i + " ");
            }
        }

        
        
        
    }
}
