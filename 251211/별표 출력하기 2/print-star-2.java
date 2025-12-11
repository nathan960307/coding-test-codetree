import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
         Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i=a; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
            
    }
}