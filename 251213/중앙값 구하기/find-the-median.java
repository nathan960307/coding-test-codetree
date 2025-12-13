import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if((a > b && a < c) || (a > c && a < b)){
            System.out.println(a);
        }

        if((b > c && b < a) || b > a && b < c){
            System.out.println(b);
        }

        if((c > a && c < b)||(c > b && c < a)){
            System.out.println(c);
        }
    }
}
