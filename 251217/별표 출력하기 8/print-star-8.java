import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 2;
        int space = n;

        for(int i =1; i<=n; i++){ // 가로

            if(i%2!=0){
                System.out.print("*");
            }else{
                for(int j =1; j<=2*i-2; j++){ // 세로(별)
                System.out.print("* ");
                }
            }

            

            System.out.println("");


            
        }
    
}
}