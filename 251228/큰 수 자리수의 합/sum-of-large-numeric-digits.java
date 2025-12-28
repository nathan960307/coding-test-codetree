import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        int product = a * b * c ;

        int answer = func1(product);
        System.out.print(answer);
    }
    public static int func1(int product){
        if(product == 0){
            return 0;
        }

        return func1(product/10) + product%10;
    }
}