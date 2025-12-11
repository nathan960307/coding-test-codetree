import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
         Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [][] arr1 = new int[n][n];
        int start = 1;

        for(int j=0; j<n; j++){
            if(j%2==0){ // 짝수 열인 경우
                for(int i=0; i<n; i++){
                    arr1[i][j] = start + i;
                }
            }else if(j%2 !=0){ // 홀수 열인 경우
                for(int i=n-1; i>=0; i--){
                    arr1[i][j] = n-i;
                }
            }   
        }

        // 출력문
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr1[i][j]);
            }
            System.out.println("");
        }
    }
}