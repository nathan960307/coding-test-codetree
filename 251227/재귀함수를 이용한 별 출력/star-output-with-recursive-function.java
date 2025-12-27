import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        func1(n);
    }
    public static void func1(int n){
        if(n==0){
            return;
        }
        func1(n-1);
        for(int i=0; i<n; i++){
            System.out.print("*");
        }
        System.out.println("");
    }
}