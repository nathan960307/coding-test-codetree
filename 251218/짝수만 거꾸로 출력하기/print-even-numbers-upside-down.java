import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 학생 수
        
        int count = 0;
        double avg = 0.0;

        // double[] arr = new double[10];
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = n-1; i >= 0; i--) {
            if(arr[i]%2==0){
                System.out.print(arr[i] + " ");
            }
            
        }
       

        // System.out.printf("%d %d",count,sum);

        // avg = (double)sum / 8;
        // System.out.printf("%.1f\n",avg);

        
        
       
        
    }
}
