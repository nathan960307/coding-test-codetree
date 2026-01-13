import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 주어지는 칸 수
        int[] arr = new int[N+1];

        int K = sc.nextInt(); // 명령 수
        for (int i = 0; i < K; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            for(int j=A; j<=B; j++){
                arr[j-1] += 1;
            }
        }

        int max =0;

        for(int i=0; i<N; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println(max);
        // Please write your code here.
    }
}