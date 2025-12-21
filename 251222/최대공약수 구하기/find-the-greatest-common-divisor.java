import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        int answer = func1(n,m);
        System.out.print(answer);
    }

    public static int func1(int n,int m){
        if (m == 0) return n;
        return func1(m, n % m);
    }
}