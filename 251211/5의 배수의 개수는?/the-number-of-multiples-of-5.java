import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
         Scanner sc = new Scanner(System.in);

        int [][] arr1 = new int[4][4];
        int count = 0;
        

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                arr1[i][j] = sc.nextInt();        
            }
        }

        // 5의 배수를 출력
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(arr1[i][j] %5==0){
                    count++;
                }  
            }
        }
        System.out.println(count);
        
    }
}