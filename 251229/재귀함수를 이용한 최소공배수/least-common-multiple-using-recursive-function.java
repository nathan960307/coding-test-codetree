import java.util.Scanner;

public class Main {
    // 메인 함수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        int answer = func1(arr,n-1);
        System.out.print(answer);
    }
    // 최대 공약수 
    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }

        return gcd(b,a%b);
    }


    // 최소 공배수 
    public static int lcm(int a, int b){
        return (a*b) / gcd(a,b);
    }

    // 재귀 함수
    public static int func1(int[] arr, int n){
        if(n==0){
            return arr[0];
        }
        
        return lcm(func1(arr,n-1),arr[n]);
    }
}