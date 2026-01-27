import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt(); // 세로 , 행
        int C = sc.nextInt(); // 가로 , 열
        char[][] grid = new char[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }

        int answer =0;
        int count  =0;

        for(int r1=1; r1<R-2; r1++){ // 첫번째 블록의 행
            for(int c1=1; c1<C-2; c1++){ // 첫번째 블록의 열
                for(int r2=r1+1; r2<R-1; r2++){
                    for(int c2=c1+1; c2<C-1; c2++){
                        if (grid[0][0] != grid[r1][c1] && grid[r1][c1] != grid[r2][c2] && grid[r2][c2] != grid[R-1][C-1]) {
                        count++;   // 경로 하나 발견
                        }
                    }

                }
            }
        }
        System.out.print(count);
        

        
    }
}