import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();
        // int m = sc.nextInt();

        // int[][] arr1 = new int[n][n]; // 배열 선언
        // int[][] arr = new int[n][m]; // 배열 선언
        int[][] arr = new int[5][5]; // 배열 선언

        int count = 1;
        // boolean direct = true;

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(i==0 || j==0){
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = arr[i-1][j]  + arr[i][j-1] ;
                }
            }
        }


        // 출력
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println("");
        }

        


    }
}
