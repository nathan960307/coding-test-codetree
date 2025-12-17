import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) { // 가로

                for (int j = 1; j <=i-1; j++) { //세로 (공백)
                    System.out.print("  ");
                }

                for (int j = 1; j <=n-i+1; j++) { //세로 (별)
                    System.out.print(n-j-i+2 + " ");
                }
            System.out.println(); 
        }
    }
}
