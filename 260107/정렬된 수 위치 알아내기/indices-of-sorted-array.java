import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        order[] orders = new order[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            orders[i] = new order(i+1,arr[i]);
        }
        // Please write your code here.

        Arrays.sort(orders);
        
        for (order s : orders) {
            System.out.printf("%d ", s.seq);
        }
    }
}

class order implements Comparable<order> {
        int seq; // 순서
        int num; // 숫자

        order(int seq, int num) {
            this.seq = seq;
            this.num = num;
        }

        @Override
        public int compareTo(order o) {
            if(this.num == o.num){
                return this.seq - o.seq;
            }
            return this.num - o.num; 
            
        }
};