import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        // int n = sc.nextInt();
        int sum =0;
        
        int[] arr = new int[b];

        while(a>0){
            int r = a % b; 
            a = a /b;
            arr[r] +=1;
        }
        
        for(int i=0; i<b; i++){
            sum = sum + arr[i]*arr[i];
        }
        System.out.print(sum);
    }
}
