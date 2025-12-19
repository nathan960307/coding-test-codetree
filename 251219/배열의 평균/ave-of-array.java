import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt(); // n 입력
        int[][] arr = new int[2][4]; // n 크기의 배열 선언

        
        int[] row_sum = new int[2];
        int[] column_sum = new int[4];
        int sum = 0;

        // nxn 크기의 배열 생성 및 입력 
        for(int i=0; i<2; i++){
            for(int j=0; j<4; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // 합계 구하기
        for(int i=0; i<2; i++){
            for(int j=0; j<4; j++){
                sum = sum + arr[i][j]; // 전체 합
                column_sum[j] += arr[i][j]; // 열의 값
                row_sum[i] += arr[i][j]; // 행의 값
            }
        }

        for(int i=0; i<2; i++){
            double answer = (double)row_sum[i] /4 ;
            System.out.printf("%.1f ",answer);
        }
        System.out.println("");

        for(int i=0; i<4; i++){
            double answer = (double)column_sum[i] /2 ;
            System.out.printf("%.1f ",answer);
        }
        System.out.println("");


        System.out.printf("%.1f",(double)sum /8);

    }
}
