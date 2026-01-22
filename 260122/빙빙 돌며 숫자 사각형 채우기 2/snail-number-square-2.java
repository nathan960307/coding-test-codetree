import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 행
        int m = sc.nextInt(); // 열
        // Please write your code here.

        // 숫자 배열 생성
        int[][] arr = new int[n][m];

        // 초기 좌표
        int x = 0; 
        int y = 0;
        arr[0][0] = 1;
        

        // 이동방향 매핑
        int[] dx = new int[]{0, 1, 0,  -1};
        int[] dy = new int[]{1, 0,  -1, 0};

        int dir = 1; // 아래 쪽

        for(int i=2; i<=n*m; i++){
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if(inRange(nx,ny,n,m) && arr[nx][ny]==0){ // 범위를 초과하지 않고 다음 장소가 방문한 장소가 아니라면
                x = nx;
                y = ny;
            }else if(!inRange(nx,ny,n,m) || arr[nx][ny]!=0 ){ // 범위를 초과하거나 방문한 장소인 경우
                dir = (dir-1+4) %4; // 반시계 방향으로 회전
                x = x + dx[dir];
                y = y + dy[dir];

            }
            arr[x][y] = i;
        }

        for(int i = 0; i<n; i++){
            for(int j=0; j<m; j++){
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