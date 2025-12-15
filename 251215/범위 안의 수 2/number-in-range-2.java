import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        
        int sum = 0;
        int count = 0;
        double avg = 0;
        
        

        for (int i = 1; i <= 10; i++) {
            int a = sc.nextInt();
            if(a<=200  && a >= 0){
                sum = sum + a;
                count ++;
            }
        }

        avg = (double)sum / count;
        
        
        System.out.printf("%d %.1f",sum,avg);
    }
}
