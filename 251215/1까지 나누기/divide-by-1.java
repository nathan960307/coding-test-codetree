import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int sum = 0;
        int count = 0;
        int prod = 1;
        double avg = 0;

        for(int i =1; i<=5000; i++){
            n = n / i;
            count++;
            if(n<=1){
                System.out.print(count);
                break;
            }
        }

    }
}
