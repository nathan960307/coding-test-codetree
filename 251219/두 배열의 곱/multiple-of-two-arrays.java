import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();
        // int m = sc.nextInt();
        int[][] arr1 = new int[3][3]; // 배열 선언
        int[][] arr2 = new int[3][3]; // 배열 선언
        int count =1;

        // nxn 크기의 배열 생성 및 입력 
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                int answer = arr1[i][j] * arr2[i][j];
                System.out.print(answer + " ");
            }
            System.out.println("");
        }

        


    }
}
