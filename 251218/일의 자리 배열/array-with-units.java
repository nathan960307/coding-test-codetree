import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int[] arr = new int[11];

        arr[0] = a;
        arr[1] = b;

        // 3번째 항부터 10번째 항까지 추가
        for (int i = 2; i < 10; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 10;
            
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
            
        }

        // 10번째 항 출력
        // System.out.println(arr[10]);
    }
}

