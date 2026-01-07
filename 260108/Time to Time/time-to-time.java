import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 시
        int b = sc.nextInt(); // 분
        int c = sc.nextInt(); // 시 
        int d = sc.nextInt(); // 분
        // Please write your code here.

        int ago = 60 * a + b;
        int after = 60 * c + d;

        int answer = after - ago;

        System.out.print(answer);
    }
}