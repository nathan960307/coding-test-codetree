import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // a가 이동하는 횟수
        int m = sc.nextInt(); // b가 이동하는 횟수
        int[][] a = new int[n][2]; // a의 속도, 시간을 담는 배열
        int[][] b = new int[m][2]; // b의 속도, 시간을 담는 배열

        int[] a_time = new int[1_000_001]; // a의 시간별 위치를 담는 배열
        int[] b_time = new int[1_000_001]; // b의 시간별 위치를 담는 배열
        int a_index=0;
        int b_index=0;

        int answer = 1; // 선두가 바뀐 횟수, 1초일때 한번 올라가기 때문에 1로 초기화


        
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt(); // 속도
            a[i][1] = sc.nextInt(); // 시간
            int v = a[i][0];
            int time = a[i][1];
            for(int j=0; j<time; j++){
                a_index++;
                a_time[a_index] = a_time[a_index-1]+ v;
            }
        }

        for (int i = 0; i < m; i++) {
            b[i][0] = sc.nextInt(); // 속도
            b[i][1] = sc.nextInt(); // 시간
            int v = b[i][0];
            int time = b[i][1];
            for(int j=0; j<time; j++){
                b_index++;
                b_time[b_index] = b_time[b_index-1]+ v;
            }
        }

        int limit = Math.max(a_index,b_index);

        // 짧은 쪽을 마지막 위치로 채우기
        for (int i = a_index + 1; i <= limit; i++) {
            a_time[i] = a_time[a_index];
        }

        for (int i = b_index + 1; i <= limit; i++) {
            b_time[i] = b_time[b_index];
        }

        int prev; // 0 : 선두 동일, 1 : a가 선두 2 : b가 선두

        // 1초 상태로 prev 초기화
        if (a_time[1] > b_time[1]){
            prev = 1;
        }else if(a_time[1] < b_time[1]){
            prev = 2;
        }else{
            prev = 0;
        }
         


        for(int i=2; i<=limit; i++){
            int cur = 0;

            if(a_time[i] > b_time[i]){
                cur = 1;
            }else if(a_time[i] < b_time[i]){
                cur = 2;
            }else if(a_time[i] == b_time[i]){
                cur = 0;
            }

            if(cur!=prev){ // 이전과 현재가 상태가 다른경우
                answer++; 
            }

            prev = cur;
        }

        // answer 출력
        System.out.print(answer);


    }
}