import java.util.Scanner;

public class Main {
    public static int sum=0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        int answer = func1(n);
        System.out.print(answer);
    }

    public static int func1(int n){

        sum = n;
        func1(n-1);

        if(n==1){
            return sum;
        }
    }
}