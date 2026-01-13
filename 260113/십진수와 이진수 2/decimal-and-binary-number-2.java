import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        // Please write your code here.

        int len = binary.length();
        int answer =0;
        // Please write your code here.

        for(int i=0; i<len; i++){
            int temp = binary.charAt(i) -'0'; // 0을 안빼주면 아스키 코드로 들어가게됨 !주의!
            answer = answer + ((int)Math.pow(2,len-1-i) * temp);

        }

        answer = answer * 17;


        int[] arr = new int[100];
        int count = 0;

        // 나머지만 배열에 저장
        while (answer > 0) {
            arr[count++] = answer % 2;
            answer = answer / 2;
        }


        // 배열의 역순부터 수 출력
        for(int i = count - 1; i >= 0; i--){
            System.out.print(arr[i]);
        }

        
    }
}