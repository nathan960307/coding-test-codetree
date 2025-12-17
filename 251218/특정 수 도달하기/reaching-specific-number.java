import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        double avg = 0.0;

        int[] arr = new int[10];
        
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            
        }

        for (int i = 0; i < 10; i++) {
            if(arr[i] <250){
                sum = sum + arr[i];
                count++;
            }else if(arr[i] >=250){
                break;
            }
            
        }

        avg = (double)sum / count;
        
        System.out.printf("%d %.1f",sum,avg);
        
    }
}
