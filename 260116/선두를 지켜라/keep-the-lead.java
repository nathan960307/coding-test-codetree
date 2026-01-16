import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // a가 속도 및 시간을 변경한 횟수
        int m = sc.nextInt(); // b가 속도 및 시간을 변경한 횟수

        int[][] A = new int[n][2];
        int max_time = 0;
        for (int i = 0; i < n; i++) {
            A[i][0] = sc.nextInt(); // 속도
            A[i][1] = sc.nextInt(); // 시간
            max_time = max_time + A[i][1];
        }

        int[] a_time = new int[max_time+1];
        int a_index = 0;

        for(int i=0; i<n; i++){
            
            int v = A[i][0];
            int time = A[i][1];

            for(int j=0; j<time; j++){
                a_index++;
                a_time[a_index]= a_time[a_index-1] + v;
            }
        }


        int[][] B = new int[m][2];
        for (int i = 0; i < m; i++) {
            B[i][0] = sc.nextInt(); // 속도
            B[i][1] = sc.nextInt(); // 시간
        }
        
        int[] b_time = new int[max_time+1];
        int b_index = 0;

        for(int i=0; i<m; i++){
            
            int v = B[i][0];
            int time = B[i][1];

            for(int j=0; j<time; j++){
                b_index++;
                b_time[b_index]= b_time[b_index-1] + v;
            }
        }

        int count = 0;
        int prev = 0;

        for(int i=1; i<=max_time; i++){
            int curr;

            if(a_time[i] > b_time[i]){
                curr = 1;
            }else if(a_time[i] < b_time[i]){
                curr = -1;
            }else{
                continue;
            }

            if(prev !=0 && curr != prev){
                count++;
            }

            prev = curr;
        }

        System.out.print(count);

        
    }
}