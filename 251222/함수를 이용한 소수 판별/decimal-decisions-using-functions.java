import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        func1(a,b);
    }
    public static void func1(int a, int b) {
        int sum =0;
        for(int i=a; i<=b; i++){
            int count =0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                sum += i;
            }
        }

        System.out.print(sum);

    }
}