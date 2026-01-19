import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 격자의 크기 
        int[][] arr = new int[n][n]; // 격자 배열 선언
        // 격자 배열 생성
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        
        int answer = 0; // 1이 적혀있는 곳이 3개 이상인 곳
        int x = 0, y = 0;
        int[] dx = new int[]{0, 1,  0, -1};
        int[] dy = new int[]{1, 0, -1,  0};
        
        while(y<n){
            int cnt = 0;
            for(int dirNum = 0; dirNum < 4; dirNum++) {
                
                int nx = x + dx[dirNum];
                int ny = y + dy[dirNum];

                if( inRange(nx, ny, n) && arr[nx][ny] == 1){
                    cnt++;
                }
            }

            if(cnt >=3){
                answer++;
            }

            x++;
            if(x==n){
                x=0;
                y++;
            }
            
        }
        
        System.out.print(answer);

    }
    // 범위 확인 메서드
    public static boolean inRange(int x, int y, int n) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }
}