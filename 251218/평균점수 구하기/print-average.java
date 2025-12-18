import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();
        double sum = 0;
        int count = 0;
        double avg = 0.0;

        double[] arr = new double[8];
        
        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextDouble();
        }

        for (int i = 0; i < 8; i++) {
            sum = sum + arr[i];
            
        }

        avg = (double)sum / 8;
        System.out.printf("%.1f\n",avg);

        
        
       
        
    }
}
