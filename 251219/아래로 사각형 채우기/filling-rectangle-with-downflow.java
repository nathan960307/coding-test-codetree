import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // int m = sc.nextInt();

        int[][] arr1 = new int[n][n]; // 배열 선언
        // int[][] arr2 = new int[n][m]; // 배열 선언

        int count = 1;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                
                arr1[j][i] = count;
                count++;
            }
        }


        // 출력
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr1[i][j]+ " ");
            }
            System.out.println("");
        }

        


    }
}
