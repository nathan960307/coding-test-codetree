import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =1;

        while(i<=n){
            int a = sc.nextInt();

            if(a % 2 !=0 && a % 3 ==0){
                System.out.println(a);
            }
            i++;
        }

       

        

        
        
        
        
    }
}
