import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();
        double sum = 0;
        int count = 0;
        double avg = 0.0;

        // double[] arr = new double[10];
        int[] arr = new int[10];
        
        for (int i = 0; i < 10; i++) {
            
            int temp = sc.nextInt();
            if(temp == 0){
                break;
            }else{
                arr[i] = temp;
                count++;
            }
             
        }

        for (int i = count-1; i >=0; i--) {
            // sum = sum + arr[i];
            System.out.print(arr[i] + " ");
            
        }

        // avg = (double)sum / 8;
        // System.out.printf("%.1f\n",avg);

        
        
       
        
    }
}
