import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 진수 표기
        int B = sc.nextInt(); // 
        String N = sc.next();
        // Please write your code here.
        // A진수로 표기 된 N 을 B진수로 변경 하기

        // A진수 N 을 10 진수로 변환

        int len = N.length();
        int answer =0;
        // Please write your code here.

        for(int i=0; i<len; i++){
            int temp = N.charAt(i) -'0'; // 0을 안빼주면 아스키 코드로 들어가게됨 !주의!
            answer = answer + ((int)Math.pow(A,len-1-i) * temp);

        }

        // 10진수 N을 B 진수로 변환


        int[] arr = new int[100];
        int count = 0;

        // 나머지만 배열에 저장
        while (answer > 0) {
            arr[count++] = answer % B;
            answer = answer / B;
        }


        // 배열의 역순부터 수 출력
        for(int i = count - 1; i >= 0; i--){
            System.out.print(arr[i]);
        }
    }
}