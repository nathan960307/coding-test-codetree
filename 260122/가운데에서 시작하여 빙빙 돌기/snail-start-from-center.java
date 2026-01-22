import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 행,열
        // Please write your code here.

        // 숫자 배열 생성
        int[][] arr = new int[n][n];

        // 초기 좌표
        int x = n/2; 
        int y = n/2;
        arr[x][y] = 1;
        

        // 이동방향 매핑
        int[] dx = new int[]{0, 1, 0,  -1};
        int[] dy = new int[]{1, 0,  -1, 0};

        int dir = 0; // 오른쪽
        int step = 1;    // 이번 방향에서 이동할 칸 수
        int moved = 0;   // 현재 방향에서 이동한 칸 수
        int turnCnt = 0; // 회전 횟수

        for(int i=2; i<=n*n; i++){
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            x = nx;
            y = ny;
            arr[nx][ny] = i;

            moved++;

            if(moved == step){
                moved = 0;
                dir = (dir -1 + 4) % 4;
                turnCnt++;

                if(turnCnt % 2 ==0){
                    step++;
                }
            }
            
        }

        for(int i = 0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

    }

     // 배열 범위 초과 감지 
    public static boolean inRange(int x, int y, int n, int m) {
        return (0 <= x && x < n && 0 <= y && y < m);
    }
}