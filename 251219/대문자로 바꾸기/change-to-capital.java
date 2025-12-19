import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt(); // n 입력
        char[][] arr = new char[5][3]; // n 크기의 배열 선언

        // nxn 크기의 배열 생성 및 입력 
        for(int i=0; i<5; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = sc.next().charAt(0);
            }
        }

        for(int i=0; i<5; i++){
            for(int j=0; j<3; j++){
                char answer = Character.toUpperCase(arr[i][j]);
                System.out.print(answer + " ");
            }
            System.out.println("");
        }

    }
}
