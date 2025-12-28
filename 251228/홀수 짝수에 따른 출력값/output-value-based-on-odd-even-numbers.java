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

        // 기저 조건
        if(n==1 || n==2){
            return n;
        }

        if(n%2==0){ // 짝수인 경우
            return n + func1(n-2);
        }else{ // 홀수인 경우
            return n + func1(n-2);
        }



    }
}