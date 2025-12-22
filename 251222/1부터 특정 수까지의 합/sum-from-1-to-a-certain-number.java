import java.util.Scanner;

public class Main {
    public static void func1(int n) {
        int sum =0;
        int answer =0;

        for(int i = 1; i <= n; i++) {
            sum += i;
        }

        answer = sum /10;

        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        func1(n);
    }
}

