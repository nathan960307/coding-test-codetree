import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 주어지는 횟수
        int x = 0, y = 0; 
        int[] dx = new int[]{1,  0, -1, 0};
        int[] dy = new int[]{0, -1,  0, 1};

        for (int i = 0; i < n; i++) {
            char direction = sc.next().charAt(0); // 위치 [W,S,N,E]
            int distance = sc.nextInt(); // 거리
            // Please write your code here.

            if(direction == 'E') {
                x = x + (dx[0] * distance);
                y = y + (dy[0] * distance);
            }
            else if(direction == 'S') {
                x = x + (dx[1] * distance);
                y = y + (dy[1] * distance);
            }
            else if(direction == 'W') {
                x = x + (dx[2] * distance);
                y = y + (dy[2] * distance);
            }
            else if(direction == 'N') {
                x = x + (dx[3] * distance);
                y = y + (dy[3] * distance);
            }
        }

        System.out.print(x + " " + y);
    }
}


