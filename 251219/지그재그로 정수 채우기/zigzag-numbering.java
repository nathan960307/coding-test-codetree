import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr1 = new int[n][m]; // 배열 선언
        // int[][] arr2 = new int[n][m]; // 배열 선언

        int count = 0;

        for(int j=0; j<m; j++){
            if(j%2==0){ // 짝수 열인 경우
                for(int i=0; i<n; i++){
                    arr1[i][j] = count;
                    count++;
                }
            }else{ // 홀수 열인 경우
                for(int i=n-1; i>=0; i--){
                    arr1[i][j] = count;
                    count++;
                }
            }
        }


        // 출력
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr1[i][j]+ " ");
            }
            System.out.println("");
        }

        


    }
}
