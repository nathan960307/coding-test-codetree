import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String commands = sc.next();
        int len = commands.length();

        // 이동방향 매핑
        int[] dx = new int[]{0, 1, 0,  -1};
        int[] dy = new int[]{1, 0,  -1, 0};

        int dir = 3; // 북쪽을 햔한 상태

        int x = 0;
        int y = 0;

        int count = 0;
        int answer = -1;
        for(int i=0; i<len; i++){
            int order = commands.charAt(i);

            if(order == 'L'){
                dir = (dir+1) % 4;
                count++;
            }else if(order == 'R'){
                dir = (dir-1 +4) % 4;
                count++;
            }else if(order == 'F'){
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                x = nx;
                y = ny;
                count++;

                if(x==0 && y==0){
                    System.out.print(count);
                    return;
                }
            }
        }
        System.out.print(answer);
    }
}