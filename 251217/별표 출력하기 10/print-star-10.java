import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 2;
        int space = n;

        for(int i =1; i<=2*n; i++){ // 가로

            if(i%2!=0){ // 홀수 늘어나게
                for(int j =0; j<=i/2; j++){ // 세로(별)
                System.out.print("* ");
                }
            }else{ // 짝수 - 줄어들게
                for(int j =0; j<=n-i/2; j++){ // 세로(별)
                System.out.print("* ");
                }
            }
            System.out.println("");


            
        }
    
}
}