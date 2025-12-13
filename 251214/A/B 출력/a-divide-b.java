import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        System.out.print(a/b);  
        System.out.print(".");  

        int r = a % b;

        for(int i=1; i<=20; i++){
            r = r * 10 ; 
            System.out.print(r/b);
            r = r % b; 
        }

        
        
        
        
    }
}
