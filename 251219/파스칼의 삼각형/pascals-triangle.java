import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // int m = sc.nextInt();

        // int[][] arr1 = new int[n][n]; // 배열 선언
        // int[][] arr = new int[n][m]; // 배열 선언
        int[][] arr = new int[n][n]; // 배열 선언

        int count = 1;
        // boolean direct = true;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j || j==0){
                    arr[i][j] = 1;
                }else if(i<j){
                    arr[i][j] = 0;
                }else{
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
            }
        }


        // 출력
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i>=j){
                    System.out.print(arr[i][j]+ " ");
                }else{
                    arr[i][j] = 0;
                }
                
            }
            System.out.println("");
        }

        


    }
}
