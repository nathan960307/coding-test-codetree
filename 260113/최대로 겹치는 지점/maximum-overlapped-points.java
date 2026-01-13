import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[100]; // 겹치는 지점 표시 배열
        int[] start = new int[n];
        int[] end = new int[n];

        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
            for(int j=start[i]; j<=end[i]; j++){
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
    }
}