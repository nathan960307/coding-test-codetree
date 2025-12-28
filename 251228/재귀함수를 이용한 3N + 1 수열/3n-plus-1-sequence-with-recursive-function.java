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
            return 0;
        }

        if(n%2==0){
            n = n/2;
            
        }else if(n%2!=0){
            n = 3*n +1;
            
        }

        return 1 + func1(n);
    }
}