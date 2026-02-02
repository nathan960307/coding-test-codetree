import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[19][19];
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int answer = 0;
        int[] dx = {0, 1, 1, -1};
        int[] dy = {1, 0, 1, 1};



        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {

                if (arr[i][j] == 0){ // 돌이 없는 경우 
                    continue; 
                }

                int color = arr[i][j]; // 현재 돌 색상

                for (int d = 0; d < 4; d++) {   // 방향 포문

                    int pi = i - dx[d]; // 이전 행
                    int pj = j - dy[d]; // 이전 열
                    if (inRange(pi, pj) && arr[pi][pj] == color){ // 범위 안이 이전 돌이 같은 색인 경
                        continue;
                    }

                    int cnt = 1;
                    int nx = i + dx[d];
                    int ny = j + dy[d];

                    while (inRange(nx, ny) && arr[nx][ny] == color) { // 범위 안이고 다음 돌이 같은 색상이
                        cnt++;
                        nx += dx[d];
                        ny += dy[d];
                    }

                    if (cnt == 5) {
                        System.out.println(color);
                        System.out.println((i + 1) + " " + (j + 1));
                        return;
                    } 

                }


                
            }
        }
        System.out.println(0);
    }
    // 범위 체크 함수
    static boolean inRange(int x, int y) {
        return 0 <= x && x < 19 && 0 <= y && y < 19;
    }

}