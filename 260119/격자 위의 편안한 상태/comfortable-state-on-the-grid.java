import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // 격자 크기
        int m = sc.nextInt(); // 명령 횟수
        
        int[][] points = new int[m][2]; // 색칠해야하는 행과 열이 저장된 배열
        int[][] arr = new int[n][n]; // 색칠을 할 배열;

        // 이동방향 매핑
        int[] dx = new int[]{0, 1, 0,  -1};
        int[] dy = new int[]{1, 0,  -1, 0};

        int x = 0;
        int y = 0;

        int answer = 0;
        
        for (int i = 0; i < m; i++) {
            points[i][0] = sc.nextInt(); // 행
            points[i][1] = sc.nextInt(); // 열
            int r = points[i][0]-1;
            int c = points[i][1]-1;

            arr[r][c] = 1; // 색칠하기

            int count = 0;
            for(int dir=0; dir<=3; dir++){
                int nx = r + dx[dir];
                int ny = c + dy[dir];
                

                if(inRange(nx,ny,n)&&arr[nx][ny]==1){
                    count++;
                }
            }
            
            if(count==3){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }


    }
    // 배열 범위 초과 감지 
    public static boolean inRange(int x, int y, int n) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }
}