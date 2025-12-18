import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int diff = Integer.MAX_VALUE;

        // 배열 입력 받기
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j){
                    continue;
                }
                
                if(Math.abs(arr[i]-arr[j]) <= diff){
                    diff = Math.abs(arr[i]-arr[j]);
                }
            }
        }
        System.out.printf("%d",diff);
    }
}
