import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int space = n;

        for(int i =1; i<=2*n-1; i++){ // 가로

            for(int j =1; j<=space-1; j++){ // 세로(공백)
                System.out.print(" ");
            }

            for(int j =1; j<=2*star-1; j++){ // 세로(별)
                System.out.print("*");
            }

            
            System.out.println("");

            if(i<n){
                star++;
                space--;
            }else{
                star--;
                space++;
            }
        }

        
}
}