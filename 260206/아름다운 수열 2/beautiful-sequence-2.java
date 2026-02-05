import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        // 수열A
        int[] A = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = sc.nextInt();
        // 수열B
        int[] B = new int[M];
        for (int i = 0; i < M; i++)
            B[i] = sc.nextInt();
        // Please write your code here.
        Arrays.sort(B);
        // 수열 A 에서 M 길이만큼을 뽑아 재배치 했을때 수열 B와 같은 경우 count
        int count = 0;
        for(int i=0; i<N-M+1; i++){
            int[] temp = new int[M];
            for(int j=i; j<i+M; j++){
                temp[j-i] = A[j];
            }

            Arrays.sort(temp);

            if(Arrays.equals(temp,B)){
                count++;
            }
        }
        System.out.print(count);

    }
}