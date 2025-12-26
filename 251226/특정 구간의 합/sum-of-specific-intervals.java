import java.util.Scanner;
public class Main {

    public static int[] arr;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            // Please write your code here.
            func1(a1, a2);
        }
    }

    public static void func1(int a1, int a2){
        int sum =0;
        for(int i=a1-1; i<=a2-1; i++){
             sum = sum + arr[i];
        }
        System.out.println(sum);
        
    }
}