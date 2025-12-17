import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int alpha = 65;
        
        for (int i = 1; i <= n; i++) { // 가로
                for (int j = 1; j <= i; j++) { //세로 (별)
                    System.out.print((char)alpha);
                    alpha++;
                    if(alpha==91){
                        alpha = 65;
                    }
                }
                System.out.println("");
        }
    }
}
