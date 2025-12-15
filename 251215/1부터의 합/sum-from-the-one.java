import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int count = 0;
        int prod = 1;
        int ones = 0;

        for (int i = 1; i <= 100; i++) {
            if(sum >=n){
                System.out.println(i-1);
                break;
            }
            sum = sum + i;
            
        }

        
        
        
    }
}
