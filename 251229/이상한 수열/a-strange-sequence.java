import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int answer = func1(n);
        System.out.print(answer);
    }
    public static int func1(int n){
        if(n==1){
            return 1;
        }else if(n==2){
            return 2;
        }

        return func1(n/3) + func1(n-1);
    }
}