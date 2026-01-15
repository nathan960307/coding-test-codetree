import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int answer = 0;
        
        int rect1_x1 = sc.nextInt();
        int rect1_y1 = sc.nextInt();
        int rect1_x2 = sc.nextInt();
        int rect1_y2 = sc.nextInt();

        int rect2_x1 = sc.nextInt();
        int rect2_y1 = sc.nextInt();
        int rect2_x2 = sc.nextInt();
        int rect2_y2 = sc.nextInt();
        // Please write your code here.

        int ox1 = Math.max(rect1_x1,rect2_x1);
        int ox2 = Math.min(rect1_x2,rect2_x2);
        int oy1 = Math.max(rect1_y1,rect2_y1);
        int oy2 = Math.min(rect1_y2,rect2_y2);

        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;

        if (ox1 >= ox2 || oy1 >= oy2){
            answer = (rect1_x2 - rect1_x1) * (rect1_y2 - rect1_y1);
        }else{
            // 위쪽 남음
            if (rect2_y2 < rect1_y2) {
                minX = Math.min(minX, rect1_x1);
                maxX = Math.max(maxX, rect1_x2);
                minY = Math.min(minY, oy2);
                maxY = Math.max(maxY, rect1_y2);
            }

            // 아래쪽 남음
            if (rect2_y1 > rect1_y1) {
                minX = Math.min(minX, rect1_x1);
                maxX = Math.max(maxX, rect1_x2);
                minY = Math.min(minY, rect1_y1);
                maxY = Math.max(maxY, oy1);
            }

            // 왼쪽 남음
            if (rect2_x1 > rect1_x1) {
                minX = Math.min(minX, rect1_x1);
                maxX = Math.max(maxX, ox1);
                minY = Math.min(minY, oy1);
                maxY = Math.max(maxY, oy2);
            }

            // 오른쪽 남음
            if (rect2_x2 < rect1_x2) {
                minX = Math.min(minX, ox2);
                maxX = Math.max(maxX, rect1_x2);
                minY = Math.min(minY, oy1);
                maxY = Math.max(maxY, oy2);
            }

            answer = (maxX - minX) * (maxY - minY);
        }

        System.out.print(answer);
    }
}