import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 행
        int m = sc.nextInt(); // 열
        // Please write your code here.
        int[][] answer = new int[n][m]; // n X m 행렬 선언

        answer[0][0] = 1; // 초기값 설정

        //초기 좌표 
        int x = 0;
        int y = 0;

        // 이동방향 매핑
        int[] dx = new int[]{0, 1, 0,  -1};
        int[] dy = new int[]{1, 0,  -1, 0};

        int dir = 0; // 이동 방향

        // 배열 채우기
        for(int i=2; i<=n*m; i++){
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if(inRange(nx,ny,n,m) && answer[nx][ny]==0){ // 범위를 초과하지 않고 다음 값이 방문 했던 장소가 아닌경우
                x = nx;
                y = ny;
            }else{
                dir = (dir+1) % 4 ; // 시계방향으로 90도 방향 회전 
                x = x + dx[dir];
                y = y + dy[dir];
            }

            answer[x][y] = i;
            
        }

        // 배열 출력하기
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }

        
    }

    // 배열 범위 초과 감지 
    public static boolean inRange(int x, int y, int n, int m) {
        return (0 <= x && x < n && 0 <= y && y < m);
    }

    
}