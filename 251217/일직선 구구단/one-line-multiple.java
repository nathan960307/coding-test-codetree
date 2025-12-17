import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) { // 가로
                for (int j = 1; j <=n; j++) { //세로 (별)
                    System.out.printf("%d * %d = %d\n",i,j,i*j);
                }
        }
    }
}
