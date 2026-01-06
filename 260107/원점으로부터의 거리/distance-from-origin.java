import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] points = new int[n][2];
        order[] orders = new order[n+1];
        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();

            int distance = Math.abs(points[i][0]) + Math.abs(points[i][1]);
            orders[i+1] = new order(i+1,distance);
        }
        // Please write your code here.

        Arrays.sort(order);
        
        for (order s : orders) {
            System.out.printf("%d \n", s.num);
        }
    }
}

class order implements Comparable<order> {
        int num;
        int distance;

        order(int num, int distance) {
            this.num = num;
            this.distance = distance;
        }

        @Override
        public int compareTo(order o) {
            if(this.distance == o.distance){
                return this.num - o.num;
            }
            return o.distance - this.distance; 
            
        }
};