import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 격자 크기
        int T = sc.nextInt(); // 시간
        // 구슬 위치 초기 정보
        int R = sc.nextInt(); // Row
        int C = sc.nextInt(); // Column
        char D = sc.next().charAt(0); // 이동방향 UDRL
        // Please write your code here.

        // 이동방향 매핑
        int[] dx = new int[]{0, 1, 0,  -1};
        int[] dy = new int[]{1, 0,  -1, 0};

        // 좌표 보정
        int x = R-1;
        int y = C-1; 
        int  moveDir = getDir(D);

        for(int i=0; i<T; i++){
            int nx = x + dx[moveDir];
            int ny = y + dy[moveDir];
            // 범위가 넘는지 비교, 범위를 넘을때 실행
            if(!inRange(nx,ny,N)){
                moveDir = (moveDir+2) % 4; // 반대쪽 방향으로 변경
                continue; // 방향전환시에는 방향만 전환하고 이동하지 않음
            }

            x = nx;
            y = ny;
        }

        x = x + 1;
        y = y + 1;

        System.out.print(x + " " + y);

    }

    // 배열 범위 초과 감지 
    public static boolean inRange(int x, int y, int N) {
        return (0 <= x && x < N && 0 <= y && y < N);
    }

    // 방향 숫자 매핑 매세드
    public static int getDir(char a) {
        if(a == 'R'){
            return 0;
        }else if(a == 'D'){
            return 1;
        }else if(a == 'L'){
            return 2;
        }else if(a == 'U'){
            return 3;
        }
        return -1;
    }
}    