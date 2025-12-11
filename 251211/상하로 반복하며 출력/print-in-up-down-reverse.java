import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
         Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [][] arr1 = new int[n][n];

        for(int i=0; i<n; i++){
            
            int start = 1;
            
            if(i%2==0){ // 짝수 행인 경우
                for(int j=0; j<n; j++){
                arr1[i][j] = start;
                start ++;
                }
            }else{ // 홀수 행인 경우
                for(int j=n-1; j>=0; j--){
                       arr1[i][j] = start;
                       start ++;
                }
            }   
        }

        // 출력문
        for(int k=0; k<n; k++){
            for(int p=0; p<n; p++){
                System.out.print(arr1[k][p]);
            }
            System.out.println("");
        }
    }
}