import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.

        int answer = func1(arr, n-1);
        System.out.print(answer);
    }


    public static int func1(int[] arr, int n){
            if(n==0){
                return arr[0];
            }

            return Math.max(func1(arr,n-1),arr[n]);
            
    }
}