import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        func1(n);
    }
    public static void func1(int n){
        if(n>1){
            System.out.print(n + " ");
            func1(n-1);
        }else if(n>=1){
            func1(n-1);
            System.out.print(n + " ");
        }else{
            return;
        }
        
    }
}