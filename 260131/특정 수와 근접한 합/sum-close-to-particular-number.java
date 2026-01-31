import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int sum =0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        // Please write your code here.
        int min = s;
        
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                int temp  = sum - arr[i] - arr[j];
                int diff = Math.abs(temp - s);
                min = Math.min(min,diff);
            }
        }

        System.out.print(min);
    }
}