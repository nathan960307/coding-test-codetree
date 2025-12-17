import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int temp = 0;

        for(int i =1; i<=n; i++){ // 가로
            for(int j =1; j<=n; j++){
                
                if(i%2!=0){
                    System.out.print(count + " ");
                    
                }else if(i%2==0){
                    if(j==1){
                        temp = count;
                    }
                    System.out.print(temp + n-j + " ");
                }
                count++;
            }
            
            System.out.println("");
        }
    
    }
}