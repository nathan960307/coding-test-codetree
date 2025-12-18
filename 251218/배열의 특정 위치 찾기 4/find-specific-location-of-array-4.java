import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        double avg = 0.0;

        // double[] arr = new double[10];
        int[] arr = new int[10];
        
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if(arr[i] == 0){
                break;
            }else if(arr[i]!=0 && arr[i]%2==0){
                count++;
                sum = sum + arr[i];
            }
            
        }

        System.out.printf("%d %d",count,sum);

        // avg = (double)sum / 8;
        // System.out.printf("%.1f\n",avg);

        
        
       
        
    }
}
