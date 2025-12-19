import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m]; // 배열 선언
        int count =1;

        // nxn 크기의 배열 생성 및 입력 
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = count;
                count++;
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

        


    }
}
