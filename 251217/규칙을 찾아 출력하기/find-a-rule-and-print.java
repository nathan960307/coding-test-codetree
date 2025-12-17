import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 2;
        int space = n;

        for(int i =1; i<=n; i++){ // 가로
            for(int j=1; j<=n; j++){ // 세로
                if(i!=1 && j!=1 && i!=n && j!=n && j>=i ){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
                
            }
            System.out.println("");
        }
    
}
}