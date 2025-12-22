import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Please write your code here.
        int answer = func1(a,b);
        System.out.print(answer);
    }

    public static int func1(int a,int b) {
        return (int)Math.pow(a,b);
    }
}