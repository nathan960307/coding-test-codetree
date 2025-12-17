import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double sum = 0;
        int count = 0;
        double avg = 0.0;

        double[] arr = new double[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            
        }

        avg = (double)sum / n;

        if(avg>=4.0){
            System.out.printf("%.1f\n",avg);
            System.out.print("Perfect");
        }else if(avg>=3.0){
            System.out.printf("%.1f\n",avg);
            System.out.print("Good");
        }else if(avg<3.0){
            System.out.printf("%.1f\n",avg);
            System.out.print("Poor");
        }
        
       
        
    }
}
