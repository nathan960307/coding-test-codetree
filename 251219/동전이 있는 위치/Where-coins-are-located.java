import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 격자의 크기
        int m = sc.nextInt(); // 동전의 갯수

        int[][] arr = new int[n+1][n+1]; // 배열 선언
        // int[][] arr = new int[n][m]; // 배열 선언
        // int[][] arr = new int[5][5]; // 배열 선언

        // int count = 1;
        // boolean direct = true;
        for(int i=0; i<m; i++){
            int r = sc.nextInt(); // 행
            int c = sc.nextInt(); // 열
            arr[r][c] = 1;

        }

        // 출력
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println("");
        }

        


    }
}
