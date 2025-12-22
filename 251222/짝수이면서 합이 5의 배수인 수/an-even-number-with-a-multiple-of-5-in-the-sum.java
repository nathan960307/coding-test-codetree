import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        func1(n);
    }

    public static void func1(int n) {
        int sum =0;
        if(n%2==0){
            while(n>0){
                sum += n % 10;
                n = n /10;
            }
            if(sum %5==0){
            System.out.println("Yes");

            }else{
            System.out.println("No");

            }
        }else{
            System.out.println("No");
        }

        
    }
}