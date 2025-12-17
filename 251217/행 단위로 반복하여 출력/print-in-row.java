import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 2;
        int space = n;

        for(int i =1; i<=n; i++){ // 가로
            for(int j=1; j<=n; j++){ // 세로
                System.out.print(j);
            }
            System.out.println("");
        }
    
    }
}