import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int sum = 0;
        int count = 0;
        int prod = 1;
        double avg = 0;

        for (int i = 1; i <= 10; i++) {
            if(prod >= n){
                System.out.print(i-1);
                break;
            }
            prod = prod * i;
        }

    }
}
