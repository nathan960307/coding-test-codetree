import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); // L F R 로 이루어진 명령어
        int len = s.length(); // 명렬어 길이

        int dirNum = 3; // 방향
        int x = 0, y = 0; // 기준 좌표
        int[] dx = new int[]{1,  0, -1, 0};
        int[] dy = new int[]{0, -1,  0, 1};
        

        for(int i=0; i<len; i++){
            char order = s.charAt(i);
            if(order == 'L'){ // 왼쪽으로 90도 방향전환
                dirNum = (dirNum -1 +4) % 4; // 방향 전환
            }else if(order == 'R'){ // 오른쪽으로 90도 방향전환
                dirNum = (dirNum + 1) % 4; // 방향 변경
            }else if(order == 'F'){ // 바라보는 방향으로 한칸 이동
                x = x + dx[dirNum];
                y = y + dy[dirNum];
            }

        }
        System.out.print(x + " " + y);
    }
}