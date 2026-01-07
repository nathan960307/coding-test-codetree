import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        order[] orders = new order[n];
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            orders[i] = new order(i+1,num);
        }
        // Please write your code here.

        // 정렬
        Arrays.sort(orders);
        
        // 정답 배열 선언 및 초기
        int[] answers = new int[n];

        for(int i=0; i<n; i++){
            answers[orders[i].seq-1] = i+1; // 원래 위치에 정렬후 위치를 매핑
        }

        for (int a : answers) {
            System.out.printf("%d ", a);
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