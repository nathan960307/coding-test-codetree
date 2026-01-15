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

        // 겹치는 영역
        int ox1 = Math.max(ax1, bx1);
        int oy1 = Math.max(ay1, by1);
        int ox2 = Math.min(ax2, bx2);
        int oy2 = Math.min(ay2, by2);

        // 1. 안 겹치면 A 전체
        if (ox1 >= ox2 || oy1 >= oy2) {
            System.out.println((ax2 - ax1) * (ay2 - ay1));
            return;
        }

        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;

        boolean exist = false;

        // 위 조각
        if (oy2 < ay2) {
            exist = true;
            minX = Math.min(minX, ax1);
            maxX = Math.max(maxX, ax2);
            minY = Math.min(minY, oy2);
            maxY = Math.max(maxY, ay2);
        }

        // 아래 조각
        if (oy1 > ay1) {
            exist = true;
            minX = Math.min(minX, ax1);
            maxX = Math.max(maxX, ax2);
            minY = Math.min(minY, ay1);
            maxY = Math.max(maxY, oy1);
        }

        // 왼쪽 조각
        if (ox1 > ax1) {
            exist = true;
            minX = Math.min(minX, ax1);
            maxX = Math.max(maxX, ox1);
            minY = Math.min(minY, oy1);
            maxY = Math.max(maxY, oy2);
        }

        // 오른쪽 조각
        if (ox2 < ax2) {
            exist = true;
            minX = Math.min(minX, ox2);
            maxX = Math.max(maxX, ax2);
            minY = Math.min(minY, oy1);
            maxY = Math.max(maxY, oy2);
        }

        // 2. 전부 가려진 경우
        if (!exist) {
            System.out.println(0);
        } else {
            System.out.println((maxX - minX) * (maxY - minY));
        }
    }
}
