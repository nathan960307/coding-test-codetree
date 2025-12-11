import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
         Scanner sc = new Scanner(System.in);

        int [][] arr1 = new int[4][4];
        

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                arr1[i][j] = sc.nextInt();        
            }
        }

        for(int i=0; i<4; i++){
            int sum =0; 
            for(int j=0; j<4; j++){

                sum += arr1[i][j];

                     
                
            }
            System.out.println(sum);
        }

        
    }
}