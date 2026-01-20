import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 이동방향 매핑
            int[] dx = new int[]{0, 1, 0,  -1};
            int[] dy = new int[]{1, 0,  -1, 0};
            

            int x = 0;
            int y = 0;

            int answer = -1;
            int count =0;

        for(int i = 0; i < n; i++){
            char dir = sc.next().charAt(0); // 방향 WSNE
            int dist = sc.nextInt(); // 이동거리

            int direction = getDir(dir);

            for(int j=0; j<dist; j++){
                x = x + dx[direction];
                y = y + dy[direction];
                count++;

                if(x==0 && y==0){
                    answer = count;
                    System.out.print(answer);
                    return;
                }else{
                    continue;
                }
            }

            
        }
        System.out.print(answer);
        
    }

    // 방향 숫자 매핑 매세드
    public static int getDir(char a) {
        if(a == 'E'){
            return 0;
        }else if(a == 'S'){
            return 1;
        }else if(a == 'W'){
            return 2;
        }else if(a == 'N'){
            return 3;
        }
        return -1;
    }
}