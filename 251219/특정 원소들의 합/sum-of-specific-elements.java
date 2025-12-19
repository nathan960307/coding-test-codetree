import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt(); // n 입력
        int[][] arr = new int[4][4]; // n 크기의 배열 선언
        int sum = 0;

        // nxn 크기의 배열 생성 및 입력 
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<4; i++){
            for(int j=0; i<i+1){
                sum = sum + arr[i][j];
            }
        }

        System.out.print(sum);


    }
}
