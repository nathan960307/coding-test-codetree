import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 직사각형의 갯수
        int[][] square = new int[201][201]; // 가로세로 100x100 커버 하는 배열 생성
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] y2 = new int[n];

        int offset = 100; // 음수 보정 오프셋
        int answer = 0; // 정답
        
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt() + offset;
            y1[i] = sc.nextInt() + offset;
            x2[i] = sc.nextInt() + offset;
            y2[i] = sc.nextInt() + offset;
        }
        // Please write your code here.

        //직사각형 좌표 표시
        for(int i=0; i<n; i++){
            for(int j=x1[i]; j<x2[i]; j++){
                for(int k=y1[i]; k<y2[i]; k++){
                    square[j][k] = 1;
                }
            }
        }

    
            for(int j=0; j<201; j++){
                for(int k=0; k<201; k++){
                    if(square[j][k] == 1){
                        answer++;
                    }
                }
            }
        

        System.out.print(answer);
    }
}