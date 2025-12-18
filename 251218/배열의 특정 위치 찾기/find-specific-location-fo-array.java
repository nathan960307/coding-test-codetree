import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum =0;
        int sum3 =0;
        int count =0;
        double avg = 0.0;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if((i+1)%2==0 ){
                sum = sum + arr[i];
            }
            
            if((i+1)%3==0){
                sum3 = sum3 + arr[i];
                count++;
            }
        }

        avg = (double)sum3 / count;

        System.out.printf("%d %.1f",sum,avg);
        
    }
}
