import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =1; i<=n; i++){ // 가로

            for(int j =0; j<n-i; j++){ // 세로(공백) 
                System.out.print("  ");
            }

            for(int j =0; j<2*i-1; j++){ // 세로(별)
                System.out.print("* ");
            }

            
            System.out.println("");

            
        }

        
}
}