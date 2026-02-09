import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 첫번째 조합
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // 두번째 조합
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();
        // Please write your code here.
        int count =0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                for(int k=1; k<=n; k++){
                    boolean first = close(i, a, n) && close(j, b, n) && close(k, c, n);
                    boolean second = close(i, a2, n) && close(j, b2, n) && close(k, c2, n);

                    if (first || second){
                        count++;
                    } 
                }
            }
        }
        System.out.print(count);
    }
    static boolean close(int x, int y, int n) {

        int diff = Math.abs(x - y);

        return Math.min(diff, n - diff) <= 2;
    }

}