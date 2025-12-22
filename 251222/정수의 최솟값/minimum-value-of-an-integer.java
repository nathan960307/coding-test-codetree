import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.

        func1(a,b,c);
    }

    public static void func1(int a, int b, int c) {
        int answer = 0;
        if(a<=b && a<=c ){
            answer = a;
        }else if(b<=a && b<=c ){
            answer = b;
        }else if(c<=b && c<=a ){
            answer = c;
        }

        System.out.println(answer);
    }
}