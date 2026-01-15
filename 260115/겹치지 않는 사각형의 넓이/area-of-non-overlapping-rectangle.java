import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] s = new int[2001][2001]; // 사각형 표시 배열 
        int offset = 1000; // 음수 보정 오프셋
        int count = 0;

        // 직사각형 A 좌표
        int ax1 = sc.nextInt() + offset;
        int ay1 = sc.nextInt() + offset;
        int ax2 = sc.nextInt() + offset;
        int ay2 = sc.nextInt() + offset;

        // 직사각형 A 
        for(int i=ax1; i<ax2; i++){
            for(int j=ay1; j<ay2; j++){
                s[i][j] = 1;
            }
        }

        // 직사각형 B 좌표
        int bx1 = sc.nextInt() + offset;
        int by1 = sc.nextInt() + offset;
        int bx2 = sc.nextInt() + offset;
        int by2 = sc.nextInt() + offset;

        // 직사각형 B
        for(int i=bx1; i<bx2; i++){
            for(int j=by1; j<by2; j++){
                s[i][j] = 1;
            }
        }

        // 직사각형 M 좌표
        int mx1 = sc.nextInt() + offset;
        int my1 = sc.nextInt() + offset;
        int mx2 = sc.nextInt() + offset;
        int my2 = sc.nextInt() + offset;
        // Please write your code here.

        // 직사각형 M
        for(int i=mx1; i<mx2; i++){
            for(int j=my1; j<my2; j++){
                s[i][j] = 0;
            }
        }


        for(int i=0; i<2001; i++){
            for(int j=0; j<2001; j++){
                if(s[i][j] == 1){
                    count++;
                }
            }
        }

        System.out.print(count);


    }
}