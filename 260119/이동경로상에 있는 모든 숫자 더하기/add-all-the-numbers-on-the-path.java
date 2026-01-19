import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 격자 크기
        int t = sc.nextInt(); // 명령 횟수
        String commands = sc.next(); // LRF
         
        

        // 이동방향 매핑
        int[] dx = new int[]{0, 1, 0,  -1};
        int[] dy = new int[]{1, 0,  -1, 0};
        int dir = 3;

        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int x = n / 2;
        int y = n / 2;
        int count = board[x][y];


        for(int i=0; i<t; i++){
            int order = commands.charAt(i);

            if(order=='L'){
                dir = (dir-1 + 4) %4;
            }else if(order=='R'){
                dir = (dir +1) %4;
            }else if(order=='F'){
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if(inRange(nx,ny,n)){
                    x = nx;
                    y = ny;
                    count = count + board[x][y];
                }
                
            }
        }

        System.out.print(count);

    }

    // 배열 범위 초과 감지 
    public static boolean inRange(int x, int y, int n) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }
}