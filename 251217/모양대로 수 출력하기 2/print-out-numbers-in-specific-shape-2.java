import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 2;
        

        for(int i =1; i<=n; i++){ // 가로
            for(int j=1; j<=n; j++){ // 세로
                System.out.printf("%d ",count);
                
                count+=2;

                if(count==10){
                    count = 2;
                }

                
                
            }
            System.out.println("");
        }
    
    }
}