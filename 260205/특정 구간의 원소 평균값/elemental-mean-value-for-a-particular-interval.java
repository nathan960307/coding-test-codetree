import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.

        int answer = 0;

        // 시작점
        for (int i = 0; i < n; i++) {
            int sum = 0;

            // 끝점
            for (int j = i; j < n; j++) {
                sum += arr[j];
                int len = j - i + 1;

                // 평균이 정수가 아니면 패스
                if (sum % len != 0) continue;

                int avg = sum / len;

                // 평균이 구간 안에 있는지 확인
                for (int k = i; k <= j; k++) {
                    if (arr[k] == avg) {
                        answer++;
                        break;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}