import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = n;
        for(int i =0; i<n; i++){ // 가로

            for(int j =0; j<n-i; j++){ // 세로(별)
                System.out.print("*");
            }

            for(int j =0; j<i; j++){ // 세로(공백) 
                System.out.print("  ");
            }

            for(int j =0; j<n-i; j++){ // 세로(별)
                System.out.print("*");
            }

            System.out.println("");

            
        }

        
}
}