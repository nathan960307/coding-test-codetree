import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        

        while(a <= b){
            System.out.print(a + " ");
            if(a % 2 !=0){
                a = a * 2;
            }else if(a % 2 ==0){
                a = a +3;
            }
            
        }

        

        
        
        
        
    }
}
