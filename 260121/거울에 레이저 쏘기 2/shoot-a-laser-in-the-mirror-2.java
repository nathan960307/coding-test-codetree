import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 격자 크기
        char[][] grid = new char[n][n]; // 격자 배열 생성

        // 격자 배열에 거울 배치
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < n; j++) {
                grid[i][j] = s.charAt(j);
            }
        }

        // 이동방향 매핑
        int[] dx = new int[]{0, 1, 0,  -1};
        int[] dy = new int[]{1, 0,  -1, 0};
        int dir = 0; // 이동방향 선언

        // 시작좌표
        int x=0;
        int y=0;

        //
        int count = 0;

        // 시작 지점
        int startNum = sc.nextInt();

        // 시작 좌표 찾기
        if(startNum >= 1 && startNum <=n){ // 상단
            dir = 1; // 시작방향
            // 시작 좌표
            x =0; // x 좌표(0행을 고정)
            y = startNum -1; // y 좌표(열은 변경)
        }else if(startNum >= n+1 && startNum <= 2*n){ // 우측
            dir = 2;// 시작방향
            // 시작 좌표
            x = startNum -(n+1);
            y = n-1; // 고정
        }else if(startNum >= 2*n+1&& startNum <= 3*n){ // 하단
            dir = 3;// 시작방향
            // 시작 좌표
            x = n-1; // 마지막행 고정
            y = 3*n - startNum;
        }else if(startNum >=3*n+1 && startNum <= 4*n){ // 좌측
            dir = 0;// 시작방향
            // 시작 좌표
            x = 4*n - startNum;
            y = 0; // 고정
        }


        while(true){

            // 거울 이동
            if(grid[x][y]=='/'){
                count++;
                if(dir==0){ // 우로 이동
                    dir = 3;
                }else if(dir==1){ // 하단 이동
                    dir = 2;
                }else if(dir==2){ // 좌로 이동
                    dir = 1;
                }else if(dir==3){ // 상단 이동
                    dir = 0;
                }
            }else if(grid[x][y]=='\\'){
                count++;
                if(dir==0){ // 우로 이동
                    dir = 1;
                }else if(dir==1){ // 하단 이동
                    dir = 0;
                }else if(dir==2){ // 좌로 이동
                    dir = 3;
                }else if(dir==3){ // 상단 이동
                    dir = 2;
                }
            }

        
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if(inRange(nx,ny,n)){ // 범위 내인 경우
                x = nx;
                y = ny;
            }else{ // 범위 외인 경우
                break;
            }
        }

        System.out.print(count);
    }

    // 배열 범위 초과 감지 
    public static boolean inRange(int x, int y, int n) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }
}