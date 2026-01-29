import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.
        int answer = Integer.MAX_VALUE;
        
        
        for(int i=1; i<n-1; i++){
            int sum = 0;
            for(int j=1; j<n; j++){
                int prev;

                if(j==i){
                    continue;
                }else{
                    prev = j-1;
                }

                if(prev == i){
                    prev = prev -1;
                }
                int a = Math.abs(x[j] - x[prev]);
                int b = Math.abs(y[j] - y[prev]);
                sum = sum + a + b;
            }
            answer = Math.min(answer,sum);
        }

        System.out.print(answer);
    }
}