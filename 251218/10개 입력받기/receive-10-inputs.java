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
            
            int temp = sc.nextInt();
            if(temp == 0){
                break;
            }else{
                sum = sum + temp;
                count++;
            }
             
        }

        avg = (double)sum / count;

        
        System.out.printf("%d %.1f\n",sum, avg);

        
        
       
        
    }
}
