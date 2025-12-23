import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        // Please write your code here.
        func1(a,o,c);
        

    }

    public static void func1(int a,char o, int b) {
        int answer = 0;
        if(o=='+'){
            answer = a + b;
        }else if(o=='-'){
            answer = a - b;
        }else if(o=='/'){
            answer = a / b;
        }else if(o=='*'){
            answer = a * b;
        }else{
            System.out.print("False");
        }
        System.out.printf("%d %c %d = %d",a,o,b,answer);
    }

}