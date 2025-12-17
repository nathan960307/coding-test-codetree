import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 9;
        

        for(int i =1; i<=n; i++){ // 가로
            if(i%2!=0){
                for(int j=1; j<=n; j++){ // 세로
                System.out.printf("%d",j);
                }
            }else{
                for(int j=1; j<=n; j++){ // 세로
                System.out.printf("%d",n-j+1);
                }
            }
            
            System.out.println("");
        }
    
    }
}