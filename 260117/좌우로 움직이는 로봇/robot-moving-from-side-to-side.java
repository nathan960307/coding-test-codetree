// 시간 0에서 같은 위치인 경우를 제외 하고 이 후 시간들 중에서 두 로봇이 같은 시간에 같은 위치가 되는 순간을 센다
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 로봇 A가 움직이는 횟수
        int m = sc.nextInt(); // 로봇 B가 움직이는 횟수

        int[] a = new int[1000001];
        int[] b = new int[1000001];

        int a_time =0 ;
        int b_time = 0;
        int a_index = 0;
        int b_index = 0;

        int answer = 0;
        
        // 로봇 A의 움직임
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0); // L R
            // Please write your code here.

            for(int j=0; j<t; j++){
                a_time++;
                if(d=='L'){
                    a_index--;
                }else if(d=='R'){
                    a_index++;
                }

                a[a_time] = a_index;
            }

            
        }
        
        // 로봇 B의 움직임
        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            // Please write your code here.

            for(int j=0; j<t; j++){
                b_time++;
                if(d=='L'){
                    b_index--;
                }else if(d=='R'){
                    b_index++;
                }

                b[b_time] = b_index;
            }
        }

        int limit = Math.max(a_time,b_time);

        // 짧은 쪽을 마지막 위치로 채우기
        for (int i = a_time + 1; i <= limit; i++) {
            a[i] = a[a_time];
        }

        for (int i = b_time + 1; i <= limit; i++) {
            b[i] = b[b_time];
        }

        for(int i=1; i<=limit; i++){
            if(a[i]==b[i] && a[i-1] !=b[i-1] ){
                answer++;
            }
        }

        System.out.print(answer);
        
        // Please write your code here.
        
    }
}