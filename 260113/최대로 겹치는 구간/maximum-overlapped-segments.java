// 겹치는 구간 구하기
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 선분의 수
        int[] x1 = new int[n]; // 선분의 시작 점
        int[] x2 = new int[n]; // 선분의 끝 점

        int[] arr = new int[100]; // 겹치는 구간 표시 배열
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            for(int j=x1[i]; j<=x2[i]-1; j++){
                arr[j-1] +=1;
            }
        }


        int max =0; 

        for(int i=0; i<100; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.print(max);
        // Please write your code here.
    }
}