import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = n;

        for(int i =1; i<=2*n-1; i++){ // 가로
            for(int j =0; j<count; j++){ // 세로
                System.out.print("* ");
            }
            System.out.println("");

            if(i<n){
                count--;
            }else{
                count++;
            }
        }

        
}
}