import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ax1 = sc.nextInt();
        int ay1 = sc.nextInt();
        int ax2 = sc.nextInt();
        int ay2 = sc.nextInt();

        int bx1 = sc.nextInt();
        int by1 = sc.nextInt();
        int bx2 = sc.nextInt();
        int by2 = sc.nextInt();

        int answer;

        int ox1 = Math.max(ax1, bx1);
        int ox2 = Math.min(ax2, bx2);
        int oy1 = Math.max(ay1, by1);
        int oy2 = Math.min(ay2, by2);

        // 1. 안 겹치는 경우
        if (ox1 >= ox2 || oy1 >= oy2) {
            answer = (ax2 - ax1) * (ay2 - ay1);
        }

        // 2. 위만 남는 경우
        else if (by2 < ay2 && by1 <= ay1 && bx1 <= ax1 && bx2 >= ax2) {
            answer = (ax2 - ax1) * (ay2 - by2);
        }

        // 3. 아래만 남는 경우
        else if (by1 > ay1 && by2 >= ay2 && bx1 <= ax1 && bx2 >= ax2) {
            answer = (ax2 - ax1) * (by1 - ay1);
        }

        // 4. 왼쪽만 남는 경우
        else if (bx1 > ax1 && bx2 >= ax2 && by1 <= ay1 && by2 >= ay2) {
            answer = (bx1 - ax1) * (ay2 - ay1);
        }

        // 5. 오른쪽만 남는 경우
        else if (bx2 < ax2 && bx1 <= ax1 && by1 <= ay1 && by2 >= ay2) {
            answer = (ax2 - bx2) * (ay2 - ay1);
        }

        // 6. 그 외 (중앙 파먹기, 여러 조각 남는 경우 등)
        else {
            answer = (ax2 - ax1) * (ay2 - ay1);
        }

        System.out.println(answer);
    }
}
