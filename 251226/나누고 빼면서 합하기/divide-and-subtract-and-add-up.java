import java.util.Scanner;
public class Main {

    public static int n;
    public static int m;
    public static int sum=0;
    public static int[] arr;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n + 1];
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        func1();
        System.out.print(sum);
    }

    public static void func1(){
        sum = sum + arr[m];
        while(m>1){
            if(m%2!=0){
                m = m - 1;
                sum = sum + arr[m];
            }else if(m%2==0){
                m = m / 2;
                sum = sum + arr[m];
            }
        }
    }
}