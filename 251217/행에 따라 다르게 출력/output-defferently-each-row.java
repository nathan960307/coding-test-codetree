import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int temp = 0;

        for(int i =1; i<=n; i++){ // 가로
            for(int j =1; j<=n; j++){
                
                if(i%2!=0){
                    count++;
                    System.out.print(count + " ");
                    
                }else if(i%2==0){
                    count+=2;
                    System.out.print(count + " ");
                }
                
            }
            
            System.out.println("");
        }
    
    }
}