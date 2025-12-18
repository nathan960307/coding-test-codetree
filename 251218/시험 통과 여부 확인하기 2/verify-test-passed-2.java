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
            int sum = 0;
            for(int j=0; j<4; j++){
                sum = sum + sc.nextInt();
            }
            if(sum >= 240){
                arr[i] = 1; // 성공시
            }
        }

        for (int i = 0; i < n; i++) {
            if(arr[i] == 1){
                System.out.println("pass");
                count++;
            }else{
                System.out.println("fail");
            }
            
        }
        System.out.println(count);

        // System.out.printf("%d %d",count,sum);

        // avg = (double)sum / 8;
        // System.out.printf("%.1f\n",avg);

        
        
       
        
    }
}
