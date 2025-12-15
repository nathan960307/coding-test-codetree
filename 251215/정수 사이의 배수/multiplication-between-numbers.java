import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum = 0;
        int count = 0;
        double avg = 0;
        
        for (int i = a; i <= b; i++) {
            if(i % 5==0 || i % 7 ==0){
                sum = sum + i;
                count++;
            }
        }

        if(count !=0){
            avg = (double)sum / count;
        }
        
        System.out.printf("%d %.1f",sum,avg);
    }
}
