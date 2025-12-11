import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
         Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

         while(a < b){
            if(a%2==1){
                a *=2;
            }else if(a%2==0){
                a +=3;
            }
            System.out.print(a + " ");
         }
    }
}